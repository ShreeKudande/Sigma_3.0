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

    //Methods
    public void addFirst(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
    }
}
