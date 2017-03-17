package com.leetcode.charpter66;

import sun.jvm.hotspot.jdi.ArrayReferenceImpl;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by yy on 2017/3/16.
 */
public class Solution {

    public static int[] plusOne(int[] digits) {
//        int carry = 1;
//        int i;
//        for (i=digits.length-1;i>=0;i--){
//            digits[i]+=1;
//            if(digits[i] >= 10)
//            {
//                digits[i] -= 10;
//                carry = 1;
//            }
//            else
//            {
//                carry = 0;
//                break;
//            }
//        }
//        if (i==-1&&carry==1){
//            int[] res = new int[1+digits.length];
//            res[0]=1;
//            for(int x=0;x<digits.length;x++){
//                res[x+1] = digits[x];
//            }
//
//            return res;
//        }
//        return digits;

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static void main(String[] args) {
        int[] arr1 = {9,9};
        int[] res;
        res = plusOne(arr1);
        System.out.println("result ++++++++++++++++");
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }



}
