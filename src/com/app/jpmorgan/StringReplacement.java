package com.app.jpmorgan;

public class StringReplacement {

    public static void main(String[] args) {
        String word = "as?b?e?gf";
        String substr = "dbk";

        String result = getSmallestString(word, substr);
        System.out.println(result);
    }


    public static String getSmallestString(String word, String substr) {
        int wordLength = word.length();
        int substrLength = substr.length();

        String result = null;

        // Iterate over all possible starting positions where substr can fit in word
        for (int i = 0; i <= wordLength - substrLength; i++) {
            StringBuilder temp = new StringBuilder(word);

            boolean canReplace = true;

            // Check if substr can fit at position i
            for (int j = 0; j < substrLength; j++) {
                char wordChar = temp.charAt(i + j);
                char substrChar = substr.charAt(j);

                if (wordChar != '?' && wordChar != substrChar) {
                    canReplace = false;
                    break;
                }
            }

            // If substr can fit, replace '?' with substr characters
            if (canReplace) {
                for (int j = 0; j < substrLength; j++) {
                    temp.setCharAt(i + j, substr.charAt(j));
                }

                // Replace remaining '?' with 'a'
                for (int k = 0; k < temp.length(); k++) {
                    if (temp.charAt(k) == '?') {
                        temp.setCharAt(k, 'a');
                    }
                }

                // Update result to the lexicographically smallest string
                if (result == null || temp.toString().compareTo(result) < 0) {
                    result = temp.toString();
                }
            }
        }

        // If no valid replacement was found, return "-1"
        return result == null ? "-1" : result;
    }


}
