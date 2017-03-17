package com.leetcode.charpter88;

/**
 * Created by yy on 2017/3/16.
 */
public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int k =0;
        int i = 0;
        int j=0;
        while(k<m+n){
            if (i>m-1) temp[k++] = nums2[j++];
            else if (j>n-1) temp[k++] = nums1[i++];
            else if (nums1[i]<nums2[j]) temp[k++]=nums1[i++];
            else temp[k++]=nums2[j++];
        }
        for (int a =0;a <m+n;a++){
            nums1[a]=temp[a];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7,9,0,0,0,0,0};
        int[] nums2 = {2,4,6,8,10};
        int m = 5;
        int n = 5;
        merge(nums1,m,nums2,n);
        for (int i=0;i< nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
    }
}
