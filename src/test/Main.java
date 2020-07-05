package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         *   字节面试题
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

        /**
         * 测试输入输出
         */
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String cin = scanner.nextLine();
            System.out.println(cin);
            String[] split = cin.split(" ");
            int[] arr = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                arr[i] = Integer.parseInt(split[i]);
                System.out.print(arr[i] + " ");
            }
        }


    }
}
