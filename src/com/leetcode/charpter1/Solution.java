package com.leetcode.charpter1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yy on 2017/3/14.
 */


public class Solution {
    //自己的解法，尚未参考最优秀答案
    public static int[] twoSum(int[] nums, int target) {
//        int f = 0;
//        int s = 0;
//        int sum = 0;
//        int length= nums.length;
//        boolean end =false;
//        for(int i = 0;i<length&&!end;i++){
//            for(int j = 0;j<length;j++){
//                if (i!=j) sum = nums[i]+nums[j];
//                if (sum == target){
//                    f = i;
//                    s =j;
//                    end =true;
//                    break;
//                }
//            }
//        }
//        if (f>s) {
//            int[] temp = {s,f};
//            return temp;
//        }else{
//            int[] temp = {f,s};
//            return temp;
//        }


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
