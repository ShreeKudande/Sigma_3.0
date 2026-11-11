/*
What is a Linked List?
A linear data structure where elements are not stored in continuous memory locations. 
Instead, each element (Node) contains its own data and a reference (pointer) to the next Node, forming a chain.

- Dynamic size (grows and shrinks as needed)
- Fast insertions and deletions compared to arrays
- Requires sequential access starting from the Head node
*/

public class Main {

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        // ll.print();
        ll.addFirst(2); // addFirst
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(3); // addLast
        // ll.print();
        ll.addLast(4);

        ll.add(0, 9); // add in mid
        ll.print(); // print linked list

        System.out.println("linked list size: " + ll.size); // size of linked list - O(1)

        System.out.println("rmd head: " + ll.removeFirst()); //remove the head from linked list
        ll.print();

        System.out.println("rmd tail: " + ll.removeLast()); //remove tail from ll
        ll.print();
        System.out.println("linked list size: " + ll.size);

    }
}

class LinkedList {
    public static class Node {
        int data;
        Node next;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; // size of a linked list

    //Methods
    public void addFirst(int data) { // O(1)
        // step1 - create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // step2 - newNode next = head
        newNode.next = head; //link

        // step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) { // O(1)
        // step1 - create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // step2 - point tail.next = newNode
        tail.next = newNode;

        // step3 - tail = newNode
        tail = newNode;
    }

    public void print() { // O(n)
        if(head == null) {
            System.out.println("It's empty...");
            return;
        }

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void add(int idx, int data) { // add in the mid of link list
        if(idx == 0) {
            addFirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp --> prev  
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("It's empty...");
            return Integer.MAX_VALUE;
        } else if(size == 1) {
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

    public int removeLast() {
        if(size == 0) {
            System.out.println("It's empty...");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev : i = size-2
        Node prev = head;
        for(int i = 0; i < size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int idx = 0;

        while(temp != null) {
            if(temp.data == key) { //key found
                return idx;
            }
            temp = temp.next;
            idx++;
        }

        return -1; //key not found
    }

    public int helper(Node head, int key) { // O(n)
        if(head == null) { // base case
            return -1;
        }

        if(head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() { // O(n)
        // 3 Variables
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            //4 Steps
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void removeNthNode(int n) { // (size-n+1) | O(n)
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }

        //delete the first node if n = size, from end to start
        if(n == sz) {
            head = head.next;
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // Slow-Fast Approach - for both even or odd Linked List
    public Node findMid(Node head) { // helper fnx
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }

        return slow; //slow is my midNode
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        
        //step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head
        Node left = head; //left half head

        //step3 - check left half & right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
}
