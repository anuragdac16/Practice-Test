package com.app.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TilesPossibilities {

        public int numTilePossibilities(String tiles) {
            Map<Character, Integer> counter = tiles.chars().mapToObj( c -> (char) c).
                    collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));

            return backtrack(counter);
        }

        private int backtrack(Map<Character, Integer> counter) {
            int count = 0;
            for (char ch : counter.keySet()) {
                if (counter.get(ch) > 0) {
                    counter.put(ch, counter.get(ch) - 1);

                    count += 1 + backtrack(counter);
                    counter.put(ch, counter.get(ch) + 1);
                }
            }

            return count;
        }

        public static void main(String[] args) {
            TilesPossibilities  solution = new TilesPossibilities();

            System.out.println(solution.numTilePossibilities("AAB"));      // Output: 8
            System.out.println(solution.numTilePossibilities("AAABBC"));   // Output: 188
            System.out.println(solution.numTilePossibilities("V"));        // Output: 1
        }
    }

