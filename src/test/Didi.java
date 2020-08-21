package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Didi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = getFeb(n * n);

        for (int index : arrayList) {
            System.out.print(index + " ");
        }

        System.out.println("---------------");
        int[][] arr = new int[n][n];
        int left = 0, right = n - 1;
        int up = 0, down = n - 1;

        while (left <= right && up <= down) {
            for (int i = left; i <= right; i++) {
                arr[up][i] = arrayList.get(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
            }
            if (up < down) {
                for (int i = up + 1; i <= down; i++) {
                    arr[i][right] = arrayList.get(arrayList.size() - 1);
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            if (left < right) {
                for (int i = right - 1; i >= left; i--) {
                    arr[down][i] = arrayList.get(arrayList.size() - 1);
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            if (left < right && up + 1 < down) {
                for (int i = down - 1; i >= up + 1; i--) {
                    arr[i][left] = arrayList.get(arrayList.size() - 1);
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            left++;
            right--;
            up++;
            down--;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> getFeb(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int a = 1;
        int b = 1;
        arrayList.add(a);
        arrayList.add(b);
        for (int i = 3; i <= n; i++) {
            int res = a + b;
            arrayList.add(res);
            a = b;
            b = res;
        }
        return arrayList;
    }
    /**
     * 熟悉的A+B
     * 时间限制： 3000MS
     * 内存限制： 589824KB
     * 题目描述：
     * A+B问题又来了。
     *
     * 设a，b，c是0到9之间的整数（其中a，b，c互不相同），其中abc和acc是两个不同的三位数，现给定一正整数n，问有多少对abc和acc能满足abc+acc=n（a≠0）？
     *
     *
     *
     * 输入描述
     * 一个正整数n（100<n<2000）。
     *
     * 输出描述
     * 第一行输出有多少对满足要求的数字。
     *
     * 接下来每一行输出一对abc和acc，以空格分隔。如果没有一对abc和acc的话，则直接输出0即可。如果有多对，请按照abc升序的次序输出。
     *
     *
     * 样例输入
     * 1068
     * 样例输出
     * 1
     * 524 544
     * @param args
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int a = 1; a < 10; a++) {
//            for (int b = 0; b < 10; b++) {
//                for (int c = 0; c < 10; c++) {
//                    if (a != b && a != c && b != c) {
//                        int A = a * 100 + b * 10 + c;
//                        int B = a * 100 + c * 10 + c;
//                        if (A != B && A + B == n) {
//                            hashMap.put(A, B);
//                        }
//                    }
//                }
//            }
//        }
//        if (!hashMap.isEmpty()) {
//            System.out.println(hashMap.size());
//            for (int index : hashMap.keySet()) {
//                System.out.println(index + " " + hashMap.get(index));
//            }
//        } else {
//            System.out.println(0);
//        }
//    }
}
