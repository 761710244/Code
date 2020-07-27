package test;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String, Boolean> map = new HashMap<>();
        map.put("ab", true);
        map.put("cd", false);
        map.put("ab", false);
        System.out.println(map.get("ab"));

        boolean flag = false;
        change(map);
        System.out.println(map.get("cd"));
    }

    private static void change(boolean flag) {
        flag = true;
    }

    private static void change(Map<String, Boolean> flag) {
        flag.put("cd", true);
        System.out.println(flag.get("cd"));
    }
}
