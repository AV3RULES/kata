package com.codewars.kata;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class WordValues { //https://www.codewars.com/kata/598d91785d4ce3ec4f000018
    public static int[] nameValue(String[] arr) {
        List<Character> charArray = IntStream.rangeClosed('a', 'z')
                .mapToObj(c -> (char) c).collect(Collectors.toList());
        int[] resultValues = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            int value = 0;
            for (char letter : chars) {
                value = value + charArray.indexOf(letter) + 1;
            }
            resultValues[i] = value * (i + 1);
        }
        return resultValues;
    }

    public static int[] solution(String[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i].chars().filter(e -> e != ' ').map(e -> e - 96).sum() * (i + 1); // https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
        }
        return result;
    }
}