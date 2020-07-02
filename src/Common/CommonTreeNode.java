package Common;

import model.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class CommonTreeNode {

    /**
     * 产生一个树
     *
     * @return
     */
    public static TreeNode generateTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);
        return root;
    }

    /**
     * 递归前序遍历二叉树
     *
     * @param root
     */
    public static void preOrderProcess(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrderProcess(root.left);
        preOrderProcess(root.right);
    }

    /**
     * 非递归前序遍历二叉树
     *
     * @param root
     */
    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode t = stack.pop();
            System.out.print(t.value + " ");
            if (t.right != null) stack.add(t.right);
            if (t.left != null) stack.add(t.left);
        }
    }

    /**
     * 递归中序遍历二叉树
     *
     * @param root
     */
    public static void inOrderProcess(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderProcess(root.left);
        System.out.print(root.value + " ");
        inOrderProcess(root.right);
    }

    /**
     * 非递归中序遍历
     *
     * @param root
     */
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                stack.add(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                System.out.print(cur.value + " ");
                cur = cur.right;
            }
        }
    }

    /**
     * 递归后序遍历二叉树
     *
     * @param root
     */
    public static void reOrderProcess(TreeNode root) {
        if (root == null) {
            return;
        }
        reOrderProcess(root.left);
        reOrderProcess(root.right);
        System.out.print(root.value + " ");
    }

    /**
     * 非递归后序遍历
     *
     * @param root
     */
    public static void reOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(root);
        while (!stack1.isEmpty()) {
            TreeNode t = stack1.pop();
            stack2.add(t);
            if (t.left != null) stack1.add(t.left);
            if (t.right != null) stack1.add(t.right);
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().value + " ");
        }
    }

    /**
     * 层次遍历
     *
     * @param root
     */
    public static void floorOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            TreeNode t = deque.pop();
            System.out.print(t.value + " ");
            if (t.left != null) deque.add(t.left);
            if (t.right != null) deque.add(t.right);
        }
    }

    /**
     * 之字形打印二叉树
     *
     * @param root
     * @return
     */
    public static ArrayList<ArrayList<Integer>> zhiOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();
        if (root == null) {
            return arrayLists;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        int flag = 1;
        while (!deque.isEmpty()) {
            int size = deque.size();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode t = deque.pop();
                System.out.print(t.value + " ");
                if (flag % 2 == 1) {
                    arrayList.add(t.value);
                } else {
                    arrayList.add(0, t.value);
                }
                if (t.left != null) deque.add(t.left);
                if (t.right != null) deque.add(t.right);
            }
            flag++;
            arrayLists.add(arrayList);
        }
        return arrayLists;
    }

    /**
     * 二叉树的左视图
     *
     * @param root
     */
    public static void leftView(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode t = deque.pop();
                if (i == 0) {
                    System.out.print(t.value + " ");
                }
                if (t.left != null) deque.add(t.left);
                if (t.right != null) deque.add(t.right);
            }
        }
    }

    /**
     * 二叉树的右视图
     *
     * @param root
     */
    public static void rightView(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode t = deque.pop();
                if (i == 0) {
                    System.out.print(t.value + " ");
                }
                if (t.right != null) deque.add(t.right);
                if (t.left != null) deque.add(t.left);
            }
        }
    }



    public static void main(String[] args) {

        TreeNode root = generateTree();

        System.out.println("递归二叉树前序遍历：");
        preOrderProcess(root);

        System.out.println("\n非递归二叉树前序遍历：");
        preOrder(root);

        System.out.println("\n递归二叉树中序遍历：");
        inOrderProcess(root);

        System.out.println("\n非递归二叉树中序遍历：");
        inOrder(root);

        System.out.println("\n递归二叉树后序遍历：");
        reOrderProcess(root);

        System.out.println("\n非递归二叉树后序遍历：");
        reOrder(root);

        System.out.println("\n之字形遍历：");
        ArrayList<ArrayList<Integer>> arrayLists = zhiOrder(root);

        System.out.println("\n层次左->右打印：");
        floorOrder(root);

        System.out.println("\n二叉树左视图：");
        leftView(root);

        System.out.println("\n二叉树右视图：");
        rightView(root);

    }
}
