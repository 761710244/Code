package Bili121601;

public class Test {

    static int capacity = 200;
    static int[] arr = new int[]{capacity};

    public static void main(String[] args) {
        int currentUser = 0;
        for (int i = 1; i <= 10; i++) {
            //模拟用户数量
            currentUser = mockUser(i);

            //是否进队判断（和当前队列容量比较）
            //执行相应的操作，如统计失败率，负载情况，分配策略等
            judge(i, currentUser, capacity);

            //更新当前队列容量
            capacity = getCurrentRest(arr, currentUser);
        }
    }

    private static int getPosstionVariable(double lamda) {
        int x = 0;
        double y = Math.random(), cdf = getPosstionProbability(x, lamda);
        while (cdf < y) {
            x++;
            cdf += getPosstionProbability(x, lamda);
        }
        return x;
    }

    private static double getPosstionProbability(int k, double lamda) {
        double c = Math.exp(-lamda), sum = 1;
        for (int i = 1; i <= k; i++) {
            sum *= lamda / i;
        }
        return sum * c;
    }

    private static int getCurrentRest(int[] arr, int member) {
        return arr[0];
    }

    private static int mockUser(int time) {
        if (time == 5) {
            return 100;
        }
        if (time == 6) {
            return -50;
        }
        if (time == 7) {
            return 160;
        }
        return 0;
    }

    private static void judge(int time, int currentUser, int rest) {

        if (currentUser < rest) {
            arr[0] -= currentUser;
        } else {
            int dis = currentUser - rest;
            arr[0] = 0;
            System.out.println("at time:" + time + "s, current capacity : " + arr[0] + ", fail: " + dis);
        }
    }
}
