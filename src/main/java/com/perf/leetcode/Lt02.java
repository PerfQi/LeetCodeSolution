package com.perf.leetcode;

import com.perf.leetcode.node.ListNode;

class Lt02 {

    /**
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode headNode = null;
        while (head != null){
            ListNode node = new ListNode(head.val,null);
            if (headNode != null){
                node.next = headNode;
            }
            headNode = node;
            head = head.next;
        }
        return headNode;
    }

    public static ListNode reverseList1(ListNode head) {
        ListNode preNode = null;
        ListNode curNode = head;
        while (curNode != null){
            ListNode tmp = curNode.next;
            curNode.next = preNode;

            preNode = curNode;
            curNode = tmp;
        }
        return preNode;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNode.createListNode(new int[]{1,2,34,4,5});
        ListNode.printListNode(listNode);

        listNode = Lt02.reverseList1(listNode);
        ListNode.printListNode(listNode);
    }
}