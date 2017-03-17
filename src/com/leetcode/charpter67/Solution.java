package com.leetcode.charpter67;

/**
 * Created by yy on 2017/3/16.
 */
public class Solution {
    public static String addBinary(String a, String b) {
//        String res ="";
//        int i = a.length();
//        int j = b.length();
//        int carr = 0;
//        //计算两个数相差值
//        int cmp = i<j?j-i:i-j;
//
//
//        //在短的那个字符串前补0；
//        for (int index =0;index<cmp;index++){
//            if (i<j){
//                a ="0"+a;
//            }else{
//                b= "0"+b;
//            }
//        }
//
//        int x= a.length();
//        System.out.println("x"+x);
//        while(x>0){
//            x--;
//            if(carr==0){
//                if (a.charAt(x)=='1'&&b.charAt(x)=='1'){
//                    res = "0"+res;
//                    carr = 1;
//                }else if(a.charAt(x)=='0'&&b.charAt(x)=='0'){
//                    res = "0"+res;
//                    carr = 0;
//                }else{
//                    res = "1"+res;
//                    carr = 0;
//                }
//            }else{
//                if (a.charAt(x)=='1'&&b.charAt(x)=='1'){
//                    res = "1"+res;
//                    carr = 1;
//                }else if(a.charAt(x)=='0'&&b.charAt(x)=='0'){
//                    res = "1"+res;
//                    carr = 0;
//                }else{
//                    res = "0"+res;
//                    carr = 1;
//                }
//            }
//            System.out.println("res="+res);
//            System.out.println("carr="+carr);
//            System.out.println(x);
//        }
//
//        if(carr ==1){
//            res = "1"+res;
//        }
//
//
//        return res;



        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
            String a= "1001";
            String b = "1111";
            String s = addBinary(a,b);
        System.out.println("result="+s);


    }
}
