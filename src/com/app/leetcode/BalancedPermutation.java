package com.app.leetcode;


import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class BalancedPermutation {
    public static void main(String[] args) {
        System.out.println(countBalancedPermutations("123"));
    }

    public static int countBalancedPermutations(String num) {

        return getPermutations(num);

    }

    public static int getPermutations(String str) {
        AtomicInteger count = new AtomicInteger();
        permute("", str, count, new HashSet<>());
        return count.intValue();
    }

    private static void permute(String prefix, String remaining, AtomicInteger count, Set<String> result) {
        int n = remaining.length();
        if (n == 0) {
            int evenSum = 0;
            int oddSum = 0;
            for (int i = 0; i < prefix.length(); i++) {
                int intValue = Integer.parseInt(String.valueOf(prefix.charAt(i)));
                if (i % 2 == 0) {
                    evenSum += intValue;
                } else {
                    oddSum += intValue;
                }
            }
            if (evenSum == oddSum) {
                count.incrementAndGet();
            }
            evenSum =0;
            oddSum=0;
        } else {
            for (int i = 0; i < n; i++) {
                permute(
                        prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1),
                        count, result
                );
            }
        }
    }

    public static Set<String> permutations(String str) {
        if (str.isEmpty()) return Set.of("");
        return str.chars()
                .mapToObj(i -> (char)i)
                .flatMap(ch ->
                        permutations(str.replaceFirst(ch.toString(), ""))
                                .stream()
                                .map(s -> ch + s))
                .collect(Collectors.toSet());
    }
}
