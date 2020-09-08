package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class huawei {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> srcList = new ArrayList<>();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            srcList.add(line);
        }

        String tar = srcList.get(srcList.size() - 1);
        String edge = srcList.get(srcList.size() - 2);

        srcList.remove(tar);
        srcList.remove(edge);

        for (String index : srcList) {
            System.out.println(index);
        }

        String tarSp = getSpe(tar, edge);
        ArrayList<String> res = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();
        for (String index : srcList) {
            String tmp = getSpe(index, edge);
            if (tmp == tarSp) {
                res.add(index);
            }
        }

        for (String index : res) {
            System.out.println(index);
        }
    }

    public static String getSpe(String str, String ch) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < ch.charAt(0)) {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String in = scanner.nextLine();
//
//        String srcString = in.split(";")[0];
//        String tarString = in.split(";")[1];
//
//        srcString = preHandle(srcString.toLowerCase());
//        tarString = preHandle(tarString.toLowerCase());
//
//        String[] srcArr = srcString.toLowerCase().split(" ");
//        String[] tarArr = tarString.toLowerCase().split(" ");
//
//        //
////        for (int i = 0; i < srcArr.length; i++) {
////            System.out.print(srcArr[i] + " ");
////        }
////        System.out.println();
////        for (int i = 0; i < tarArr.length; i++) {
////            System.out.print(tarArr[i] + " ");
////        }
////        System.out.println();
//        Arrays.sort(srcArr);
//        Arrays.sort(tarArr);
//
////        for (int i = 0; i < srcArr.length; i++) {
////            System.out.print(srcArr[i] + " ");
////        }
////        System.out.println();
////        for (int i = 0; i < tarArr.length; i++) {
////            System.out.print(tarArr[i] + " ");
////        }
//
//        int partition = 0;
//        for (int i = 0; i < srcArr.length; i++) {
//            if (!tarString.contains(srcArr[i])) {
//                partition++;
//            }
//        }
//        for (int i = 0; i < tarArr.length; i++) {
//            if (!srcString.contains(tarArr[i])) {
//                partition++;
//            }
//        }
//        System.out.println("(" + partition + "," + tarArr.length + ")");
//    }
//
//    public static String preHandle(String str) {
//        str = str.replace(",","!");
//        str = str.replace(".","!");
//        StringBuilder string = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ' ') {
//                string.append(str.charAt(i));
//                continue;
//            }
//            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
//                string.append(str.charAt(i));
//            } else {
//                string.append(" ").append(str.charAt(i)).append(" ");
//            }
//        }
//        return string.toString();
//    }
}
