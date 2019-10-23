package com.yuhui.leetcode.medium._002_add_two_numbers;

import javax.xml.soap.Node;
import java.util.Objects;

/**
 * @author yuhui
 * <p>
 * Description
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(4);
        ListNode l1 = new ListNode(2);
        l1.next = node2;
        node2.next = node1;
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(6);
        ListNode l2 = new ListNode(5);
        l2.next = node4;
        node4.next = node3;
        ListNode res = new AddTwoNumbers().addTwoNumbers(l1, l2);
        for (ListNode node = res; Objects.nonNull(node); node = node.next) {
            System.out.print(node.val);
        }
        System.out.println();
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode n1 = l1, n2 = l2, t = node;
        int sum = 0;
        while (n1 != null || n2 != null) {
            sum /= 10;
            if (n1 != null) {
                sum += n1.val;
                n1 = n1.next;
            }
            if (n2 != null) {
                sum += n2.val;
                n2 = n2.next;
            }
            t.next = new ListNode(sum % 10);
            t = t.next;
        }
        if (sum / 10 != 0) {
            t.next = new ListNode(1);
        }
        return node.next;
    }
}
