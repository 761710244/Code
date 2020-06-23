public class ListNode {
    int value;
    ListNode next = null;

    ListNode(int val) {
        this.value = val;
    }

    private void createListNode() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

    }
}
