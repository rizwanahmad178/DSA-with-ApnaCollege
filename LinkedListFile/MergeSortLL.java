package LinkedListFile;

import java.util.LinkedList;

// import java.util.LinkedList;
public class MergeSortLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        //5->4->3->2->1
        ll.print();
        ll.head = ll.MergeSortLL(ll.head);
        ll.print();
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node midNode = getMid(head);

        Node rightHead = midNode.next;
        midNode.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node newLeft, Node newRight){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(newLeft!=null && newRight!=null){
            if(newLeft.data <= newRight.data){
                temp.next = newLeft;
                newLeft = newLeft.next;
                temp = temp.next;
            }else{
                temp.next = newRight;
                temp = temp.next;
                newRight = newRight.next;
            }
        }
        while(newLeft!= null){
            temp.next = newLeft;
            newLeft = newLeft.next;
            temp = temp.next;
        }
        while(newRight!= null){
            temp.next = newLeft;
            newRight = newRight.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }
}
