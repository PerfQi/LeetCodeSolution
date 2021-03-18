package com.perf.leetcode;

import com.perf.leetcode.node.ListNode;

public class Lt206 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode(-1);
        int moreVal = 0;
        ListNode curNode = newNode;
        while (l1 != null || l2 != null){
            int curSum = moreVal;
            if (l1 != null){
                curSum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null){
                curSum += l2.val;
                l2 = l2.next;
            }
            if (curSum>=10){
                curSum = curSum-10;
                moreVal =1;
            }else {
                moreVal = 0;
            }
            curNode.next = new ListNode(curSum);
            curNode = curNode.next;
        }

        if (moreVal>0){
            curNode.next = new ListNode(moreVal);
        }

        return newNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.createListNode(new int[]{9,9,9,9,9,9,9});
        ListNode.printListNode(l1);
        ListNode l2 = ListNode.createListNode(new int[]{9,9,9,9});
        ListNode.printListNode(l2);
        ListNode node = Lt206.addTwoNumbers( l1,  l2);
        ListNode.printListNode(node);
    }
}
