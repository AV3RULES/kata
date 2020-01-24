package com.codewars.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MultiplesOf3Or5 { // https://www.codewars.com/kata/514b92a657cdc65150000006/train/java

    public int attempt(int inputNumber) {
        int sum = 0;

        for (int number : getAllNumbers(inputNumber)) {
            if (isMultipleOfThree(number) || isMultipleOfFive(number)) {
                sum = sum + number;
            }
        }

        return sum;
    }

    public int solution(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }

    private List<Integer> getAllNumbers(int inputNumber) {
        List<Integer> numbers = new ArrayList<>();
        while (inputNumber != 0) {
            inputNumber--;
            numbers.add(inputNumber);
        }
        return numbers;
    }

    private boolean isMultipleOfThree(int number) {
        return number%3==0;
    }

    private boolean isMultipleOfFive(int number) {
        return number%5==0;
    }
}
