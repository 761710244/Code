package model;

import java.util.Stack;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public boolean isPalindrome(ListNode head) {
        // write code here
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stack.add(cur);
            cur = cur.next;
        }
        cur = head;
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            if (node.val != cur.val) {
                return false;
            }
            cur = cur.next;
        }
        return true;
    }

    public void merge(ListNode node) {
        ListNode l1 = this;
        ListNode l2 = node;
        if (l1 == null || l2 == null) {
            return;
        }
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            cur = cur.next;
        }
        while (l1 != null) {
            cur.next = new ListNode(l1.val);
            l1 = l1.next;
            cur = cur.next;
        }
        while (l2 != null) {
            cur.next = new ListNode(l2.val);
            l2 = l2.next;
            cur = cur.next;
        }

        this.val = head.next.val;
        this.next = head.next.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);

        l1.merge(l2);

        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
}
