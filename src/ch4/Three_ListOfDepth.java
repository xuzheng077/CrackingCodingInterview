package ch4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Xu Zheng
 * @description
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }
}

public class Three_ListOfDepth {
    public static void main(String[] args) {

    }

    ArrayList<LinkedList<TreeNode>> createListOfDepth(TreeNode root){
        ArrayList<LinkedList<TreeNode>> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        LinkedList<TreeNode> currentLevel = new LinkedList<>();
        currentLevel.add(root);
        while (currentLevel.size() > 0){
            list.add(currentLevel);
            LinkedList<TreeNode> lastLevel = currentLevel;
            currentLevel = new LinkedList<>();
            for (TreeNode t: lastLevel){
                if(t.left != null){
                    currentLevel.add(t.left);
                }
                if (t.right != null){
                    currentLevel.add(t.right);
                }
            }
        }
        return list;
    }
}
