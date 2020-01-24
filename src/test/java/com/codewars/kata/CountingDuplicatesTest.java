package com.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingDuplicatesTest {

    @Test
    void attempt() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String reallyLongStringContainingDuplicatesReturnsThree = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;


        assertEquals(0, CountingDuplicates.attempt("abcde"));
        assertEquals(1, CountingDuplicates.attempt("abcdea"));
        assertEquals(1, CountingDuplicates.attempt("indivisibility"));
        assertEquals(2, CountingDuplicates.attempt("A1a2b2"));
        assertEquals(26, CountingDuplicates.attempt("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        assertEquals(3, CountingDuplicates.attempt(reallyLongStringContainingDuplicatesReturnsThree));
    }

    @Test
    void solution() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String reallyLongStringContainingDuplicatesReturnsThree = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;


        assertEquals(0, CountingDuplicates.solution("abcde"));
        assertEquals(1, CountingDuplicates.solution("abcdea"));
        assertEquals(1, CountingDuplicates.solution("indivisibility"));
        assertEquals(2, CountingDuplicates.solution("A1a2b2"));
        assertEquals(26, CountingDuplicates.solution("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        assertEquals(3, CountingDuplicates.solution(reallyLongStringContainingDuplicatesReturnsThree));
    }
}