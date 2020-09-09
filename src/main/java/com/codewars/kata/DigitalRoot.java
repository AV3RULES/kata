package com.codewars.kata;

public class DigitalRoot { // https://www.codewars.com/kata/541c8630095125aba6000c00/train/java

    public int attempt(int inputNumber) {

        String sequence = String.valueOf(inputNumber);

        long count = sequence
                .chars()
                .count();
        int sum = sequence
                .chars()
                .map(Character::getNumericValue)
                .sum();

        return count > 1 ? attempt(sum) : sum;
    }

    public int solution(int number) {
        return (number != 0 && number%9 == 0) ? 9 : number % 9;
    }
}
