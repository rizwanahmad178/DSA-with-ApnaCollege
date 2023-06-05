package LinkedListFile;

import java.util.LinkedList;

public class LinkedListClass {
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
        LinkedListClass list = new LinkedListClass();
        // list.printList();
        // list.addFirst(2);
        // list.addFirst(1);
        // list.addLast(4);
        // list.addLast(5);
        // list.printList();
        // list.add(2,3);
        // list.printList();
        // //System.out.println("Size of the Linked List : "+size);
        // list.removeFirst();
        // list.printList();
        // list.removeLast();
        // list.printList();
        // System.out.println(list.itrSearch(31));
        // System.out.println(list.recSearch(2));
        // list.reverse();
        // list.printList();
        // list.deleteNthFromEnd(3);
        // list.printList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(1);
        System.out.println("List is Palindrome (True/False): "+list.checkPalindrome());
    }

    public boolean checkPalindrome(){
        //base case
        if(head==null || head.next==null){
            return true;
        }
        //find mid Node
        Node midNode = findNode(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public Node findNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void deleteNthFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        int i = 1;
        int idx = sz-n;
        Node prev = head;
        while(i<idx){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        head = prev;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx + 1;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
