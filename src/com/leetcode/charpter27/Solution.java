package com.leetcode.charpter27;

/**
 * Created by yy on 2017/3/15.
 */
public class Solution {

    public static int removeElement(int[] nums, int val) {
        int count=0;

        if (nums==null||nums.length == 0)
            return 0;

        for (int i=0;i<nums.length;i++){
            if (nums[i]==val)
                continue;
            else{
                nums[count++]=nums[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] num = new int[]{1,2,3,4,4,4,5};
        int x = removeElement(num,4);
        System.out.println(x);
        System.out.println("++++++++++++=");
        for (int i = 0;i<num.length;i++){
            System.out.println(num[i]);
        }

    }
}
