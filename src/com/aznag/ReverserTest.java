package com.aznag;

import com.aznag.Reverser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ReverserTest {

    @Test
    void firstReverse() {
        Reverser reverser = new Reverser();
        String rev = reverser.FirstReverse("code");
        assertEquals("edoc", rev);
    }
}