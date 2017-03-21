package com.leetcode.charpter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yy on 2017/3/21.
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

 Note: The solution set must not contain duplicate triplets.

 For example, given array S = [-1, 0, 1, 2, -1, -4],

 A solution set is:
 [
 [-1, 0, 1],
 [-1, -1, 2]
 ]
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        int length = nums.length;
        for(int i=0;i<length-2;i++){
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = -nums[i];
            int j=i+1;
            int k = length-1;
            while(j<k){
                if(nums[k]+nums[j]==target){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    res.add(temp);
                    // res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j<k&&nums[j]==nums[j-1]) j++;
                    while (j<k&&nums[k]==nums[k+1]) k--;
                }else if(target<nums[j]+nums[k]){
                    k--;
                }else{
                    j++;
                }
            }

        }

        return res;

    }
}
