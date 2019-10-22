package com.aznag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessQueensTest {

    @Test
    void eightQueens() {
        ChessQueens chessQueens = new ChessQueens();
        String result = chessQueens.EightQueens(new String[] {"(5,1)", "(3,2)", "(1,3)", "(6,4)", "(2,5)", "(8,6)", "(6,7)", "(4,8)"});
        assertEquals("(6,4)", result);
    }
}