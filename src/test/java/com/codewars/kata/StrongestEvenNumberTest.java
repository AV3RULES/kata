package com.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrongestEvenNumberTest {

    @Test
    void attempt1() {
        assertEquals(2, StrongestEvenNumber.attempt1(1, 2));
        assertEquals(8, StrongestEvenNumber.attempt1(5, 10));
        assertEquals(48, StrongestEvenNumber.attempt1(48, 56));
        assertEquals(192, StrongestEvenNumber.attempt1(129, 193));
    }

    @Test
    void attempt2() {
        assertEquals(2, StrongestEvenNumber.attempt2(1, 2));
        assertEquals(8, StrongestEvenNumber.attempt2(5, 10));
        assertEquals(48, StrongestEvenNumber.attempt2(48, 56));
        assertEquals(192, StrongestEvenNumber.attempt2(129, 193));
        assertEquals(256, StrongestEvenNumber.attempt2(100, 300));
    }

    @Test
    void solution() {
        assertEquals(2, StrongestEvenNumber.solution(1, 2));
        assertEquals(8, StrongestEvenNumber.solution(5, 10));
        assertEquals(48, StrongestEvenNumber.solution(48, 56));
        assertEquals(192, StrongestEvenNumber.solution(129, 193));
    }
}