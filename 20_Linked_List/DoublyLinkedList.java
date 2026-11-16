public class DoublyLinkedList {     

    public class Node {
        Node prev;
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // remove first
    public void removeFirst() {
        if(head == null) {
            System.out.println("Doubly Linked List is empty,..");
            return;
        }
        if(size == 1) {
            head = tail = null;
            size--;
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // remove last
    public void removeLast() {
        if(head == null) {
            System.out.println("Doubly Linked List is empty,..");
            return;
        }
        if(size == 1) {
            head = tail = null;
            size--;
            return;
        }

        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

    //print
    public void print() {
        Node temp = head;
        System.out.print("null <-> ");
        while(temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    

    public static void main(String[] args) {
        // Doubly Linked List
        /*
        A Doubly Linked List (DLL) is a sequential data structure where each node holds three things: the data itself, a pointer to the next node, and a pointer to the previous node. If a standard linked list is a one-way street, a DLL is a two-way street that lets you traverse seamlessly in both directions.

        null <-- Prev | Data | Next --> null

        As you can see in the structure above, having references to both sides makes operations like deleting a specific node or traversing backwards much faster, with the only trade-off being the slight memory overhead of storing that extra 'previous' pointer. It is the exact underlying logic used for everyday features like a browser's back-and-forward buttons or undo/redo stacks.
        */

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.removeFirst();
        dll.addLast(4);
        dll.print();
        dll.removeLast();
        dll.print();
        System.out.println(dll.size);

        // Reverse a Doubly Linked List
        dll.reverse();
        dll.print();

        // Circular Linked List
        // A variation of a linked list where the last node connects back to the first node (head) instead of pointing to null, forming a continuous loop.

        // Based on your diagrams:
        // 1. Singly Circular: The last node's 'next' pointer points back to the head.
        // 2. Doubly Circular: The last node's 'next' points to the head, and the head's 'prev' pointer links back to the last node.

    }
}
