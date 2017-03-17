package com.leetcode.charpter14;

/**
 * Created by yy on 2017/3/15.
 */

//本题注意点1 特殊输入的排除，例如直接输入null，或者直接输入一个长度为0的数组；如果不处理都将引发空指针错误或者数组越界错误

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        //排除空指针，空数组
        if(strs!=null&&strs.length!=0) {
            String s=null;
            boolean flag = true;
            int index =0;

            //计算最短字符串长度
            int minLen = strs[0].length();
            for (int i=1;i<strs.length;i++){
                if (strs[i].length()<minLen) minLen = strs[i].length();
            }

            //按字符索引开始循环，从0开始
            for (int i=0;i<minLen&&flag;i++){

                char fisrtStringChar = strs[0].charAt(i);

                //按字符串数组索引开始循环，如果当前字符串的第j个字符与第一个字符串的第j个不符，flag设置为TRUE；并记录此时的j值index=j-1;
                for (int j =0;j<strs.length&&flag;j++){
                    if (strs[j].charAt(i)!=fisrtStringChar){
                        flag = false;
                        break;
                    }
                }

                if (flag){
                    index +=1;
                }

            }

            s = strs[0].substring(0,index);

            return s;
        }else{
            return "";
        }

    }


    public static void main(String[] args) {
        String[] strs = {"yueyan","yueyan123","yueya","yue123"};

        String[] strs1 = null;
        String[] strs2 = {"a"};

        String[] strs3 = {"abab","aba",""};
        String common = longestCommonPrefix(strs3);
        System.out.println(common);



    }
}
