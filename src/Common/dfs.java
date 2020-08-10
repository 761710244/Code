package Common;

import java.util.Scanner;

public class dfs {

    private static int n;
    private static int[] res = new int[3];
    private static int[] flag = new int[3];

    private static long ans = 0;

    public static void dfs(int[] a, int pos) {
        if (pos == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
                n++;
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if (flag[i] == 0) {
                flag[i] = 1;
                res[pos] = a[i];
                dfs(a, pos + 1);
                flag[i] = 0;
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] a = new int[3];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        dfs(a, 0);
    }
}
