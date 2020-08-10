package test;

import java.util.ArrayList;

public class aliCTO {

    public static void main(String[] args) {
        String str = "bbbbb";
        System.out.println(getLongestSubString(str));
    }

    private static int getLongestSubString(String str) {
        if (str == null) {
            return 0;
        }
        ArrayList<Character> window = new ArrayList<>();
        int left = 0;
        int right = 0;
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (!window.contains(cur)) {
                right++;
                window.add(cur);
            } else if (window.get(0) == cur) {
                left++;
                right++;
                window.remove(window.get(0));
                window.add(cur);
            } else {
                left = i - 1;
                right = i;
                window.clear();
                window.add(cur);
            }
            res = (right - left) > res ? (right - left) : res;
        }
        return res;
    }
}
