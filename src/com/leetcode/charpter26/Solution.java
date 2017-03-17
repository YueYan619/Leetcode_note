package com.leetcode.charpter26;

import java.util.HashMap;

/**
 * Created by yy on 2017/3/15.
 */
public class Solution {
    public static int removeDuplicates(int[] A) {

        int len = A.length;
        if (len == 0)
            return 0;
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (A[i] == A[i - 1]) {
                continue;
            }else{
                A[count++] = A[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] num = new int[]{1,2,3,4,4,4,5};
        int x = removeDuplicates(num);
        System.out.println(x);
    }

}
