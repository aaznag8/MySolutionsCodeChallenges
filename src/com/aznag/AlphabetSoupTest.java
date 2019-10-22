package com.aznag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetSoupTest {

    @Test
    void alphabetSoupFun() {
        String result = AlphabetSoup.alphabetSoupFun("building a new string from the sorted char array");
        assertEquals("aaaabcddeeefgghhiiilmnnnoorrrrrrsstttuwy", result);
    }
}