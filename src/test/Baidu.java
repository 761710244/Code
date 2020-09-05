package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baidu {

    public static class Thing {
        public int price;
        public int weight;
        public int v;

        Thing(int price, int weight, int v) {
            this.price = price;
            this.weight = weight;
            this.v = v;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Thing[] arr = new Thing[n];

        for (int i = 0; i < n; i++) {
            int price = scanner.nextInt();
            int weight = scanner.nextInt();
            int v = scanner.nextInt();
            arr[i] = new Thing(price, weight, v);
        }

        Arrays.sort(arr, new Comparator<Thing>() {
            @Override
            public int compare(Thing o1, Thing o2) {
                if (o2.v != o1.v) {
                    return o2.v - o1.v;
                }
                if (o1.price != o2.price) {
                    return o1.price - o2.price;
                }
                return o1.weight - o2.weight;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].weight + " " + arr[i].price + " " + arr[i].v);
        }
    }
}