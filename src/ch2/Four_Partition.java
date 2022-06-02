package ch2;

/**
 * @author Xu Zheng
 * @description
 */
public class Four_Partition {
    private static LinkedListNode partition(LinkedListNode node, int x) {
        LinkedListNode head = node;
        LinkedListNode next = null;
        while (node != null && node.next != null) {
            next = node.next;
            if (next.data < x) {
                node.next = next.next;
                next.next = head;
                head = next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode nodeA = new LinkedListNode();
        nodeA.data = 1;
        LinkedListNode nodeB = new LinkedListNode();
        nodeB.data = 2;
        LinkedListNode nodeC = new LinkedListNode();
        nodeC.data = 0;
        LinkedListNode nodeD = new LinkedListNode();
        nodeD.data = 3;
        LinkedListNode nodeE = new LinkedListNode();
        nodeE.data = 4;
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = null;
        LinkedListNode result = partition(nodeA, 1);
        while (result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }
}
