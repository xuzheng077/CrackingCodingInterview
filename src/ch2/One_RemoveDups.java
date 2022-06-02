package ch2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Xu Zheng
 * @description
 */
class LinkedListNode {
    int data;
    LinkedListNode next;
}

public class One_RemoveDups {
    private static void deleteDupsOne(LinkedListNode n) {
        LinkedListNode previous = null;
        Set<Integer> set = new HashSet<>();
        while (n != null) {
            if (set.contains(n.data)) {
                previous.next = n.next;
            } else {
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }
        //this is O(n) time
    }

    private static void deleteDupsTwo(LinkedListNode n) {
        //this one takes O(n^2) time since we are not allowed to have an extra buffer
        //we will use 2 pointers to iterate
        //will implement later
    }

    public static void main(String[] args) {

    }
}
