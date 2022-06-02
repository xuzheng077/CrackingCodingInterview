package ch2;

import java.util.HashSet;

/**
 * @author Xu Zheng
 * @description
 */
public class Eight_LoopDetection {
    //if no loop, return null
    //if detects a loop, return beginning node
    private static LinkedListNode findBeginningOne(LinkedListNode node){
        HashSet<LinkedListNode> set = new HashSet<>();
        while(node != null){
            if (set.contains(node)){
                return node;
            }else {
                set.add(node);
                node = node.next;
            }
        }
        return null;
    }

    //textbook solution
    private static LinkedListNode findBeginningTwo(LinkedListNode node){

        return null;
    }



    public static void main(String[] args) {
        LinkedListNode nodeA = new LinkedListNode();
        nodeA.data = 0;
        LinkedListNode nodeB = new LinkedListNode();
        nodeB.data = 1;
        LinkedListNode nodeC = new LinkedListNode();
        nodeC.data = 2;
        LinkedListNode nodeD = new LinkedListNode();
        nodeD.data = 3;
        LinkedListNode nodeE = new LinkedListNode();
        nodeE.data = 4;
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeB;
        LinkedListNode result = findBeginningOne(nodeA);
        System.out.println(result.data);

    }
}
