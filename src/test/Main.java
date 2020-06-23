package test;

import Common.CommonArray;
import Common.CommonList;
import Common.Sword;
import model.ListNode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Sword sword = new Sword();
        CommonArray commonArray = new CommonArray();
        CommonList commonList = new CommonList();


        /**
         * 从尾到头打印链表
         */
        ListNode listNode = commonList.generateRandomListNode(10);
        commonList.printListNode(listNode);

        ArrayList<Integer> arrayList = sword.printListFromTailToHead(listNode);
        commonArray.printArray(arrayList);


    }
}
