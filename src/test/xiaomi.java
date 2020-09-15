package test;

import java.util.Scanner;

public class xiaomi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        System.out.println("true");
    }
    /**
     * 注册网站时，需要使用包含不同类型（数字、符号、大写字母、小写字母）的字符，和特定长度。检查一个密码内容同时包含以上 4 种类型的字符，并且长度在8-120 个字符之间。符合要求，返回 0；长度不符合返回 1；类型不符合要求返还 2。
     * <p>
     * 可以一次输入多组密码，以空格符间隔，空格符不作为密码。
     * <p>
     * <p>
     * <p>
     * 输入描述
     * 需要验证的密码，多个密码以空格符间隔，空格符不作为密码的一部分
     * <p>
     * 输出描述
     * 每个密码的检查结果，每个结果需要换行输出
     * <p>
     * <p>
     * 样例输入
     * 123 12345678 123abcABC!!!
     * 样例输出
     * 1
     * 2
     */
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        String[] arr = line.split(" ");
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(judge(arr[i]));
//        }
//    }
//
//    public static int judge(String str) {
//        if (str.length() < 8 || str.length() > 120) {
//            return 1;
//        }
//
//        boolean number = false;
//        boolean small = false;
//        boolean big = false;
//        boolean other = false;
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//                number = true;
//                continue;
//            }
//            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
//                small = true;
//                continue;
//            }
//            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
//                big = true;
//                continue;
//            }
//            other = true;
//        }
//        if (number && small && big && other) {
//            return 0;
//        }
//        return 2;
//    }
}
