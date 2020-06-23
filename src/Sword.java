import java.util.ArrayList;
import java.util.Stack;

public class Sword {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> sta = new Stack<>();
        while (listNode != null) {
            sta.push(listNode.value);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!sta.isEmpty()) {
            list.add(sta.pop());
        }
        return list;
    }
}
