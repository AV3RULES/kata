package com.codewars.kata;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersistentBugger {

    public static int persistence(long n) { // https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
        int times = 0;
        while (String.valueOf(n).length() > 1) {
            n = multiplyDigits(n);
            times++;
        }
        return times;
    }

    private static long multiplyDigits(long number) {
       return String.valueOf(number)
               .chars()
                .mapToObj(c -> c - '0')
                .reduce((result, digit) -> result = result * digit)
                .orElse(0);
    }
}
