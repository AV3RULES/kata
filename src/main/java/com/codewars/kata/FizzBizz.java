package com.codewars.kata;

import com.fasterxml.jackson.databind.util.ArrayIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class FizzBizz {

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void solution(int n) {
        IntStream.rangeClosed(1, n)
                .mapToObj(i -> i % 5 == 0 ? (i % 3 == 0 ? "FizzBuzz" : "Fizz") : (i % 3 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
