package com.leetcode.charpter58;

/**
 * Created by yy on 2017/3/15.
 */
public class Solution {
    public static int lengthOfLastWord(String s) {
        if (s==null||s.length()==0) return 0;
        if (s ==" ") return 0;
//        int x =0;
//        String[] strs = s.split(" ");
//        System.out.println("strs.lengt="+strs.length);
//        if (strs.length!=0){
//            x = strs[strs.length-1].length();
//        }else{
//            return 0;
//        }
//
//        return x;
//        if (s==null||s.length()==0) return 0;
//        if (s ==" ") return 0;
//
//lastIndexOf如果找不到则返回-1；
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }

    public static void main(String[] args) {
        String s = "    ";
        System.out.println(s.trim().lastIndexOf(" "));
        int x = lengthOfLastWord(s);
        System.out.println("result x ="+x);

    }
}
