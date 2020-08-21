package test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Dajiang {
    /*
        题目描述：
        小C平时最喜欢玩数字游戏，最近他碰到一道有趣的数字题，他和他的好朋友打赌，一定能在10分钟内解出这道题，成功完成，小C就可以得到好朋友送他的Switch游戏机啦，你能帮助小C赢得奖品吗？

        题目是这样的：给定一个非负的、字符串形式的整形数字，例如“12353789”，字符串的长度也就是整形数字的位数不超过10000位，并且字符串不会以0开头，小C需要挑选出其中K个数字（K小于字符串的长度）并删掉他们，使得剩余字符组成新的整数是最小的。

        输入描述
        第一行输入一串纯数字形式的字符串，组成一个正整数

        第二行输入一个正整数K (K < 字符串的长度)

        输出描述
        输出一个数字（字符串格式）


        样例输入
    71245323308
            4
            */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.next();
//        int k = scanner.nextInt();
//        System.out.println(function(string, k));
//    }
//
//    public static String function(String string, int k) {
//        LinkedList<Character> stack = new LinkedList<>();
//        for (char ch : string.toCharArray()) {
//            while (stack.size() > 0 && k > 0 && stack.peekLast() > ch) {
//                stack.removeLast();
//                k -= 1;
//            }
//            stack.addLast(ch);
//        }
//
//        for (int i = 0; i < k; i++) {
//            stack.removeLast();
//        }
//
//        StringBuffer ans = new StringBuffer();
//        boolean flag = true;
//        for (char ch : stack) {
//            if (flag && ch == '0') {
//                continue;
//            }
//            flag = false;
//            ans.append(ch);
//        }
//        if (ans.length() == 0) {
//            return "0";
//        }
//        return ans.toString();
//    }

/*
    题目描述：
    有许多程序员都热爱玩游戏，而小J自称为游戏王，曾玩过几百种游戏，几乎所有能玩到的游戏大作都玩遍了。随着时间的推移，他发觉已经没有游戏可以让他玩了！于是他想改玩一些古老的游戏，以成为真正的“游戏王”。他希望在接下来的一段时间内将过去出的游戏全部玩一遍，但是毕竟时间有限，因此他感到很苦恼。于是他想到一个计划，他先将每个游戏标上一个成就值，同时对每个游戏都估算一个通关所需要的天数，他计划在未来X天内让自己玩游戏的成就达到最大，那么他应该怎么做计划呢？（假设每个游戏最多只计划玩一遍，而且每个游戏必须玩完通关才能取得成就值，且通关每个游戏最小时间单位是1天）



    输入描述
    第一行输入两个整数N和X，中间用空格隔开，其中N表示游戏的数目N(1<=N<=10)，X表示计划玩游戏的总时间天数 (1<=X<=1000)。

    第二行输入第1个游戏的成就值A1(0<=A1<=10000) 和 通关所需要花费时间B1天 (1<=Bi<=500) 中间用空格隔开。

    第N+1行输入第N游戏的成就值An(0<=An<=10000) 和 通关所需要花费时间Bn天(1<=Bn<=500) 中间用空格隔开

    输出描述
    可以达到成就之和的最大值。


    样例输入
    2 2
    10 1
    20 2
    样例输出
    20
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int tmpX = x;
        Queue<int[]> queue1 = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] < o2[0]) {
                    return 1;
                } else if (o1[0] > o2[0]) {
                    return -1;
                }
                return o1[1] - o2[1];
            }
        });

        Queue<int[]> queue2 = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1]) {
                    return 1;
                } else if (o1[1] < o2[1]) {
                    return -1;
                }
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < n; i++) {
            int[] arr = new int[2];
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();
            queue1.add(arr);
            queue2.add(arr);
        }
        int ans1 = 0;
        int ans2 = 0;
        while (x > 0 && !queue1.isEmpty()) {
            int[] tmpArr = queue1.poll();
            if (tmpArr[1] <= x) {
                x -= tmpArr[1];
                ans1 += tmpArr[0];
            }
        }

        if (x == 0) {
            System.out.println(ans1);
        } else {
            while (tmpX > 0 && !queue2.isEmpty()) {
                int[] tmpArr = queue2.poll();
                if (tmpArr[1] <= tmpX) {
                    tmpX -= tmpArr[1];
                    ans2 += tmpArr[0];
                }
            }
            System.out.println(Math.max(ans1, ans2));
        }
    }

/*
    题目描述：
    最近DJI发布了一款Robomaster S1机器人，小伙伴们都沉迷其中不能自拔。小J为了能够在竞速比赛中迅速获胜，他决定利用开发的优势，在里面植入一套最优化的寻路算法。

    比赛规则如下: 在比赛场地内预先设置N个路标，路标编号从0到N-1，S1只能沿直线在两个有连接的路标之间移动（部分路标之间是没有连接的） 比赛场地内的S1机器人从编号为0的路标出发，然后裁判给出随机一个路标（从0到N-1号路标中随机挑选一个）作为终点路标，要求S1机器人以尽可能快的速度从0号路标达到终点路标，总路程用时最短者获胜。

    裁判会确保从0号路标和随机挑选的终点路标之间肯定存在至少一条路径。 小J在比赛开始前就已经得知了路标的数量 、通道的数量（每两个可以直接连接的路标点为一个通道）以及小车在每个通道上移动需要的时间。他需要编写一套算法，以确保能够快速找到最短路径，并输出小车在该路径移动所需要的时间，你能帮他实现这套算法吗?



    输入描述
    第一行输入两个个正整数 N和 P，其中N表示路标的数量， P表示通道的数量。 (1 < N <= 200,  0 <= P <= N * (N - 1) / 2 ）

    接下来的P行，每行输入三个正整数 A, B, T，A表示起点路标的编号，B表示终点路标的编号，T表示路标A到路标B需要时间T。 (0 <= A, B <= N-1, 1 <= T <= 100)

    最后一行输入一个正整数 X，表示裁判给出的终点路标编号 (0 =< X <= N)

    输出描述
    输出一个正整数，表示小车从0号路标到X号路标之间移动的最短用时


    样例输入
    4 5
    0 1 15
    1 2 15
    0 3 50
    1 3 30
    2 3 10
    3

    样例输出
    40
 */
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int p = scanner.nextInt();
//        int[][] arr = new int[n][n];
//
//        for (int i = 0; i < p; i++) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int t = scanner.nextInt();
//            arr[a][b] = t;
//            arr[b][a] = t;
//        }
//        int x = scanner.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] == 0) {
//                    arr[i][j] = 99999;
//                }
//            }
//        }
//
//        for (int k = 0; k < n; k++) {
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (arr[i][j] > arr[i][k] + arr[k][j]) {
//                        arr[i][j] = arr[i][k] + arr[k][j];
//                    }
//                }
//            }
//        }
//        System.out.println(arr[0][x]);
////        for (int i = 0; i < n; i++) {
////            for (int j = 0; j < n; j++) {
////                System.out.print(arr[i][j] + " ");
////            }
////            System.out.println();
////        }
//    }
}
