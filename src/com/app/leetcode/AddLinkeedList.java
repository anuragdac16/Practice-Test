package com.app.leetcode;

import java.awt.*;
import java.math.BigInteger;

public class AddLinkeedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        // ListNode node2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
        //1,9,9,9,9,9,9,9,9,9
        ListNode root = addTwoNumbers(node1, node2);

        while(root != null){
            System.out.println(root.val);
            root = root.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        while (l1 != null) {
            builder1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            builder2.append(l2.val);
            l2 = l2.next;
        }
        String result = new BigInteger(new StringBuilder(builder1).reverse().toString())
                .add(new BigInteger(new StringBuilder(builder2).reverse().toString()))
                .toString();
        StringBuilder builder = new StringBuilder(result);
        builder.reverse();
        ListNode root = new ListNode();
        root.val= builder.charAt(0)-48;
        ListNode next = root;
        for(int i =1; i < builder.length(); i++){
            ListNode node = new ListNode();
            node.val= builder.charAt(i)-48;
            next.next = node;
            next = next.next;
        }


        return root;
    }


}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
