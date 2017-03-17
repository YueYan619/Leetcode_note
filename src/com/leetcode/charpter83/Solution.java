package com.leetcode.charpter83;

/**
 * Created by yy on 2017/3/16.
 */
public class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode m = head;

        while(m!=null&&m.next!=null){
            ListNode t = m.next;
            while(t!=null&&m.val == t.val){
                t = t.next;
            }
            m.next = t;
            m = m.next;
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);

        l1.next = l2;




        l1 = deleteDuplicates(l1);
        System.out.println(l1.val);

    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
