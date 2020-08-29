package test;

import java.util.Scanner;

public class iFyTech {

//  4
//  50
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        if (isPrime(n)) {
//            System.out.println(n);
//            return;
//        }
//        process(n);
//    }
//
//    public static void process(int num) {
//        for (int i = 2; i <= num; i++) {
//            if (num % i == 0) {
//                System.out.print(i + (num > i ? "*" : "\n"));
//                process(num / i);
//                break;
//            }
//        }
//    }
//
//    public static boolean isPrime(int num) {
//        for (int i = 2; i < Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    //  3
    //  替换多余的下划线，首尾都去掉
    //  ___aaa__b____c__dd___
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        if (string == null || string.length() == 0) {
            System.out.println("");
            return;
        }
        while (string.contains("__")) {
            string = string.replaceAll("__", "_");
        }
        int left = 0;
        int right = string.length();
        if (string.charAt(0) == '_') {
            left++;
        }
        if (string.charAt(string.length() - 1) == '_') {
            right--;
        }
        System.out.println(string.substring(left, right));
    }
}
//  2
//  9
//  25,84,21,47,15,27,68,35,
//  选择排序
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//
//        String line = scanner.next();
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(line.split(",")[i]);
//        }
//        selectSort(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                System.out.println(arr[i]);
//            } else {
//                System.out.print(arr[i] + ",");
//            }
//        }
//    }
//
//    public static void selectSort(int[] arr) {
//        if (arr == null || arr.length == 0) {
//            return;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            int index = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                index = arr[j] < arr[index] ? j : index;
//            }
//            swap(arr, i, index);
//        }
//    }
//
//    public static void swap(int[] arr, int i, int j) {
//        int tmp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = tmp;
//    }


//  1
//  走阶梯，左上角走到右下角，沿途的最大值
//  3,3
//  2 3 1
//  1 5 1
//  4 2 1
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.next();
//        int m = Integer.parseInt(line.split(",")[0]);
//        int n = Integer.parseInt(line.split(",")[1]);
//        int[][] arr = new int[n][m];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//        System.out.println(getMaxValue(arr));
//    }
//
//    public static int getMaxValue(int[][] arr) {
//        if (arr == null || arr.length == 0) {
//            return 0;
//        }
//        int m = arr.length;
//        int n = arr[0].length;
//
//        int[][] dp = new int[m][n];
//
//        for (int j = 0; j < n; j++) {
//            for (int i = 0; i < m; i++) {
//                if (i == 0 && j == 0) {
//                    dp[i][j] = arr[i][j];
//                    continue;
//                }
//                if (j == 0) {
//                    dp[i][j] = dp[i - 1][j] + arr[i][j];
//                    continue;
//                }
//                if (i == 0) {
//                    dp[i][j] = dp[i][j - 1] + arr[i][j];
//                    continue;
//                }
//                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + arr[i][j];
//            }
//        }
//        return dp[m - 1][n - 1];
//    }