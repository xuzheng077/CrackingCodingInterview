package ch2;

/**
 * @author Xu Zheng
 * @description
 */
class IntWrapper {
    int value = 0;
}

public class Two_ReturnKthToLast {
    //the easiest way, not so cool
    private static LinkedListNode printKthToLastOne(LinkedListNode node, int k) {
        if (node == null) {
            return null;
        }
        //get the length of list
        int n = 0;
        LinkedListNode head = node;
        while (node != null) {
            n++;
            node = node.next;
        }
        if (k > n) {
            return null;
        }
        int i = 1;
        //iterate from start to end
        while (i < n - k + 1) {
            head = head.next;
            i++;
        }
        return head;
    }

    //recursion, should use wrapper class
    private static LinkedListNode printKthToLastTwo(LinkedListNode node, int k) {
        IntWrapper intWrapper = new IntWrapper();
        return getKthToLast(node, k, intWrapper);
    }

    private static LinkedListNode getKthToLast(LinkedListNode node, int k, IntWrapper intWrapper) {
        if (node == null) {
            return null;
        }
        LinkedListNode p = getKthToLast(node.next, k, intWrapper);
        (intWrapper.value)++;
        if (intWrapper.value == k) {
            return node;
        }
        return p;
    }

    //iteration, this one is the coolest I suppose
    private static LinkedListNode printKthToLastThree(LinkedListNode node, int k) {
        LinkedListNode p1 = node;
        LinkedListNode p2 = node;
        //move p1 k steps
        for (int i = 0; i < k; i++) {
            if (p1 == null) {
                return null;
            }
            p1 = p1.next;
        }
        //move together until p1 reaches the end
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
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
        LinkedListNode res = printKthToLastTwo(nodeA, 6);
        System.out.println(res.data);
    }
}
