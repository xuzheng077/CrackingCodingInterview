package ch2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Xu Zheng
 * @description
 */
public class Seven_Intersection {

    private static LinkedListNode findIntersection(LinkedListNode node1, LinkedListNode node2){
        Set<LinkedListNode> set = new HashSet<>();
        while(node1 != null){
            set.add(node1);
            node1 = node1.next;
        }
        while(node2 != null){
            if (set.contains(node2)){
                return node2;
            }
            node2 = node2.next;
        }
        return null;
    }

    //the textbook solution is a bit more complex,
    //applies when no additional data structure allowed(also easy to understand, Not implemented yet)

    public static void main(String[] args) {

    }
}
