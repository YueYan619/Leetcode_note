package com.leetcode.charpter35;

/**
 * Created by yy on 2017/3/15.
 */
public class Solution {
    public static int searchInsert(int[] nums, int target) {
//倒序查找
//        int len = nums.length;
//        int index =len;
//        if (len==0) return 0;
//
//        while(index>0){
//            if(target<=nums[index-1]) index--;
//            else break;
//        }
//
//        return index;

//        二分查找

        int mid;
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            mid = lo + (hi - lo)/ 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target){
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return lo;

    }


    public static void main(String[] args) {
        int[] arr = {1,2};
        int res = searchInsert(arr,0);
        System.out.println("res:"+res);
    }

}
