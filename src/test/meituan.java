package test;

import java.util.Scanner;

public class meituan {
    //  美团
//  1
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int total = 0;
//        int score = 0;
//
//        int one = scanner.nextInt();
//        int two = scanner.nextInt();
//        int three = scanner.nextInt();
//        int four = scanner.nextInt();
//        int five = scanner.nextInt();
//
//        score = one * 1 + two * 2 + three * 3 + four * 4 + five * 5;
//        total = one + two + three + four + five;
//        double ans = (double) score / (double) total;
//        System.out.println(String.format("%.2f", ans).substring(0, 3));
//    }

    //  2
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int cnt = scanner.nextInt();
//        int all = 0;
//        int need = 0;
//        while (cnt-- > 0) {
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//            if (x <= y) {
//                all += y;
//            } else {
//                all += x;
//                need += x - y;
//            }
//        }
//        System.out.println(all + " " + need);
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int tmp = scanner.nextInt();
//            arrayList.add(tmp);
//        }
//
//        int ans = 0;
//        while (true) {
//            boolean flag = true;
//            Arrays.sort(arrayList.toArray());
//            for (int i = 0; i < arrayList.size() - 1; i++) {
//                if (arrayList.get(i) == arrayList.get(i + 1)) {
//                    arrayList.add(arrayList.get(i) + 1);
//                    arrayList.remove(arrayList.get(i));
//                    arrayList.remove(arrayList.get(i));
//                    ans++;
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                break;
//            }
//        }
//        System.out.println(arrayList.get(arrayList.size() - 1));
//    }

    public static class YellowTree {
        public String color;
        public int num;
        public YellowTree parent;

        public YellowTree(int colorFlag, int val) {
            this.num = val;
            this.color = colorFlag == 0 ? "yellow" : "black";
            this.parent = null;
        }
    }

    public static class info {
        public int yellowDeep;
        public int blackDeep;

        public info(int y, int b) {
            this.yellowDeep = y;
            this.blackDeep = b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        YellowTree[] trees = new YellowTree[n];
        for (int i = 1; i <= n; i++) {
            int colorFlag = scanner.nextInt();
            trees[i] = new YellowTree(colorFlag, i);
        }

        for (int i = 1; i < n; i++) {
            int num = scanner.nextInt();
            trees[i].parent = trees[num];
        }
        System.out.println(function(trees[0]).blackDeep + function(trees[0]).yellowDeep);
    }

    private static info function(YellowTree tree) {
        if (tree == null) {
            return new info(0, 0);
        }

        info parent = function(tree.parent);
        int cury = parent.yellowDeep;
        int curb = parent.blackDeep;
        return new info(cury + 1, curb + 1);
    }
}
