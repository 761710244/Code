package Common;

import model.ListNode;

import java.util.ArrayList;

public class CommonList {

    public ListNode generateRandomListNode(int size) {
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


    public void printListNode(ListNode head) {
        while (head != null) {
            if (head.next != null) {
                System.out.print(head.value + "->");
            } else {
                System.out.println(head.value);
            }
            head = head.next;
        }
    }


}
