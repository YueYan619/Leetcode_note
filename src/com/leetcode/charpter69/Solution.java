package com.leetcode.charpter69;

/**
 * Created by yy on 2017/3/16.
 */
public class Solution {
    public static int mySqrt(int x) {
//        二分查找法
//        if (x == 0)
//            return 0;
//        int left = 1, right = Integer.MAX_VALUE;
//        while (true) {
//            int mid = left + (right - left)/2;
//            if (mid > x/mid) {
//                right = mid - 1;
//            } else {
//                if (mid + 1 > x/(mid + 1))
//                    return mid;
//                left = mid + 1;
//            }
//        }


        if(x==0) return 0;
        if (x==1) return 1;

        int index=1;
        for (int i=1;i<=x/2;i++){
            if (i<=x/i){
                index = i;
            }else{
                if ((i-1)<=x/(i-1)) break;
            }
        }
        return index;

    }

    public static void main(String[] args) {
        int t = 9;

        int res = mySqrt(2147395600);
        System.out.println(res);


    }
}
