package Common;

import model.TreeNode;

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

    public static void preOrderProcess(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrderProcess(root.left);
        preOrderProcess(root.right);
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
    }

    public static void inOrderProcess(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderProcess(root.left);
        System.out.print(root.value + " ");
        inOrderProcess(root.right);
    }

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

        /**
         *   递归前序遍历二叉树
         */
        System.out.println("递归二叉树前序遍历：");
        preOrderProcess(root);

        /**
         *  递归中序遍历二叉树
         */
        System.out.println("\n");
        System.out.println("递归二叉树中序遍历：");
        inOrderProcess(root);

        /**
         *  递归中序遍历二叉树
         */
        System.out.println("\n");
        System.out.println("递归二叉树后序遍历：");
        reOrderProcess(root);

    }
}
