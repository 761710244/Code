package test;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String tag = "StorageLog_12863781";
        System.out.println(tag);
        tag = tag.contains("StorageLog_") ? tag.split("_")[0] : tag;
        System.out.println(tag);


        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(4, 5);
        hashMap.put(2, 3);
        hashMap.put(3, 8);

        for (int i : hashMap.keySet()) {
            System.out.println(i + " " + hashMap.get(i));
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(4, 5);
        map.put(2, 3);
        map.put(3, 8);

        for (int i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }


    }
}
