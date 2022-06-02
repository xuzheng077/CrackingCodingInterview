package ch2;

/**
 * @author Xu Zheng
 * @description
 */
public class Five_SumList {
    //Reverse Order
    private static LinkedListNode sumList(LinkedListNode node1, LinkedListNode node2) {

        return recursion(node1, node2, 0);
    }

    //recursive method
    private static LinkedListNode recursion(LinkedListNode node1, LinkedListNode node2, int carry) {
        LinkedListNode node = new LinkedListNode();
        if (node1 == null && node2 == null) {
            if (carry == 0){
                return null;
            }
            node.data = carry;
            return node;
        }
        if (node1 == null && node2 != null) {
            int sum = node2.data + carry;
            node.data = sum % 10;
            carry = sum / 10;
            node.next = recursion(null, node2.next, carry);
            return node;
        }
        if (node2 == null && node1 != null) {
            int sum = node1.data + carry;
            node.data = sum % 10;
            carry = sum / 10;
            node.next = recursion(node1.next, null, carry);
            return node;
        }
        int sum = node1.data + node2.data + carry;
        node.data = sum % 10;
        carry = sum / 10;
        node.next = recursion(node1.next, node2.next, carry);
        return node;
    }

    //Forward Order (Not implemented)
    private static LinkedListNode sumListForward(LinkedListNode node1, LinkedListNode node2) {
        return null;
    }

    public static void main(String[] args) {
        LinkedListNode nodeA = new LinkedListNode();
        nodeA.data = 7;
        LinkedListNode nodeB = new LinkedListNode();
        nodeB.data = 1;
        LinkedListNode nodeC = new LinkedListNode();
        nodeC.data = 6;

        LinkedListNode nodeD = new LinkedListNode();
        nodeD.data = 5;
        LinkedListNode nodeE = new LinkedListNode();
        nodeE.data = 9;
        LinkedListNode nodeF = new LinkedListNode();
        nodeF.data = 2;

        nodeA.next = nodeB;
        nodeB.next = nodeC;

        nodeD.next = nodeE;
        nodeE.next = nodeF;

        LinkedListNode result = sumList(nodeA, nodeD);
        while (result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }
}
