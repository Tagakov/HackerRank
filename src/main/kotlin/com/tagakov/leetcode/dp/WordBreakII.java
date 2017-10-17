package com.tagakov.leetcode.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreakII {

    private final StringBuilder sb = new StringBuilder();

    public static void main(String... args) {
        System.out.println(new WordBreakII().wordBreak("abcd", Arrays.asList("a", "abc", "b", "cd")));
    }

    private List<String> wordBreak(String s, List<String> wordDict) {
        if (s.isEmpty()) return null;
        List<String> result = new ArrayList<>();
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                List<String> strings = wordBreak(s.substring(word.length()), wordDict);

                if (strings == null) {
                    result.add(word);
                } else for (String nextPart : strings) {
                    result.add(sb.append(word).append(" ").append(nextPart).toString());
                    sb.delete(0, sb.length());
                }
            }
        }
        return result;
    }
}
