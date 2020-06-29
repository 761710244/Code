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
        System.out.println("从尾到头打印链表:");
        ListNode listNode = commonList.generateRandomListNode(10);
        commonList.printListNode(listNode);

        ArrayList<Integer> arrayList = sword.printListFromTailToHead(listNode);
        commonArray.printArrayList(arrayList);

        /*
            测试选择排序
         */
        System.out.println("测试选择排序:");
        int[] arr = commonArray.generateRandomArray(10);
        commonArray.printArray(arr);
        commonArray.selectionSort(arr);
        commonArray.printArray(arr);

        /*
            测试插入排序
         */
        System.out.println("测试插入排序:");
        arr = commonArray.generateRandomArray(10);
        commonArray.printArray(arr);
        commonArray.insertSort(arr);
        commonArray.printArray(arr);

        /*
            测试冒泡排序
         */
        System.out.println("测试冒泡排序:");
        arr = commonArray.generateRandomArray(10);
        commonArray.printArray(arr);
        commonArray.guluSort(arr);
        commonArray.printArray(arr);

        /*
            测试归并排序
         */
        System.out.println("测试归并排序:");
        arr = commonArray.generateRandomArray(10);
        commonArray.printArray(arr);
        commonArray.mergeSort(arr);
        commonArray.printArray(arr);
    }
}
