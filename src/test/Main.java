package test;

import Common.CommonArray;
import Common.CommonList;
import Common.Sword;
import model.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

        /*
            字节面试题
         */
        List<Long> longArrayList = new ArrayList();
        List<Integer> integerArrayList = new ArrayList();
        List<Boolean> booleanLinkedList = new LinkedList();
        longArrayList.add(10L);
        longArrayList.add(20L);
        integerArrayList.add(10);
        integerArrayList.add(20);
        booleanLinkedList.add(true);
        booleanLinkedList.add(false);
        System.out.println(longArrayList.getClass() == integerArrayList.getClass());
        System.out.println(longArrayList.getClass() == booleanLinkedList.getClass());
    }
}
