package com.leetcode.charpter9;

/**
 * Created by yy on 2017/3/15.
 */
public class Solution {

    public static boolean isPalindrome(int x) {
        /**
         *
         *  负数不是回访数字
         if (x < 0) {
         return false;
         }

         // 数字逆转后的值，为了不使用溢出采用long
         long reverse = 0;
         int tmp = x;

         // 求逆转后的值
         while (tmp != 0) {
         reverse = reverse * 10 + tmp % 10;
         tmp /= 10;
         }

         // 判断是否是回文数字
         return x == reverse;

         */


        /**
         * 优化方法，首先判断输入是否为负数或者是否以0结尾，返回FALSE；
         * rev是否大于前半段，直到小于活等于时结束，判断rev是否等于前半段或者除10后是否相等，相等则是会文
         */
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12));
    }

}
