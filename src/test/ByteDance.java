package test;

import java.util.ArrayList;
import java.util.Scanner;

public class ByteDance {
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        long n = scanner.nextLong();
//        long m = scanner.nextLong();
////        long[] arr = new long[n * m];
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int tmp = scanner.nextInt();
//            arr.add(tmp);
//        }
//
//        for (long i = 1; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                arr.add(arr.get(j));
//            }
//        }
//
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.print(arr.get(i) + " ");
//        }
//
//
//        int sum = arr.get(0);
//        int maxValue = arr.get(0);
//        for (int i = 1; i < arr.size(); i++) {
//            sum += arr.get(i);
//            if (sum < 0) {
//                sum = 0;
//            }
//            maxValue = sum > maxValue ? sum : maxValue;
////            System.out.println("max is:" + maxValue + "i = " + i);
//        }
//        System.out.println(maxValue);
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n + 1];
//        for (int i = 1; i <= n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        for (int i = 1; i <= n; i++) {
//            System.out.print(arr[i]);
//        }
//
//        int max_val = -1;
//        for (int i = 1; i <= n; i++) {
//            int L = getL(arr, i);
//            if (L == 0) {
//                max_val = 0 > max_val ? 0 : max_val;
//            } else {
//                int R = getR(arr, i);
//                max_val = L * R > max_val ? L * R : max_val;
//            }
//        }
//        System.out.println(max_val);
//    }
//
//    public static int getL(int[] arr, int i) {
//        int index = i - 1;
//        while (index > 0 && arr[index] <= arr[i]) {
//            index--;
//        }
//        return index;
//    }
//
//    public static int getR(int[] arr, int i) {
//        int index = i + 1;
//        while (index < arr.length && arr[index] <= arr[i]) {
//            index++;
//        }
//
//        return index == arr.length ? 0 : index;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fun(n));

    }

    public static long fun(int n) {
        if (n <= 3) {
            return n;
        }
        long[] arr = new long[n + 1];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        for (int i = 4; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 3];
        }
        return arr[n];
    }

}
