package test;

import sun.security.krb5.internal.crypto.HmacSha1Aes128CksumType;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        String srcString = in.split(";")[0];
        String tarString = in.split(";")[1];

        String[] srcArr = srcString.toLowerCase().split(" ");
        String[] tarArr = tarString.toLowerCase().split(" ");

        HashMap<String, Integer> srcHash = toHash(srcArr);
        HashMap<String, Integer> tarHash = toHash(tarArr);

        HashMap<Character, Integer> srcFlag = getFlag(srcString.toLowerCase());
        HashMap<Character, Integer> tarFlag = getFlag(srcString.toLowerCase());

        int res = 0;
        for (String index : srcHash.keySet()) {
            if (!tarHash.containsKey(index)) {
                res++;
            } else if (srcHash.get(index) != tarHash.get(index)) {
                res += Math.abs(srcHash.get(index) - tarHash.get(index));
            }
        }


        for (Character index : srcFlag.keySet()) {
            if (!tarFlag.containsKey(index)) {
                res++;
            } else if (srcFlag.get(index) != tarFlag.get(index)) {
                res += Math.abs(srcFlag.get(index) - tarFlag.get(index));
            }
        }

        int size = tarArr.length;
        int len = tarArr.length;
        len = hasflag(tarArr[size - 1]) ? len + 1 : len;
        System.out.println("(" + res + "," + len + ")");

    }

    public static HashMap<String, Integer> toHash(String[] arr) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], 1);
            } else {
                int cnt = hashMap.get(arr[i]);
                hashMap.put(arr[i], cnt + 1);
            }
        }
        return hashMap;
    }

    public static HashMap<Character, Integer> getFlag(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                continue;
            }
            if (!hashMap.containsKey(str.charAt(i))) {
                hashMap.put(str.charAt(i), 1);
            } else {
                int cnt = hashMap.get(str.charAt(i));
                hashMap.put(str.charAt(i), cnt = 1);
            }
        }

        return hashMap;
    }

    public static boolean hasflag(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                continue;
            }
            return true;
        }
        return false;
    }
}
