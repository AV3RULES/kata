package com.codewars.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MexicanWave { //https://www.codewars.com/kata/58f5c63f1e26ecda7e000029/train/java

    public static String[] wave(String str) {
        List<String> result = new ArrayList<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String crowd = "";
            for (int j = 0; j < chars.length; j++) {
                String wave = String.valueOf(chars[j]);
                if (!wave.isEmpty() && i == j) {
                    wave = wave.toUpperCase();
                }
                crowd = crowd.concat(wave);
            }
            if (!String.valueOf(crowd.charAt(i)).equals(" ")) {
                result.add(crowd);
            }
        }
        return convertToArrayString(result);
    }

    private static String[] convertToArrayString(List<String> listString) {
        Object[] objArr = listString.toArray();
        return Arrays.copyOf(objArr, objArr.length, String[].class);
    }

    public static String[] solution(String str) {
        return IntStream
                .range(0, str.length())
                .mapToObj(x -> new StringBuilder(str).replace(x, x + 1, String.valueOf(str.charAt(x)).toUpperCase()).toString())
                .filter(x -> !x.equals(str))
                .toArray(String[]::new);
    }
}
