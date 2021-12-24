package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author june
 */
public class LongestSubstringWithoutRepeatingChar {
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c) + 1;
            }
            ans = Math.max(ans, i - start + 1);
            map.put(c, i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb") == 3);
        System.out.println(lengthOfLongestSubstring("abba") == 2);
    }
}
