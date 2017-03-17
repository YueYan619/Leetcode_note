package com.leetcode.charpter28;

/**
 * Created by yy on 2017/3/15.
 */
public class Solution {
    public static int strStr(String haystack, String needle) {
        if (haystack==null||haystack.length()==0){
            return -1;
        }
        if (needle == null||needle.length()==0){
            return -1;
        }

        int index=-1;
        boolean b = true;
        int length = needle.length();
        char fisrtChar = needle.charAt(0);
        for (int i=0;i<(haystack.length()-length+1)&&b;i++){
            if (haystack.charAt(i)==fisrtChar){
                String temp = haystack.substring(i,i+length);
                if (temp.equals(needle)){
                    index = i;
                    b = false;
                }else{
                    continue;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        String haystack = "zheen";
        String needle = "en";

        int x =strStr(haystack,needle);

        System.out.println(x);
    }

}
