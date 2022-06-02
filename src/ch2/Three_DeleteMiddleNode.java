package ch2;

/**
 * @author Xu Zheng
 * @description
 */
public class Three_DeleteMiddleNode {
    //copy the data of the next node, and delete next node
    //return true if successful, false if not
    //why false? note that if node is the last in list, it cannot be deleted, so return false
    private static boolean deleteMiddleNode(LinkedListNode node){
        if (node == null || node.next == null){
            return false;
        }
        LinkedListNode next = node.next;
        node.data = next.data;
        node.next = next.next;
        return true;
    }

    public static void main(String[] args) {

    }
}
