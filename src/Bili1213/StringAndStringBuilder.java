package Bili1213;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        /**
         * StringBuilder 和 String
         */
        String s = "abc";
        StringBuilder stringBuilder = new StringBuilder(s);

        StringBuilder stringBuilder1 = new StringBuilder("hello");

        String s1 = stringBuilder1.toString();

        System.out.println(s1);

        //  拼接
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("hello,").append("Java");
        System.out.println(stringBuilder2.toString());
        //  反转
        System.out.println(stringBuilder2.reverse().toString());
    }
}
