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

    // addTwoNumbers 两数相加
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tmp = 0;
        ListNode head = new ListNode(0);
        ListNode res = head;
        while (l1 != null || l2 != null) {
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;
            tmp = tmp + n1 + n2;
            head.next = new ListNode(tmp % 10);
            head = head.next;
            tmp = tmp / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (tmp > 0) {
            head.next = new ListNode(tmp);
        }
        return res.next;
    }

    // reverseList 反转链表
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = cur.next;

        while (next != null) {
            cur.next = pre;
            pre = cur;
            cur = next;
            next = cur.next;
        }
        cur.next = pre;
        return cur;
    }

    // 链表中倒数第K个节点
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k <= 0) {
            return head;
        }

        ListNode cur = new ListNode(0);
        cur.next = head;
        ListNode fast = cur;
        ListNode slow = cur;
        while (k-- > 0) {
            fast = fast.next;
            if (fast == null) {
                return null;
            }
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    // removeNthFromEnd 删除倒数第N个节点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            return head;
        }
        ListNode cur = new ListNode(0);
        cur.next = head;
        ListNode fast = cur;
        ListNode slow = cur;
        n++;
        while (n-- > 0) {
            fast = fast.next;
            if (n > 0 && fast == null) {
                return null;
            }
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return cur.next;
    }

    // mergeTwoLists 合并两个有序链表
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
                continue;
            }
            cur.next = l2;
            l2 = l2.next;
            cur = cur.next;
        }
        if (l1 == null) {
            cur.next = l2;
            return head.next;
        }
        cur.next = l1;
        return head.next;
    }

    // reverseBetween 反转链表指定范围的节点
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || right < left) {
            return null;
        }
        ListNode start = new ListNode(0);
        start.next = head;

        ListNode cur = start;
        for (int i = 0; i < left - 1; i++) {
            cur = cur.next;
        }
        ListNode front = cur;
        ListNode leftNode = cur.next;

        for (int i = 0; i < right - left + 1; i++) {
            cur = cur.next;
        }
        ListNode rightNode = cur;
        ListNode behind = cur.next;

        front.next = null;
        rightNode.next = null;
        reverseList(leftNode);
        front.next = rightNode;
        leftNode.next = behind;
        return start.next;
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
