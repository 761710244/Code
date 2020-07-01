package Common;

import model.TreeNode;

import java.util.Stack;

public class CommonTreeNode {

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
     * 递归后序遍历二叉树
     */
    public static void reOrderProcess(TreeNode root) {
        if (root == null) {
            return;
        }
        reOrderProcess(root.left);
        reOrderProcess(root.right);
        System.out.print(root.value + " ");
    }

    public static void main(String[] args) {

        TreeNode root = generateTree();

        System.out.println("递归二叉树前序遍历：");
        preOrderProcess(root);

        System.out.println("\n非递归二叉树前序遍历：");
        preOrder(root);

        System.out.println("\n递归二叉树中序遍历：");
        inOrderProcess(root);

        System.out.println("\n递归二叉树后序遍历：");
        reOrderProcess(root);

    }
}
