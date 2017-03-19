package com.leetcode.charpter5;

/**
 * Created by yy on 2017/3/19.
 */
public class Solution {

    /**
     Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

     Example:

     Input: "babad"

     Output: "bab"

     Note: "aba" is also a valid answer.
     Example:

     Input: "cbbd"

     Output: "bb"
     */


    /**
     * 这个方法非常有意思，基本思想是从中间开始扩散像两侧。
     * 判断指针i两侧的变量是否相等，相等的话分别向右向左移动，否则停止。根据指针两侧的j，k指针计算maxLen值
     * 不断调用这个方法update the maxLen value
     * 需要注意的一点是：回文的中间有可能是偶数对称与基数堆成，所以调用两次。
     */
    private int lo, maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i+1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }
}
