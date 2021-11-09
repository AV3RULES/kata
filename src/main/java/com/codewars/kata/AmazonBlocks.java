package com.codewars.kata;

import java.util.Arrays;
import java.util.List;

public class AmazonBlocks {

    public static int score(List<String> blocks) {
        String[] hits = blocks.toArray(new String[0]);
        for (int i = 1; i < hits.length; i++) {
            if (isFailedHit(hits[i])) {
                hits[i - 1] = "0";
                hits[i] = "0";
            }
            if (isX2Hit(hits[i])) {
                hits[i] = String.valueOf(2 * getPreviousHit(hits, i, 1));
            }
            if (isBonusHit(hits[i])) {
                hits[i] = i == 1 ?
                        hits[0] :
                        String.valueOf(getPreviousHit(hits, i, 1) + getPreviousHit(hits, i, 2));
            }
        }
        return Arrays.stream(hits)
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private static int getPreviousHit(String[] hits, int i, int prevIndex) {
        return hits[i - prevIndex].matches("[0-9]") ? Integer.parseInt(hits[i - prevIndex]) : 0;
    }

    private static boolean isFailedHit(String hit) {
        return hit.toUpperCase().equals("Z");
    }

    private static boolean isX2Hit(String hit) {
        return hit.toUpperCase().equals("X");
    }

    private static boolean isBonusHit(String hit) {
        return hit.equals("+");
    }
}
