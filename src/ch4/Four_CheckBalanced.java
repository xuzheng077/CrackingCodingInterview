package ch4;

/**
 * @author Xu Zheng
 * @description
 */

/*
     1
   2   3
 4  5 6  7
 */

public class Four_CheckBalanced {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        node1.left = node2;node1.right = node3;
        node2.left = node4;node2.right = node5;
        node3.left = node6;node3.right = node7;
        node4.left = node8;
        node8.left = node9;
        System.out.println(isBalanced(node1));
    }

    static int getDepth(TreeNode node){
        if (node == null){
            return 0;
        }

        int leftDepth = getDepth(node.left);
        if (leftDepth == -1){
            return -1;
        }
        int rightDepth = getDepth(node.right);
        if (rightDepth == -1){
            return -1;
        }
        if (Math.abs(leftDepth - rightDepth) > 1){
            return -1;
        }
        return Math.max(leftDepth, rightDepth) + 1;
    }

    static boolean isBalanced(TreeNode root){
        int depth = getDepth(root);
        return depth == -1 ? false: true;
    }

}
