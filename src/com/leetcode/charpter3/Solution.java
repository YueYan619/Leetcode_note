package com.leetcode.charpter3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yy on 2017/3/19.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        /**
         * the basic idea is, keep a hashmap which stores the characters in string as keys and their positions as values,
         * and keep two pointers which define the max substring.
         * move the right pointer to scan through the string ,
         * and meanwhile update the hashmap.
         * If the character is already in the hashmap,
         * then move the left pointer to the right of the same character last found.
         * Note that the two pointers can only move forward.
         *
         *  简单翻译，这个方法的基本思想是用一个hashmap保存字符串中的字符，同时维护两个指针分别指向不重复字符串的两头
         *  循环时如果遇到一个字符已经存在hashmap中了，则将左指针移动至最新出现的重复元素处，循环完成后根据左右指针计算字符串长度
         */
//        if (s.length()==0) return 0;
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        int max=0;
//        for (int i=0, j=0; i<s.length(); ++i){
//            if (map.containsKey(s.charAt(i))){
//                j = Math.max(j,map.get(s.charAt(i))+1);
//            }
//            map.put(s.charAt(i),i);
//            max = Math.max(max,i-j+1);
//        }
//        return max;

        /**
         * The idea is use a hash set to track the longest substring without repeating characters so far,
         * use a fast pointer j to see if character j is in the hash set or not,
         * if not, great, add it to the hash set, move j forward and update the max length, otherwise,
         * delete from the head by using a slow pointer i until we can put character j to the hash set.
         */

        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return max;

    }
}
