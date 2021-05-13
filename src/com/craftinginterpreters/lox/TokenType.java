package com.craftinginterpreters.lox;

enum TokenType {
    // Single-character tokens.
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, MINUS, PLUS, COLON, SEMICOLON, SLASH, ASTR,

    // One or two character tokens.
    BANG, BANG_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL, OR,

    // Literals.
    IDENTIFIER, STRING, INT,

    // Keywords.
    AND, AMP, ELSE, FALSE, FUN, IF, PRINT,
    RETURN, TRUE, WHILE, BOOLTY, INTTY, FREE, MALLOC, GOTO,

    EOF
}