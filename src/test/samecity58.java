package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class samecity58 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println(question(a, b));
        System.out.println(translateNum(a));
    }

    public static int translateNum(int num) {
        // write code here
        String string = String.valueOf(num);
        HashMap<Character, Integer> map = new HashMap<>();
        int cnt = 0;
        int all = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) < '2' && i != string.length() - 1 && string.charAt(i) != '0') {
                all += 2;
                cnt++;
            } else if (i != string.length() - 1 && string.charAt(i) == '2' && string.charAt(i + 1) <= '5') {
                all += 2;
                cnt++;
            } else if ((string.charAt(i) == '0' || string.charAt(i) == '1') && string.charAt(i - 1) <= 2) {
                all += 2;
                cnt++;
            } else {
                all += 1;
            }
        }
        return all - cnt;
    }

    public static int question(int a, int b) {
        // write code here
        for (int i = 0; i <= 500; i++) {
            if (isOK(i + a) && isOK(i + b)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isOK(int num) {
        for (int i = 1; i < num / 2; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> findCommonString(ArrayList<ArrayList<String>> values) {
        // write code here
        ArrayList<String> res = new ArrayList<>();
        ArrayList<Set<String>> sets = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            Set<String> set = new HashSet<>();
            for (int j = 0; j < values.get(i).size(); j++) {
                set.add(values.get(i).get(j));
            }
            sets.add(set);
        }
        for (String string : values.get(0)) {
            boolean flag = true;
            for (int i = 0; i < sets.size(); i++) {
                if (!sets.get(i).contains(string)) {
                    flag = false;
                }
            }
            if (flag) {
                res.add(string);
            }
        }
        return res;
    }

    public static long nextNarcissisticNumber(int n) {
        // write code here
        for (int i = n + 1; i < Integer.MAX_VALUE; i++) {
            if (isXian(i)) {
                return i;
            }
        }
        return 0;
    }

    public static boolean isXian(int n) {
        ArrayList<Integer> arr = getEach(n);
        long sum = 0;
        int len = arr.size();
        for (int index : arr) {
            sum += getValue(index, len);
        }
        return sum == n ? true : false;
    }

    public static ArrayList<Integer> getEach(int num) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (num > 0) {
            int value = num % 10;
            num /= 10;
            arrayList.add(value);
        }
        return arrayList;
    }

    public static long getValue(int a, int n) {
        int val = 1;
        while (n > 0) {
            val *= a;
            n--;
        }
        return val;
    }
}
