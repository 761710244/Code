package Common;

import model.ListNode;

import java.util.ArrayList;
import java.util.Stack;

public class Sword {

    public boolean Find(int target, int [][] array) {
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
