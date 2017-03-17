package com.leetcode.charpter2;

/**
 * Created by yy on 2017/3/14.
 */
public class Solution {
    public static int addTwoNumbers(ListNode l1, ListNode l2) {
        int sum1 = l1.val;
        int sum2 = l2.val;
        while(l1.next !=null){
            l1 = l1.next;
           sum1 = sum1*10+l1.val;

        }
        System.out.println("sum1:"+sum1);
        while(l2.next !=null){
            l2 = l2.next;
            sum2 = sum2*10+l2.val;

        }
        System.out.println("sum2:"+sum2);

        int sum = sum1 + sum2;
        int count =1;
        while(sum/10!=0){
            sum = sum/10;
            count++;
            System.out.println("count="+count);
        }
        ListNode fisrt=null;
        ListNode next=null;
        while(count>0){



        }
        return sum;
    }


    public static void main(String[] args) {


        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        ListNode l21 = new ListNode(2);
        ListNode l22 = new ListNode(2);
        ListNode l23 = new ListNode(2);
        l21.next = l22;
        l22.next = l23;
        l23.next = null;

        int x = addTwoNumbers(l1,l21);
        System.out.println(x);
    }
}

class ListNode{
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
