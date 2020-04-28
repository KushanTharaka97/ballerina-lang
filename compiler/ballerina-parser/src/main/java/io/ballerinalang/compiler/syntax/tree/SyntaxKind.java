/*
 *  Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package io.ballerinalang.compiler.syntax.tree;

public enum SyntaxKind {

    // Keywords

    PUBLIC_KEYWORD(50, "public"),
    PRIVATE_KEYWORD(51, "private"),
    REMOTE_KEYWORD(52, "remote"),
    ABSTRACT_KEYWORD(53, "abstract"),
    CLIENT_KEYWORD(54, "client"),
    IMPORT_KEYWORD(100, "import"),
    FUNCTION_KEYWORD(101, "function"),
    CONST_KEYWORD(102, "const"),
    LISTENER_KEYWORD(103, "listener"),
    SERVICE_KEYWORD(104, "service"),
    XMLNS_KEYWORD(105, "xmlns"),
    ANNOTATION_KEYWORD(106, "annotation"),
    TYPE_KEYWORD(107, "type"),
    RECORD_KEYWORD(108, "record"),
    OBJECT_KEYWORD(109, "object"),
    VERSION_KEYWORD(110, "version"),
    AS_KEYWORD(111, "as"),
    ON_KEYWORD(112, "on"),
    RESOURCE_KEYWORD(113, "resource"),
    FINAL_KEYWORD(114, "final"),
    SOURCE_KEYWORD(115, "source"),
    WORKER_KEYWORD(117, "worker"),
    PARAMETER_KEYWORD(118, "parameter"),
    FIELD_KEYWORD(119, "field"),

    RETURNS_KEYWORD(200, "returns"),
    RETURN_KEYWORD(201, "return"),
    EXTERNAL_KEYWORD(202, "external"),
    TRUE_KEYWORD(203, "true"),
    FALSE_KEYWORD(204, "false"),
    IF_KEYWORD(205, "if"),
    ELSE_KEYWORD(206, "else"),
    WHILE_KEYWORD(207, "while"),
    CHECK_KEYWORD(208, "check"),
    CHECKPANIC_KEYWORD(209, "checkpanic"),
    PANIC_KEYWORD(210, "panic"),
    CONTINUE_KEYWORD(211,"continue"),
    BREAK_KEYWORD(212,"break"),
    TYPEOF_KEYWORD(213,"typeof"),
    IS_KEYWORD(214, "is"),
    NULL_KEYWORD(215, "null"),
    LOCK_KEYWORD(216, "lock"),
    FORK_KEYWORD(217, "fork"),
    TRAP_KEYWORD(218,"trap"),

    // Type keywords
    INT_KEYWORD(250, "int"),
    BYTE_KEYWORD(251, "byte"),
    FLOAT_KEYWORD(252, "float"),
    DECIMAL_KEYWORD(253, "decimal"),
    STRING_KEYWORD(254, "string"),
    BOOLEAN_KEYWORD(255, "boolean"),
    XML_KEYWORD(256, "xml"),
    JSON_KEYWORD(257, "json"),
    HANDLE_KEYWORD(258, "handle"),
    ANY_KEYWORD(259, "any"),
    ANYDATA_KEYWORD(260, "anydata"),
    NEVER_KEYWORD(261, "never"),
    VAR_KEYWORD(262, "var"),
    MAP_KEYWORD(263,"map"),
    FUTURE_KEYWORD(264, "future"),
    TYPEDESC_KEYWORD(265, "typedesc"),

    // Separators
    OPEN_BRACE_TOKEN(500, "{"),
    CLOSE_BRACE_TOKEN(501, "}"),
    OPEN_PAREN_TOKEN(502, "("),
    CLOSE_PAREN_TOKEN(503, ")"),
    OPEN_BRACKET_TOKEN(504, "["),
    CLOSE_BRACKET_TOKEN(505, "]"),
    SEMICOLON_TOKEN(506, ";"),
    DOT_TOKEN(507, "."),
    COLON_TOKEN(508, ":"),
    COMMA_TOKEN(509, ","),
    ELLIPSIS_TOKEN(510, "..."),
    OPEN_BRACE_PIPE_TOKEN(511, "{|"),
    CLOSE_BRACE_PIPE_TOKEN(512, "|}"),
    AT_TOKEN(513, "@"),
    HASH_TOKEN(514, "#"),

    // Operators
    EQUAL_TOKEN(550, "="),
    DOUBLE_EQUAL_TOKEN(551, "=="),
    TRIPPLE_EQUAL_TOKEN(552, "==="),
    PLUS_TOKEN(553, "+"),
    MINUS_TOKEN(554, "-"),
    SLASH_TOKEN(555, "/"),
    PERCENT_TOKEN(556, "%"),
    ASTERISK_TOKEN(557, "*"),
    LT_TOKEN(558, "<"),
    LT_EQUAL_TOKEN(559, "<="),
    GT_TOKEN(560, ">"),
    EQUAL_GT_TOKEN(561, "=>"),
    QUESTION_MARK_TOKEN(562, "?"),
    PIPE_TOKEN(563, "|"),
    GT_EQUAL_TOKEN(564, ">="),
    EXCLAMATION_MARK_TOKEN(565, "!"),
    NOT_EQUAL_TOKEN(566, "!="),
    NOT_DOUBLE_EQUAL_TOKEN(567, "!=="),
    BITWISE_AND_TOKEN(568, "&"),
    BITWISE_XOR_TOKEN(569, "^"),
    LOGICAL_AND_TOKEN(570, "&&"),
    LOGICAL_OR_TOKEN(571, "||"),
    NEGATION_TOKEN(572, "~"),
    RIGHT_ARROW_TOKEN(573, "->"),

    IDENTIFIER_TOKEN(1000),
    STRING_LITERAL(1001),
    DECIMAL_INTEGER_LITERAL(1002),
    HEX_INTEGER_LITERAL(1003),
    DECIMAL_FLOATING_POINT_LITERAL(1004),
    HEX_FLOATING_POINT_LITERAL(1005),

    // Trivia
    WHITESPACE_TRIVIA(1500),
    END_OF_LINE_TRIVIA(1501),
    COMMENT(1502),
    DOCUMENTATION_LINE(1503),

    // module-level declarations
    IMPORT_DECLARATION(2000),
    FUNCTION_DEFINITION(2001),
    TYPE_DEFINITION(2002),
    SERVICE_DECLARATION(2003),
    MODULE_VAR_DECL(2004),
    LISTENER_DECLARATION(2005),
    CONST_DECLARATION(2006),
    ANNOTATION_DECLARATION(2007),
    XML_NAMESPACE_DECLARATION(2008),

    // Statements
    BLOCK_STATEMENT(1200),
    LOCAL_VAR_DECL(1201),
    ASSIGNMENT_STATEMENT(1202),
    IF_ELSE_STATEMENT(1203),
    ELSE_BLOCK(1204),
    WHILE_STATEMENT(1205),
    CALL_STATEMENT(1206),
    PANIC_STATEMENT(1207),
    RETURN_STATEMENT(1208),
    CONTINUE_STATEMENT(1209),
    BREAK_STATEMENT(1210),
    COMPOUND_ASSIGNMENT_STATEMENT(1211),
    LOCAL_TYPE_DEFINITION_STATEMENT(1212),
    ACTION_STATEMENT(1213),
    LOCK_STATEMENT(1214),
    NAMED_WORKER_DECLARATION(1215),
    FORK_STATEMENT(1216),

    // Expressions
    BINARY_EXPRESSION(1300),
    BRACED_EXPRESSION(1301),
    FUNCTION_CALL(1302),
    QUALIFIED_NAME_REFERENCE(1303),
    MEMBER_ACCESS(1304),
    FIELD_ACCESS(1305),
    METHOD_CALL(1306),
    CHECK_EXPRESSION(1307),
    MAPPING_CONSTRUCTOR(1308),
    TYPEOF_EXPRESSION(1309),
    UNARY_EXPRESSION(1310),
    TYPE_TEST_EXPRESSION(1311),
    BASIC_LITERAL(1312),
    SIMPLE_NAME_REFERENCE(1313),
    TRAP_EXPRESSION(1314),
    LIST_CONSTRUCTOR(1315),

    // Type descriptors
    TYPE_DESC(2000),
    RECORD_TYPE_DESC(2001),
    OBJECT_TYPE_DESC(2002),
    NIL_TYPE_DESC(2003),
    OPTIONAL_TYPE_DESC(2004),
    ARRAY_TYPE_DESC(2005),
    INT_TYPE_DESC(2006),
    BYTE_TYPE_DESC(2007),
    FLOAT_TYPE_DESC(2008),
    DECIMAL_TYPE_DESC(2009),
    STRING_TYPE_DESC(2010),
    BOOLEAN_TYPE_DESC(2011),
    XML_TYPE_DESC(2012),
    JSON_TYPE_DESC(2013),
    HANDLE_TYPE_DESC(2014),
    ANY_TYPE_DESC(2015),
    ANYDATA_TYPE_DESC(2016),
    NEVER_TYPE_DESC(2017),
    VAR_TYPE_DESC(2018),
    SERVICE_TYPE_DESC(2019),
    PARAMETERIZED_TYPE_DESC(2020),

    // Actions
    REMOTE_METHOD_CALL_ACTION(2500),
    BRACED_ACTION(2501),
    CHECK_ACTION(2502),

    // Other
    RETURN_TYPE_DESCRIPTOR(3000),
    REQUIRED_PARAM(3001),
    DEFAULTABLE_PARAM(3002),
    REST_PARAM(3003),
    EXTERNAL_FUNCTION_BODY(3004),
    RECORD_FIELD(3005),
    RECORD_FIELD_WITH_DEFAULT_VALUE(3006),
    TYPE_REFERENCE(3007),
    RECORD_REST_TYPE(3008),
    POSITIONAL_ARG(3009),
    NAMED_ARG(3010),
    REST_ARG(3011),
    OBJECT_FIELD(3012),
    IMPORT_ORG_NAME(3013),
    MODULE_NAME(3014),
    SUB_MODULE_NAME(3015),
    IMPORT_VERSION(3016),
    IMPORT_SUB_VERSION(3017),
    IMPORT_PREFIX(3018),
    SPECIFIC_FIELD(3019),
    COMPUTED_NAME_FIELD(3020),
    SPREAD_FIELD(3021),
    EXPRESSION_LIST_ITEM(3022),
    SERVICE_BODY(3023),
    ANNOTATION(3024),
    METADATA(3025),
    ARRAY_DIMENSION(3026),
    NIL_LITERAL(3027),
    ANNOTATION_ATTACH_POINT(3027),
    FUNCTION_BODY_BLOCK(3028),
    NAMED_WORKER_DECLARATOR(3029),
    EXPRESSION_FUNCTION_BODY(3030),
    DOCUMENTATION_STRING(3031),

    INVALID(4),
    MODULE_PART(3),
    EOF_TOKEN(2),
    LIST(1),
    NONE(0);

    final int tag;
    final String strValue;

    SyntaxKind(int tag, String strValue) {
        this.tag = tag;
        this.strValue = strValue;
    }

    SyntaxKind(int tag) {
        this.tag = tag;
        this.strValue = "";
    }

    public String stringValue() {
        return strValue;
    }
}
