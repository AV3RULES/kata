package com.codewars.kata;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Slf4j
public class StrongestEvenNumber { // https://www.codewars.com/kata/5d16af632cf48200254a6244/train/java

    public static int attempt1(int n, int m) {
        Stream<Integer> evenNumbers = IntStream.rangeClosed(n, m)
                .parallel()
                .filter(number -> number % 2 == 0)
                .boxed();
        return evenNumbers
                .filter(number -> (Math.log(number) / Math.log(2)) % 1 == 0)
                .max(Comparator.naturalOrder())
                .orElseGet(() ->
                        evenNumbers
                                .collect(Collectors.toMap(Function.identity(), Integer::numberOfTrailingZeros))
                                .entrySet().stream()
                                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                                .map(Map.Entry::getKey)
                                .findFirst()
                                .get());
    }

    public static int attempt2(int n, int m) {
        if (IntStream.rangeClosed(n, m).count() == 2) {
            return getStrongest(n, m);
        }
        int half = (n + m) / 2;
        int strongestLeft = attempt2(n, half);
        int strongestRight = attempt2(half, m);
        return getStrongest(strongestLeft, strongestRight);
    }

    public static int solution(int n, int m) {
        int strong = Integer.highestOneBit(m),  //closest power of two below m
                mask = strong;
        while (strong<n) {
            mask >>= 1;  // >>x (Binary Right Shift Operator) The left operands value is moved right by the number of bits specified by x. if a = 4 = 0100 -> a << 2 will give 2 which is 0010
            strong |= mask;   // a|b bitwise inclusive OR. Compares each bit of its first operand to the corresponding bit of its second operand. If either bit is 1, the corresponding result bit is set to 1. Otherwise, the corresponding result bit is set to 0.
            if(strong>m) strong ^= mask; // a^b bitwise exclusive OR. Compares each bit of both value respectively and set 1 if one of them is 1 and other one is 0.
        }
        return strong;
    }

    private static int getStrongest(int n, int m) {
        int strengthN = Integer.numberOfTrailingZeros(n);
        int strengthM = Integer.numberOfTrailingZeros(m);
        return strengthN >= strengthM ? n : m;
    }
}