package Common;

import model.ListNode;

import java.util.ArrayList;

public class CommonList {

    /**
     * 产生一个随机链表
     *
     * @param size
     * @return
     */
    public static ListNode generateRandomListNode(int size) {
        if (size <= 0) {
            return null;
        }
        CommonArray commonArray = new CommonArray();
        ArrayList<Integer> list = commonArray.generateRandomArrayList(size);

        ListNode head = new ListNode(list.get(0));
        ListNode cur = head;
        for (int i = 1; i < size; i++) {
            cur.next = new ListNode(list.get(i));
            cur = cur.next;
        }
        return head;
    }

    /**
     * 打印链表
     *
     * @param head
     */
    public static void printListNode(ListNode head) {
        while (head != null) {
            if (head.next != null) {
                System.out.print(head.value + "->");
            } else {
                System.out.println(head.value);
            }
            head = head.next;
        }
    }

    /**
     * 反转链表
     *
     * @param head
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {

        ListNode head = generateRandomListNode(5);
        printListNode(head);

        System.out.println("反转链表:");
        ListNode reverse = reverseList(head);
        printListNode(reverse);
    }
}
