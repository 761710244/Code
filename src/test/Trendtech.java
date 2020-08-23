package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Trendtech {

    /**
     * 输入一个数，从右上角开始顺时针输出一个矩阵，值为1-n，要求右对齐，占4个字符。
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 20) {
            System.out.println("error");
        } else {
            int[][] arr = new int[n][n];
            get(arr, n);
            print(arr);
        }
    }

    public static void get(int[][] arr, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= n * n; i++) {
            arrayList.add(i);
        }

        int left = 0, right = n - 1;
        int up = 0, down = n - 1;

        while (left <= right && up <= down) {
            for (int i = up; i <= down; i++) {
                arr[i][right] = arrayList.get(0);
                arrayList.remove(0);
            }

            if (left < right) {
                for (int i = right - 1; i >= left; i--) {
                    arr[down][i] = arrayList.get(0);
                    arrayList.remove(0);
                }
            }

            if (left < right && up < down) {
                for (int i = down - 1; i >= up; i--) {
                    arr[i][left] = arrayList.get(0);
                    arrayList.remove(0);
                }
            }


            if (left + 1 < right) {
                for (int i = left + 1; i < right; i++) {
                    arr[up][i] = arrayList.get(0);
                    arrayList.remove(0);
                }
            }

            left++;
            right--;
            up++;
            down--;
        }
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(String.format("%4d", arr[i][j]));
            }
            if (i != arr.length - 1) {
                System.out.println();
            }
        }
    }
}
