package com.leetcode.charpter17;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yy on 2017/3/21.
 */
public class Solution {
    public static List<String> letterCombinations(String digits) {


        /**
         * 这是一个暴力的for循环的方法
         * 不过不知道为什么，在leetcode上无法通过传入""的输入，报错为数组越界
         * 这个方法有点笨重，但是理解起来挺容易的
         * 对于其他正常输入，结果正确
         */
//        List<String> list = new ArrayList<>();//用于保存每次循环的结果
//        if(digits == "") {
//            list.add("");
//            System.out.println("返回一个空字符串");
//            return list;
//        }
//        String[] sarr = new String[digits.length()];
//
//        String[] exp = {"","","abc","def","ghi","jkl","mon","pqrs","tuv","wxyz"};
//
//        for(int z = 0;z<digits.length();z++){
//            int index = digits.charAt(z)-'0';
//            sarr[z] = exp[index];
//        }
//
//
//        //list一次添加进所有第一位数字所代表的字母
//        //变量i代表的是digits的位数
//        String s1 = sarr[0];
//        for (int y =0;y<s1.length();y++){
//            list.add(s1.charAt(y)+"");
//        }
//
//        //for循环，安装list.size来循环，从1开始
//        for(int i = 1; i< digits.length();i++){
//            //一次去除list中的字符串，与第i个数字所代表的字母相加，并添加到新的TtemList中，完成循环后将新的TemList付给最外层list
//            String tempStr = exp[digits.charAt(i)-'0'];
//            List<String> tempList = new ArrayList<>();
//
//            for (int j =0;j<list.size();j++){//变量j代表的结果list中的位置
//
//                for (int x = 0;x<tempStr.length();x++){
//                    String s = ""+list.get(j)+tempStr.charAt(x);
//                    tempList.add(s);
//                }
//
//
//            }
//            list = tempList;
//
//
//        }
//        return list;

        /**
         * 这是用一个队列完成的，基本思想是：
         * 首先构造一个数组mapping，下表对应字符串
         * 其次，构造一个linkedlist，同过remove，peek，add三个方法模拟一个队列
         * 首先通过peek方法查看头部的字符串是否等于i
         * 若等于，取出链表头部元素，从mapping中取得字符串循环取出单个字符与头部元素相加，并添加到ans中
         * 继续上述步骤
         */
        LinkedList<String> ans = new LinkedList<String>();
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length()==i){
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        String s = null;
//        List<String> list = letterCombinations(s);
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }\

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer i:list){
            System.out.println(i);
        }
        System.out.println("======");
        int x = list.remove();
        System.out.println(x);

        System.out.println("======");
        for (Integer i:list){
            System.out.println(i);
        }
    }

}
