package test;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
//        String tag = "StorageLog_12863781";
//        System.out.println(tag);
//        tag = tag.contains("StorageLog_") ? tag.split("_")[0] : tag;
//        System.out.println(tag);
//
//
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(4, 5);
        hashMap.put(2, 3);
        hashMap.put(3, 8);

        for (int i : hashMap.keySet()) {
            System.out.println(i + " " + hashMap.get(i));
        }

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String[] arr = new String[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.next();
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
