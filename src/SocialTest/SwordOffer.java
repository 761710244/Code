package SocialTest;

import java.util.ArrayList;

public class SwordOffer {

    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    ArrayList<TreeLinkNode> inOrder = new ArrayList<TreeLinkNode>();

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        TreeLinkNode root = pNode;
        while (root != null) {
            root = root.next;
        }
        getInOrder(root);

        for (int i = 0; i < inOrder.size() - 1; i++) {
            if (pNode.val == inOrder.get(i).val) {
                inOrder.get(i + 1);
            }
        }
        return null;
    }

    private void getInOrder(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        getInOrder(root.left);
        inOrder.add(root);
        getInOrder(root.right);
    }

    public int minNumberInRotateArray(int[] array) {
        int minNum = 10001;
        for (int i = 0; i < array.length; i++) {
            minNum = Math.min(array[i], minNum);
        }
        return minNum;
    }
}
