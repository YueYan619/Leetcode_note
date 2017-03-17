package com.leetcode.charpter7;

import java.util.InputMismatchException;

/**
 * Created by yy on 2017/3/14.
 */
public class solution {
    public static int reverse(int x) {
        String s = x+"";

        boolean flag  = false;

        if (s.charAt(0)=='-'){
            s = s.substring(1);
            flag = true;

        }
        char[] chars = s.toCharArray();
        int n = chars.length;
        for (int i=0;i<n/2;i++){
            char temp = chars[i];
            chars[i]= chars[n-i-1];
            chars[n-i-1] = temp;
        }

        String s1 = new String(chars);
        if (flag){
            s1 = "-"+s1;
        }

        long resultInt = Long.parseLong(s1);
        if (resultInt>Integer.MAX_VALUE) return 0;
        if (resultInt<Integer.MIN_VALUE) return 0;
        return (int)resultInt;
    }

    public static void main(String[] args) {
        int x = reverse(-1234123);
        System.out.println("After reverse: "+x);
    }
}
