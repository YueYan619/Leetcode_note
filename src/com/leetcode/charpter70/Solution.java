package com.leetcode.charpter70;

/**
 * Created by yy on 2017/3/16.
 */
public class Solution {
    public  int climbStairs(int n) {
        //非递归方式
        if(n==1) return 1;
        if(n==2) return 2;
        int a = 1;
        int b =2;
        int result=0;
        for (int i=3;i<=n;i++){
            result = a+b;
            a = b;
            b=result;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = new Solution().climbStairs(44);
        System.out.println(x);
    }
}
