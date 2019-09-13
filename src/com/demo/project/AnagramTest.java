package com.demo.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram testAnagram = new Anagram();

    @Test
    void getAnagram() {

        String s1 = "Mother In Law";
        String s2 = "Hitler Woman";

        assertEquals(true, testAnagram.getAnagram(s1, s2));

        String a1 = "abc";
        String a2 = "a bc";

        assertEquals(true, testAnagram.getAnagram(a1, a2));

        String f1 = "abc";
        String f2 = "a bcc";

        assertEquals(false, testAnagram.getAnagram(f1, f2));

    }
}