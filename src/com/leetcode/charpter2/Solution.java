package com.leetcode.charpter2;

/**
 * Created by yy on 2017/3/14.
 */


/**
 *You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode m = prev;

        int carry = 0;

        while(true){
            if(l1==null&& l2==null&&carry==0) break;
            int temp1 = l1==null?0:l1.val;
            int temp2 = l2==null?0:l2.val;
            int x = temp1+temp2+carry;
            if(x>=10) {
                x = x%10;
                carry = 1;
            }else{
                carry =0;
            }
            m.next = new ListNode(x);
            m = m.next;
            if(l1!= null) l1 = l1.next;
            if(l2!= null) l2 = l2.next;
        }
        return prev.next;
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


//        System.out.println(x);
    }
}

class ListNode{
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
