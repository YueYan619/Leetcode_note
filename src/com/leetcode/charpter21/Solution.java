package com.leetcode.charpter21;

/**
 * Created by yy on 2017/3/15.
 */
//这里创建第二个ListNode的目的是因为指针的问题，如果不创建一个指向原始链表的指针，最后将无法返回链表。注意这个操作的
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 创建一个dummy头，从后面开始接
        ListNode dummy = new ListNode(0);

        //这里创建第二个ListNode的目的是因为指针的问题，如果不创建一个指向原始链表的指针，最后将无法返回链表。注意这个操作的
        ListNode curr = dummy;
        // 依次比较拼接
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        // 把剩余的全拼上去
        if(l1 == null){
            curr.next = l2;
        } else if (l2 == null){
            curr.next = l1;
        }
        return dummy.next;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
