package com.codewars.kata;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AmazonBlocksTest {

    @Test
    void shouldReturnCorrectScore() {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("8");
        arrayList.add("5");
        arrayList.add("-2");
        arrayList.add("4");
        arrayList.add("Z");
        arrayList.add("X");
        arrayList.add("9");
        arrayList.add("+");
        arrayList.add("+");
        assertEquals(27, AmazonBlocks.score(arrayList));
    }

}