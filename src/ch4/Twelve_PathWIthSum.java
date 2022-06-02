package ch4;

/**
 * @author Xu Zheng
 * @description
 */
public class Twelve_PathWIthSum {

    int countPathWithSum(TreeNode root, int target) {
        if (root == null) {
            return 0;
        }

        int numOfPathFromRoot = countPathFromNode(root, target, 0, 0);
        int numOfPathFromLeftChild = countPathFromNode(root.left, target, 0, 0);
        int numOfPathFromRightChild = countPathFromNode(root.right, target, 0, 0);

        return numOfPathFromRoot + numOfPathFromLeftChild + numOfPathFromRightChild;
    }

    int countPathFromNode(TreeNode node, int target, int currentSum, int pathNum) {
        if (node == null){
            return pathNum;
        }
        currentSum += node.val;
        if (currentSum == target){
            pathNum++;
        }

        pathNum += countPathFromNode(node.left, target, currentSum, pathNum);
        pathNum += countPathFromNode(node.right, target, currentSum, pathNum);
        return pathNum;
    }
}
