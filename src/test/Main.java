package test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long T = in.nextInt();
        int n = in.nextInt();
        int[] price = new int[n];
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = in.nextInt();
            value[i] = in.nextInt();
        }

        System.out.println(getAns(price, value, T));
    }

    public static int getAns(int[] price, int[] value, long T) {
        int n = price.length;
        int[][] maxvalue = new int[n + 1][(int) (T + 1)];
        for (int i = 0; i < T + 1; i++) {
            maxvalue[0][i] = 0;
        }

        for (int i = 0; i < n + 1; i++) {
            maxvalue[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= T; j++) {
                maxvalue[i][j] = maxvalue[i - 1][j];
                if (price[i - 1] <= j) {
                    if (maxvalue[i - 1][j - price[i - 1]] + value[i - 1] > maxvalue[i - 1][j]) {
                        maxvalue[i][j] = maxvalue[i - 1][j - price[i - 1]] + value[i - 1];
                    }
                }

            }
        }
        return maxvalue[n][(int) T];
    }
}
