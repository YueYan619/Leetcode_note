package com.leetcode.charpter1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yy on 2017/3/14.
 */
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        Example:
//        Given nums = [2, 7, 11, 15], target = 9,
//
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */


public class Solution {
    //自己的解法，尚未参考最优秀答案
    public static int[] twoSum(int[] nums, int target) {
        /*
         *第一次的思路，暴力解法，两次循环，一次外循环，取一个数，内循环取第二个数
         *判断内外循环不是同一个数且之和为target，则返回数组两个循环下表
         * 此方法非常暴力，最差时间O(n^2),空间复杂度O(1)
         */

        /*
        int f = 0;
        int s = 0;
        int sum = 0;
        int length= nums.length;
        boolean end =false;
        for(int i = 0;i<length&&!end;i++){
            for(int j = 0;j<length;j++){
                if (i!=j) sum = nums[i]+nums[j];
                if (sum == target){
                    f = i;
                    s =j;
                    end =true;
                    break;
                }
            }
        }
        if (f>s) {
            int[] temp = {s,f};
            return temp;
        }else{
            int[] temp = {f,s};
            return temp;
        }
         */


        /*
         *较好解法思路：一共两部
         * 1.循环将整个数组放入hashmap中，数组元素做key，数组下标做value
         * 2.从头开始循环，将target减去数组元素，通过hashmap查看是否含有component元素如果有，取value，返回i与value
         * 此方法时间复杂度O(n+m),第一次将全部数组放入hashmap，第二次通过hasmmap映射查找速度较快。
         */

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] temp = {1,5,3,4};
        int[] result = twoSum(temp,8);
        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
