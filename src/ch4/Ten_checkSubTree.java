package ch4;

/**
 * @author Xu Zheng
 * @description
 */
public class Ten_checkSubTree {

    boolean checkSubTree(TreeNode t1, TreeNode t2){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        getOrderedString(t1, sb1);
        getOrderedString(t2, sb2);

        String s1 = sb1.toString();
        String s2 = sb2.toString();

        return s1.contains(s2);
    }

    void getOrderedString(TreeNode node, StringBuilder sb){
        if (node == null){
            sb.append("X");
            return;
        }
        sb.append(node.val);
        getOrderedString(node.left, sb);
        getOrderedString(node.right, sb);
    }
}
