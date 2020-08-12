package test;

import java.util.Scanner;
import java.util.Stack;

public class genshuixue {


    public static void main(String[] args) {

//        String str1 = "abcd";
//        reverse(str1, -1, 4);


        Scanner in = new Scanner(System.in);

        String string = in.nextLine();

        String ans = reverseParentheses(string);

        System.out.println(ans);
    }

    public static String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                int left = stack.pop();
                s = reverse(s, left, i);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '(' && s.charAt(i) != ')') {
                stringBuffer.append(s.charAt(i));
            }
        }
        return stringBuffer.toString();
    }

    public static String reverse(String s, int left, int right) {
        if (left >= right) {
            return null;
        }
        StringBuffer newstr = new StringBuffer();
        StringBuffer oldstr = new StringBuffer();
        for (int i = left + 1; i < right; i++) {
            oldstr.append(s.charAt(i));
        }
        String old = oldstr.toString();
        for (int i = right - 1; i > left; i--) {
            newstr.append(s.charAt(i));
        }
        String tmp = newstr.toString();
        s = s.replace(old, tmp);
        return s;
    }
}
