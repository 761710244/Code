package Common;

import model.ListNode;

import java.util.ArrayList;
import java.util.Stack;

public class Sword {

    public static boolean Find(int target, int [][] array) {
        int line = array.length;
        int col = array[0].length;
        int i = line - 1;
        int j = 0;
        while(i >= 0 && j < col){
            if(array[i][j] < target){
                j++;
            }
            else if(array[i][j] > target){
                i--;
            }
            else{
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
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

    public static void main(String[] args) {

        /**
         * 从尾到头打印链表
         */
        System.out.println("从尾到头打印链表:");
        CommonList commonList = new CommonList();
        CommonArray commonArray = new CommonArray();
        ListNode listNode = commonList.generateRandomListNode(10);
        commonList.printListNode(listNode);
        ArrayList<Integer> arrayList = printListFromTailToHead(listNode);
        commonArray.printArrayList(arrayList);
    }
}
