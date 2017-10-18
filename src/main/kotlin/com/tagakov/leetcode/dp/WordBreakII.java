package com.tagakov.leetcode.dp;

import java.util.*;

public class WordBreakII {

    private final StringBuilder sb = new StringBuilder();
    private final Map<String, List<String>> cache = new HashMap<>();

    public static void main(String... args) {
        System.out.println(new WordBreakII().wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog")));
    }

    private List<String> wordBreak(String s, List<String> wordDict) {
        if (s.isEmpty()) return null;
        List<String> result = new ArrayList<>();
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                String substring = s.substring(word.length());
                if (!cache.containsKey(substring)) {
                    cache.put(substring, wordBreak(substring, wordDict));
                }
                List<String> strings = cache.get(substring);

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
