package com.codewars.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DirReduction {

    public static String[] dirReduc(String[] arr) { // https://www.codewars.com/kata/550f22f4d758534c1100025a/train/java
        List<String> result = new ArrayList<>();
        calculateDirection(result, arr, "NORTH");
        calculateDirection(result, arr, "EAST");
        return result.toArray(String[]::new);
    }

    private static void calculateDirection(List<String> result, String[] directions, String direction) {
        int sum = Arrays.stream(directions)
                .filter(dir -> direction.equals(dir) || convertToOppositeDirection(direction).equals(dir))
                .mapToInt(DirReduction::convertToNumber)
                .sum();
        IntStream.range(0, Math.abs(sum)).forEach(time -> result.add(Integer.signum(sum) == 1 ? direction : convertToOppositeDirection(direction)));
    }

    private static String convertToOppositeDirection(String direction) {
        return "NORTH".equals(direction) ? "SOUTH" : "WEST";
    }

    private static int convertToNumber(String direction) {
        return List.of("NORTH", "EAST").contains(direction) ? 1 : -1;
    }
}
