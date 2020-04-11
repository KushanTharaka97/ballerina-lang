// Copyright (c) 2019 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
//
// WSO2 Inc. licenses this file to you under the Apache License,
// Version 2.0 (the "License"); you may not use this file except
// in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

import ballerina/log;
import ballerina/runtime;

# Represents the outbound Basic Auth authenticator which is an implementation of the auth:OutboundAuthProvider interface,
# This uses usernames and passwords provided Ballerina configurations to authenticate external endpoints.
# ```ballerina
#  auth:OutboundBasicAuthProvider basicAuthProvider = new({
#      username: "tom",
#      password: "123"
#  });
#  ```
# + credential - `auth:Credential` configurations
public type OutboundBasicAuthProvider object {

    *OutboundAuthProvider;

    public Credential? credential;

    # Provides authentication based on the provided Basic Auth configurations.
    #
    # + credential - Credential configurations
    public function __init(Credential? credential = ()) {
        self.credential = credential;
    }

# Generates a token for Basic authentication.
# ```ballerina
# string|auth:Error token = outboundBasicAuthProvider.generateToken();
# ```
#
# + return - The generated token or else an `auth:Error` if occurred during the validation
    public function generateToken() returns string|Error {
        Credential? credential = self.credential;
        if (credential is ()) {
            runtime:AuthenticationContext? authContext = runtime:getInvocationContext()?.authenticationContext;
            if (authContext is runtime:AuthenticationContext) {
                string? authToken = authContext?.authToken;
                if (authToken is string) {
                    return authToken;
                }
            }
            return prepareError("Failed to generate basic auth token since credential config is not defined and auth token is not defined in the authentication context at invocation context.");
        } else {
            return getAuthTokenForBasicAuth(credential);
        }
    }

    # Inspects the incoming data and generates the token for Basic authentication.
    #
    # + data - Map of the data, which is extracted from the HTTP response.
    # + return - The token as a `string`, an `auth:Error` if occurred when generating the token, or else `()`
    #            if nothing is to be returned
    public function inspect(map<anydata> data) returns string|Error? {
        return ();
    }
};

# Represents Basic Authentication configurations, which is used by the HTTP endpoint.
#
# + username - Username for Basic authentication
# + password - Password for Basic authentication
public type Credential record {|
    string username;
    string password;
|};

# Processes the auth token for Basic Auth.
#
# + credential - `auth:Credential` configurations
# + return - The auth token or else an `auth:Error` if occurred during the validation
function getAuthTokenForBasicAuth(Credential credential) returns string|Error {
    string username = credential.username;
    string password = credential.password;
    if (username == "" || password == "") {
        return prepareError("Username or password cannot be empty.");
    }
    string str = username + ":" + password;
    string token = str.toBytes().toBase64();
    log:printDebug(function () returns string {
        return "Authorization header is generated for basic auth scheme.";
    });
    return token;
}
