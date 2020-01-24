package com.codewars.kata;

import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates { // https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java

    public static int attempt(String text) {
        Set<Character> duplicateCharacters = new HashSet<>();
        for (char textCharacter : text.toCharArray()) {
            if (text.chars().mapToObj(i -> (char) i).map(Character::toLowerCase).filter(i -> i.equals(Character.toLowerCase(textCharacter))).count() > 1) {
                duplicateCharacters.add(Character.toLowerCase(textCharacter));
            }
        }
        return duplicateCharacters.size();
    }

    public static int solution(String text) {
        int ans = 0;
        text = text.toLowerCase();
        while (text.length() > 0) {
            String firstLetter = text.substring(0, 1);
            text = text.substring(1);
            if (text.contains(firstLetter)) ans++;
            text = text.replace(firstLetter, "");
        }
        return ans;
    }
}
