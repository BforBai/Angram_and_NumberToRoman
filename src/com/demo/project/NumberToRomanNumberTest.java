package com.demo.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToRomanNumberTest {

    NumberToRomanNumber ntrm = new NumberToRomanNumber();

    @Test
    void numberToRoman() {
        assertEquals("I", ntrm.numberToRoman(1));
    }

    @Test
    void numberToRoman2(){
        assertEquals("II", ntrm.numberToRoman(2));
    }

    @Test
    void numberToRoman3(){
        assertEquals("C", ntrm.numberToRoman(100));
    }

    @Test
    void numberToRoman4(){
        assertEquals("Invalid Input!", ntrm.numberToRoman(-1));
    }

    @Test
    void numberToRoman5(){
        assertEquals("nulla", ntrm.numberToRoman(0));
    }
}