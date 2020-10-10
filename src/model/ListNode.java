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
}
