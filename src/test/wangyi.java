package test;

import java.util.Scanner;

public class wangyi {
    //  网易
//  1
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//
//        long res = 0;
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//            res += getRes(arr[i]);
//        }
//        System.out.println(res);
//    }
//
//    private static int getRes(int n) {
//        if (n < 2) {
//            return 0;
//        }
//        return n >> 1;
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//
//        int[] arr = new int[m];
//        Queue<Integer> queue = new LinkedList<>();
//
//        for (int i = 0; i < m; i++) {
//            int tmp = scanner.nextInt();
//            queue.add(tmp);
//        }
//
//        List<Integer> arrayList = new ArrayList<>(n);
//        boolean flag = false;
//
//        for (int i = 1; ; i++) {
//            if (flag) {
//                i--;
//            }
//            flag = false;
//            if (arrayList.size() == n) {
//                break;
//            }
//            if (queue.size() > 0) {
//                if (queue.contains(i)) {
//                    continue;
//                } else {
//                    if (i < queue.peek()) {
//                        arrayList.add(i);
//                    } else {
//                        flag = true;
//                        arrayList.add(queue.poll());
//                    }
//                }
//            } else {
//                arrayList.add(i);
//            }
//        }
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (i != arrayList.size() - 1) {
//                System.out.print(arrayList.get(i) + " ");
//            } else {
//                System.out.print(arrayList.get(i));
//            }
//        }
//    }
//
//    private static ArrayList<Integer> insertSort(ArrayList<Integer> arr, int index) {
//        if (index < arr.get(0)) {
//            arr.add(0, index);
//        } else {
//            int pos = getMin(arr);
//            if (arr.get(pos) < index) {
//                arr.add(pos + 1, index);
//            } else {
//                arr.add(pos, index);
//            }
//        }
//        return arr;
//    }
//
//    private static int getMin(ArrayList<Integer> arr) {
//        int small = 99999;
//        int ans = 0;
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i) < small) {
//                small = arr.get(i);
//                ans = i;
//            }
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int ans = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                ans += arr[i];
            }
            System.out.println(0);
        }
    }
}
