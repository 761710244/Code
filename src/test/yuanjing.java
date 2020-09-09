package test;

public class yuanjing {

    /**
     * 1    输入一个数，求其阶乘的值中有多少个0
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int two = 0;
//        int five = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                two++;
//            }
//            if (i % 5 == 0) {
//                five++;
//            }
//        }
//        int min = Math.min(two, five);
//        System.out.println(min * min);
//    }

    /**
     * 2    判断输入的字符串的括号是否合法
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < line.length(); i++) {
//            if (line.charAt(i) == '{' || line.charAt(i) == '[') {
//                stack.push(line.charAt(i));
//            } else if (line.charAt(i) == '"') {
//                if (!stack.isEmpty() && stack.peek() == '"') {
//                    stack.pop();
//                } else {
//                    stack.push(line.charAt(i));
//                }
//            } else if (line.charAt(i) == '}') {
//                if (!stack.isEmpty() && stack.peek() == '{') {
//                    stack.pop();
//                }
//            } else if (line.charAt(i) == ']') {
//                if (!stack.isEmpty() && stack.peek() == '[') {
//                    stack.pop();
//                }
//            }
//        }
//        System.out.println(stack.isEmpty() ? "true" : "false");
//    }
}