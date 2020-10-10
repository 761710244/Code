package Common;

import model.ListNode;
import model.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class Sword {

    /**
     * 二维数组中的查找
     *
     * @param target
     * @param array
     * @return
     */
    public static boolean Find(int target, int[][] array) {
        int line = array.length;
        int col = array[0].length;
        int i = line - 1;
        int j = 0;
        while (i >= 0 && j < col) {
            if (array[i][j] < target) {
                j++;
            } else if (array[i][j] > target) {
                i--;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * 替换空格
     *
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                res.append("%").append("2").append("0");
            } else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

    /**
     * 从头到尾打印链表
     *
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        if (listNode == null) {
            return arraylist;
        }
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()) {
            int val = stack.pop();
            arraylist.add(val);
        }
        return arraylist;
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length < 1) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        int pos = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                pos = i;
                break;
            }
        }
        int[] leftPre = new int[pos];
        int[] leftIn = new int[pos];
        int[] rightPre = new int[in.length - 1 - pos];
        int[] rightIn = new int[in.length - 1 - pos];
        for (int i = 0; i < pos; i++) {
            leftIn[i] = in[i];
            leftPre[i] = pre[i + 1];
        }
        for (int i = pos + 1, j = 0; i < in.length; i++, j++) {
            rightIn[j] = in[i];
            rightPre[j] = pre[i];
        }
        root.left = reConstructBinaryTree(leftPre, leftIn);
        root.right = reConstructBinaryTree(rightPre, rightIn);
        return root;
    }
}
