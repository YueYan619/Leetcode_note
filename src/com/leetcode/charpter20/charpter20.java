package com.leetcode.charpter20;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by yy on 2017/3/15.
 */
public class charpter20 {

        public static boolean isValid(String s) {

            if(s.length()==0||s.length()==1)
                return false;

            Stack<Character> x = new Stack<Character>();

            for(int i=0;i<s.length();i++){

                if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                    x.push(s.charAt(i));
                }else{
                    if(x.size()==0)
                        return false;

                    char top = x.pop();

                    if(s.charAt(i)==')')
                        if(top!='(')
                            return false;

                    if(s.charAt(i)=='}')
                        if(top!='{')
                            return false;

                    if(s.charAt(i)==']')
                        if(top!='[')
                            return false;
                }
            }
            return x.size()==0;
        }


    public static void main(String[] args) {
        String s = "{[}]";
        boolean b = isValid(s);
        System.out.println(b);
    }
}
