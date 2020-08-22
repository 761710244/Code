package test;

import java.util.Scanner;

public class G360 {

    /**
     * 调整排列
     * 时间限制： 3000MS
     * 内存限制： 589824KB
     * 题目描述：
     * 给定一个1到N的排列P1到PN（N为偶数），初始时Pi=i（1≤i≤N），现在要对排列进行M次操作，每次操作为以下两种中一种：
     * ①将排列的第1个数移到末尾；
     * ②交换排列的第1个数与第2个数、第3个数与第4个数、...、第N-1个数与第N个数。
     * 求经过这M次操作后得到的排列。
     * <p>
     * 输入描述
     * 第一行包含两个整数N和M，2≤N，M≤105。
     * 第二行包含M个空格隔开的整数t1到tM，1≤ti≤2。若ti=1，则表示第i次操作为操作①；若ti=2，则表示第i次操作为操作②。
     * 输出描述
     * 输出N个空格隔开的整数，即经过M次操作后得到的排列。
     * 样例输入
     * 4 3
     * 1 2 1
     * 样例输出
     * 2 1 4 3
     * <p>
     * 提示
     * 排列变化过程为：{1 2 3 4}->{2 3 4 1}->{3 2 1 4}->{2 1 4 3}。
     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int function = scanner.nextInt();
            if (function == 1) {
                function1(arr);
            }
            if (function == 2) {
                function2(arr);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void function1(int[] arr) {
        int tmp = arr[0];
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[len - 1] = tmp;
    }

    public static void function2(int[] arr) {
        for (int pos = 0; pos < arr.length; pos += 2) {
            int tmp = arr[pos];
            arr[pos] = arr[pos + 1];
            arr[pos + 1] = tmp;
        }
    }

//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int M = scanner.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 1; i <= N; i++) {
//            list.add(i);
//        }
//
//        for (int i = 0; i < M; i++) {
//            int function = scanner.nextInt();
//            if (function == 1) {
//                int head = list.get(0);
//                list.add(head);
//                list.remove(list.get(0));
//            }
//            if (function == 2) {
//                list = swap(list, N);
//            }
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            if (i == list.size() - 1) {
//                System.out.println(list.get(i));
//            } else {
//                System.out.print(list.get(i) + " ");
//            }
//        }
//    }
//
//    public static ArrayList<Integer> swap(ArrayList<Integer> list, int N) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        for (int pos = 0; pos < N; pos += 2) {
//            arrayList.add(list.get(pos + 1));
//            arrayList.add(list.get(pos));
//        }
//        return arrayList;
//    }

/**
 * 合法名字
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 现在的调查问卷越来越多了，所以出现了很多人恶意刷问卷的情况，已知某问卷需要填写名字，如果名字仅由大小写英文字母组成且长度不超过10，则我们认为这个名字是真实有效的，否则就判定为恶意填写问卷
 * 请你判断出由多少有效问卷（只要名字是真实有效的，就认为问卷有效）。
 * 输入描述
 * 输入第一行包含一个正整数n，表示收到的问卷数量。(1<=n<=2000)
 * <p>
 * 接下来有n行，每行有一个由大小写英文字母，数字，下划线组成的字符串，分别表示一份问卷的名字，字符串长度不超过100。
 * <p>
 * 输出描述
 * 输出只有一个整数，表示有效问卷数量。
 * <p>
 * <p>
 * 样例输入
 * 5
 * BA
 * aOWVXARgUbJDG
 * OPPCSKNS
 * HFDJEEDA
 * ABBABBBBAABBBAABAAA
 * 样例输出
 * 3
 */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int result = 0;
//        for (int i = 0; i < n; i++) {
//            String string = scanner.next();
//            if (isOK(string)) {
//                result++;
//            }
//        }
//        System.out.println(result);
//    }
//
//    public static boolean isOK(String str) {
//        int len = str.length();
//        if (len > 10) {
//            return false;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
//                continue;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
}
