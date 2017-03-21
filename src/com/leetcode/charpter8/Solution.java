package com.leetcode.charpter8;

/**
 * Created by yy on 2017/3/19.
 */


/**
 * 四步走
 * 1.处理空字符串
 * 2.移除空格
 * 3.处理符号，设置符号位sign
 * 4.处理数据以及溢出
 * 4.1 首先通过字符-'0'得到字符，原理：ACSII码是有顺序的，结果为0-9，溢出break
 * 4.2判断是否溢出，这一步放在最后一步之前，如果最大值除10小于tatal，说明如果继续进行下一步一定会溢出，此时返回最大值
 * 如果等于最大值，同理也会溢出，如果加上个位数后也也大于最大值，也会溢出
 * 最后通过总数乘10加上个位数的到完整的数值，
 * 循环完成后整数乘以标志位结束。
 */

public class Solution {
    public int myAtoi(String str) {
        int index = 0, sign = 1, total = 0;
        //1. Empty string
        if(str.length() == 0) return 0;

        //2. Remove Spaces
        while(str.charAt(index) == ' ' && index < str.length())
            index ++;

        //3. Handle signs
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            sign = str.charAt(index) == '+' ? 1 : -1;
            index ++;
        }

        //4. Convert number and avoid overflow
        while(index < str.length()){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;

            //check if total will be overflow after 10 times and add digit
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = 10 * total + digit;
            index ++;
        }
        return total * sign;
    }
}
