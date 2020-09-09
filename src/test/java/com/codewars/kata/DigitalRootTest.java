package com.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalRootTest {

    @Test
    void attemptTest() {
        assertEquals( 7, new DigitalRoot().attempt(16));
        assertEquals( 6, new DigitalRoot().attempt(456));
    }

    @Test
    void solutionTest() {
        assertEquals( 7, new DigitalRoot().solution(16));
        assertEquals( 6, new DigitalRoot().solution(456));
    }
}