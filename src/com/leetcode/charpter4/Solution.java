package com.leetcode.charpter4;

/**
 * Created by yy on 2017/3/19.
 */
public class Solution {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x ;
        int y ;
        int length = nums1.length+nums2.length;
        if (length%2==1){
            x = length/2;
            y = x;
        }else{
            x = length/2-1;
            y = length/2;
        }

        int[] temp = new int[y+1];
        int i = 0;
        int j = 0;
        int k = 0;
        while(k<y+1){
            if (i>nums1.length-1) temp[k++] = nums2[j++];
            else if (j>nums2.length-1) temp[k++] = nums1[i++];
            else if (nums1[i]<nums2[j]) temp[k++] = nums1[i++];
            else  temp[k++] = nums2[j++];

        }
        return (double)(temp[x]+temp[y])/2;

    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};
       double x = findMedianSortedArrays(nums1,nums2);
        System.out.println(x);

    }
}
