package Common;

import java.util.HashMap;

public class Window {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            insertToMap(need, ch);
        }

        int left = 0;
        int right = 0;
        int validNum = 0;
        int start = 0, len = 9999;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;

            if (need.containsKey(c)) {
                insertToMap(window, c);
                if (window.get(c) == need.get(c)) {
                    validNum++;
                }
            }

            while (validNum == need.size()) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                char tmp = s.charAt(left);
                left++;

                if (need.containsKey(tmp)) {
                    if (window.get(tmp) == need.get(tmp)) {
                        validNum--;
                    }
                    int value = window.get(tmp);
                    window.put(tmp, value - 1);
                }
            }
        }
        return len == 9999 ? "" : s.substring(start, len);
    }

    public static void insertToMap(HashMap<Character, Integer> hashMap, char ch) {
        if (hashMap.containsKey(ch)) {
            int value = hashMap.get(ch);
            hashMap.put(ch, value + 1);
        } else {
            hashMap.put(ch, 1);
        }
    }
}
