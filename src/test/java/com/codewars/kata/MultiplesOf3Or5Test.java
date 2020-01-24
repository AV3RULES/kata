package com.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesOf3Or5Test {

    @Test
    void attemptTest() {
        assertEquals(23, new MultiplesOf3Or5().attempt(10));
        assertEquals(33, new MultiplesOf3Or5().attempt(12));
        assertEquals(78, new MultiplesOf3Or5().attempt(20));
    }

    @Test
    void solutionTest() {
        assertEquals(23, new MultiplesOf3Or5().solution(10));
        assertEquals(33, new MultiplesOf3Or5().solution(12));
        assertEquals(78, new MultiplesOf3Or5().solution(20));
    }
}