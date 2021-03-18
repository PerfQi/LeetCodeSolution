package com.perf.leetcode.node;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode createListNode(int[] array){
        if (array.length == 0){
            return new ListNode();
        }

        ListNode listNode = new ListNode(array[0]);
        ListNode curNode = listNode;
        for (int i=1;i<array.length;i++){
            curNode.next = new ListNode(array[i]);
            curNode = curNode.next;
        }
        return listNode;
    }

    public static void printListNode(ListNode listNode){
        StringBuilder stringBuilder = new StringBuilder();
        while (listNode != null){
            stringBuilder.append(listNode.val).append("->");
            listNode = listNode.next;
        }
        System.out.println(stringBuilder.toString()+"NULL");
        return;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNode.createListNode(new int[]{1,2,3,45,5});
        ListNode.printListNode(listNode);
    }
}
