package com.leetcode.charpter38;

/**
 * Created by yy on 2017/3/15.
 */


//1, 11, 21, 1211, 111221,312211 ...
public class Solution {

    public static String countAndSay(int n) {
//        if (n==1) return "1";
//        if (n==2) return "11";
//
//        String res = "";
//        String resFromCountAndSay = countAndSay(n-1)+"";
//        char[] chars = resFromCountAndSay.toCharArray();
//        int len = chars.length;
//        int count=1;
//        for (int i=0;i<len-1;i++){
//
//            if (chars[i+1]==chars[i]) {
//                count++;
//                if (i+1==len-1){
//                    res+=""+count+chars[i];
//                }
//            }
//
//            if (chars[i+1]!=chars[i]){
//                res+=""+count+chars[i];
//                count=1;
//                if (i+1==len-1){
//                    res+=""+count+chars[i+1];
//                }
//            }
//        }
//
//        return  res;

//        if(n == 1){
//            return "1";
//        }
//        //递归调用，然后对字符串处理
//        String str = countAndSay(n-1) + "*";//为了str末尾的标记，方便循环读数
//        char[] c = str.toCharArray();
//        int count = 1;
//        String s = "";
//        for(int i = 0; i < c.length - 1;i++){
//            if(c[i] == c[i+1]){
//                count++;//计数增加
//            }else{
//                s = s + count + c[i];//上面的*标记这里方便统一处理
//                count = 1;//初始化
//            }
//        }
//        return s;


        StringBuilder curr=new StringBuilder("1");
        StringBuilder prev;
        int count;
        char say;
        for (int i=1;i<n;i++){
            prev=curr;
            curr=new StringBuilder();
            count=1;
            say=prev.charAt(0);

            for (int j=1,len=prev.length();j<len;j++){
                if (prev.charAt(j)!=say){
                    curr.append(count).append(say);
                    count=1;
                    say=prev.charAt(j);
                }
                else count++;
            }
            curr.append(count).append(say);
        }
        return curr.toString();
    }
    public static void main(String[] args) {
        String res = countAndSay(6);
        System.out.println(res);
    }
}
