package ch2;

/**
 * @author Xu Zheng
 * @description
 */
public class Six_Palindrome {
    //1.Reverse and compare
    private static boolean isPalindrome(LinkedListNode head) {
        //get a reversed list
        LinkedListNode p = head;
        LinkedListNode newHead = null;
        while (p != null) {
            LinkedListNode newNode = new LinkedListNode();
            newNode.data = p.data;
            newNode.next = newHead;
            newHead.next = newNode;
            p = p.next;
        }
        //compare
        while (newHead != null && head != null) {
            if (newHead.data != head.data){
                return false;
            }
            newHead = newHead.next;
            head = head.next;
        }
        return newHead == null && head == null; //in case the length is different, the two heads must be null
    }

    //2.

    public static void main(String[] args) {

    }
}
