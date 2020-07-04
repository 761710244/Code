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
        ArrayList<Integer> list = CommonArray.generateRandomArrayList(size);

        ListNode head = new ListNode(list.get(0));
        ListNode cur = head;
        for (int i = 1; i < size; i++) {
            cur.next = new ListNode(list.get(i));
            cur = cur.next;
        }
        return head;
    }

    /**
     * 产生一个环形链表
     *
     * @param num
     * @return
     */
    public static ListNode generateLoopList(int num) {
        if (num <= 0) {
            return null;
        }
        int[] array = CommonArray.generateRandomArray(num);
        ListNode head = new ListNode(array[0]);
        ListNode cur = head;
        for (int i = 1; i < array.length; i++) {
            cur.next = new ListNode(array[i]);
            cur = cur.next;
        }
        cur.next = head.next.next;
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

    /**
     * 链表第K个位置插入一个节点
     *
     * @param head
     * @param k
     * @param data
     * @return
     */
    public static ListNode insertKth(ListNode head, int k, int data) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        k -= 2;
        while (k > 0 && cur.next != null) {
            cur = cur.next;
            k--;
        }
        if (cur.next == null) {
            cur.next = new ListNode(data);
            return head;
        }
        ListNode tmp = cur.next;
        cur.next = new ListNode(data);
        cur.next.next = tmp;
        return head;
    }

    /**
     * 删除第K个节点
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode deleteKth(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        k -= 2;
        ListNode cur = head;
        while (k > 0 && cur.next != null) {
            cur = cur.next;
            k--;
        }
        if (cur.next == null) {
            return head;
        }
        cur.next = cur.next.next;
        return head;
    }

    /**
     * 获取第K个节点
     *
     * @param head
     * @param k
     * @return
     */
    public static int getKthValue(ListNode head, int k) {
        if (k < 0) {
            return -1;
        }
        k--;
        ListNode cur = head;
        while (cur.next != null && k > 0) {
            cur = cur.next;
            k--;
        }
        if (cur.next == null && k > 0) {
            return -1;
        }
        return cur.value;
    }

    /**
     * 修改第K个节点的值
     *
     * @param head
     * @param k
     * @param data
     * @return
     */
    public static ListNode changeKth(ListNode head, int k, int data) {
        if (head == null) {
            return null;
        }
        k--;
        ListNode cur = head;
        while (k > 0 && cur.next != null) {
            cur = cur.next;
            k--;
        }
        if (cur.next == null && k > 0) {
            return head;
        }
        cur.value = data;
        return head;
    }

    /**
     * 判断链表是否有环，若有则返回环的入口
     *
     * @param head
     * @return
     */
    public static ListNode isLoop(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != slow) {
            if (fast.next == null || fast.next.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    /**
     * 无环链表相交
     *
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode sameNode(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return null;
        }
        int len = 0;
        ListNode head1 = list1;
        ListNode head2 = list2;
        while (head1 != null) {
            len++;
            head1 = head1.next;
        }
        while (head2 != null) {
            len--;
            head2 = head2.next;
        }
        if (head1 != head2) {
            return null;
        }
        head1 = len > 0 ? list1 : list2;
        head2 = head1 == list1 ? list2 : list1;
        len = Math.abs(len);
        while (len-- > 0) {
            head1 = head1.next;
        }
        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;
    }

    public static void main(String[] args) {

        ListNode head = generateRandomListNode(5);
        System.out.println("原始链表:");
        printListNode(head);

        System.out.println("反转链表:");
        ListNode reverse = reverseList(head);
        printListNode(reverse);

        System.out.println("\n第K个位置插入一个data节点:");
        head = generateRandomListNode(5);
        printListNode(head);
        ListNode Kth = insertKth(head, 2, 100);
        printListNode(Kth);

        System.out.println("\n删除第K个节点:");
        head = generateRandomListNode(10);
        printListNode(head);
        ListNode deleteK = deleteKth(head, 5);
        printListNode(deleteK);

        System.out.println("\n返回第K个节点的值:");
        head = generateRandomListNode(10);
        printListNode(head);
        System.out.println("\n" + getKthValue(head, 10));

        System.out.println("\n修改第K个节点值:");
        head = generateRandomListNode(10);
        printListNode(head);
        ListNode changeK = changeKth(head, 3, 1000);
        printListNode(changeK);

        System.out.println("\n产生一个环形链表:");
        head = generateLoopList(10);
        ListNode loop = isLoop(head);
        System.out.println(loop.value);

        System.out.println("\n无环链表相交节点:");
        ListNode list1 = generateRandomListNode(10);
        printListNode(list1);
        ListNode list2 = generateRandomListNode(5);
//        list2.next.next.next = list1;
        printListNode(list2);
        ListNode same = sameNode(list1, list2);
        printListNode(same);
    }
}
