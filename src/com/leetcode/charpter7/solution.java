package com.leetcode.charpter7;

import java.util.InputMismatchException;

/**
 * Created by yy on 2017/3/14.
 */

/**
 Reverse digits of an integer.

 Example1: x = 123, return 321
 Example2: x = -123, return -321
 */
public class solution {
    public static int reverse(int x) {
//        暴力解法，将输入转换成字符串，逆转字符串并通过parseInt方法转换成long型数字，判断是否抄书int型上下
//                若超出返回0，否则转int返回
        /**
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
         */

        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)//这一步很关键，用来判断是否溢出
            { return 0; }
            result = newResult;
            x = x / 10;
        }

        return result;



    }

    public static void main(String[] args) {
        int x = reverse(-1234123);
        System.out.println("After reverse: "+x);
    }
}
