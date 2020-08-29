package test;

public class BeautifulWorld {
    /*
    第一题
     */
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int knapsackCapacity = Integer.parseInt(input.nextLine().trim());
//
//        String[] volumesStr = input.nextLine().split(" ");
//        int[] volumes = new int[volumesStr.length];
//        for (int i = 0; i < volumesStr.length; i++) {
//            volumes[i] = Integer.parseInt(volumesStr[i].trim());
//        }
//
//        String[] valuesStr = input.nextLine().split(" ");
//        int[] values = new int[valuesStr.length];
//        for (int i = 0; i < valuesStr.length; i++) {
//            values[i] = Integer.parseInt(valuesStr[i].trim());
//        }
//
//        if (volumes.length == values.length) {
//            System.out.println(method(knapsackCapacity, volumes, values));
//        } else {
//            System.out.println("道具数量不一致。");
//        }
//        input.close();
//    }
//
//    public static int method(int knapsackCapacity, int[] volumes, int[] values) {
//        return packet(knapsackCapacity, volumes.length, volumes, values);
//    }
//
//    public static int packet(int v, int N, int[] weight, int[] value) {
//        int[] dp = new int[v + 1];
//        for (int i = 1; i < N + 1; i++) {
//            for (int j = v; j >= weight[i - 1]; j--) {
//                dp[j] = Math.max(dp[j - weight[i - 1]] + value[i - 1], dp[j]);
//            }
//        }
//        return dp[v];
//    }
    /*
    第二题
时间限制： 5000MS
内存限制： 589824KB
题目描述：
在游戏设计中，为了方便玩家完成任务，一般都会提供自动寻路功能。假设在某个游戏中，一共有6个区域，这些区域之间满足以下条件：

1. 任意两个区域之间不一定可以直接到达

2. 路线是单向的，即如果V1可直接到V2，那么V2不可直接到V1

请设计一个程序，能够计算出V1到其他各个区域的最短时间。

示例：



以下输入输出内容请参考该图，例如

v1到（v1，v2…v5, v6）的距离为（0 1 12 -1 -1 -1）

v2到（v1，v2…v5, v6）的距离为（-1 0 9 3 -1 -1）

v3到（v1，v2…v5, v6）的距离为（-1 -1 0 -1 5 -1）

v4到（v1，v2…v5, v6）的距离为（-1 -1 4 0 13 15）

v5到（v1，v2…v5, v6）的距离为（-1 -1 -1 -1 0 4）

v6到（v1，v2…v5, v6）的距离为（-1 -1 -1 -1 -1 0）



输入描述
按行依次输入某区域到其他区域的传送时间，0表示当前区域，-1表示区域间不可直接传送

输出描述
V1到其他区域的最短时间


样例输入
0 1 12 -1 -1 -1
-1 0 9 3 -1 -1
-1 -1 0 -1 5 -1
-1 -1 4 0 13 15
-1 -1 -1 -1 0 4
-1 -1 -1 -1 -1 0
样例输出
1
8
4
13
17

提示
注意：如果某两个城市间不可达，请输出9999

程序main方法已经完成，可以直接复制使用，请补充方法public static void method (int[][] weight, String[] pointsStr)。
其中二维数组weight存储输入的各点之间的路径，pointsStr存储各节点。
     */
//    public static void main(String[] args) {
//        int[][] weight = new int[6][];
//
//        String[] pointsStr = {"V1", "V2", "V3", "V4", "V5", "V6"};
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < pointsStr.length; i++) {
//            String[] valuesStr = input.nextLine().split(" ");
//            int[] values = new int[valuesStr.length];
//            for (int j = 0; j < valuesStr.length; j++) {
//                values[j] = Integer.parseInt(valuesStr[j]);
//            }
//            weight[i] = values;
//        }
//        input.close();
//
//        method(weight, pointsStr);
//    }
//
//    public static void method(int[][] arr, String[] pointsStr) {
//
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] == -1) {
//                    arr[i][j] = 9999;
//                }
//            }
//        }
//        for (int k = 0; k < n; k++) {
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (arr[i][j] > arr[i][k] + arr[k][j]) {
//                        arr[i][j] = arr[i][k] + arr[k][j];
//                    }
//                }
//            }
//        }
//
////        for (int i = 0; i < n; i++) {
////            for (int j = 0; j < n; j++) {
////                System.out.print(arr[i][j] + " ");
////            }
////            System.out.println();
////        }
//        for (int i = 1; i < n; i++) {
//            System.out.println(arr[0][i]);
//        }
//    }
}
