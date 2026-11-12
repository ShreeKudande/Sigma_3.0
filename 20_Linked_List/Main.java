/*
 * What is a Linked List?
 * A linear data structure where elements are not stored in continuous memory locations.
 * Instead, each element (Node) contains its own data and a reference (pointer) to the next Node, forming a chain.
 *
 * - Dynamic size (grows and shrinks as needed)
 * - Fast insertions and deletions compared to arrays
 * - Requires sequential access starting from the Head node
 */

public class Main {

    public static void main(String[] args) {
        // Basic Operations (Add, Remove, Print, Size)
        // LinkedList ll = new LinkedList();

        // ll.print();
        // ll.addFirst(2); // addFirst
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(3); // addLast
        // ll.print();
        // ll.addLast(4);

        // ll.add(0, 9); // add in mid
        // ll.print(); // print linked list

        // System.out.println("linked list size: " + ll.size); // size of linked list - O(1)

        // System.out.println("rmd head: " + ll.removeFirst()); // remove the head from linked list
        // ll.print();

        // System.out.println("rmd tail: " + ll.removeLast()); // remove tail from ll
        // ll.print();
        // System.out.println("linked list size: " + ll.size);


        // Search Operations (Iterative & Recursive)
        // Search for a key in a Linked List. Return the position where it is found. If not found, return -1;

        // LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);

        // Search (Iterative (loop))
        // System.out.println(ll.itrSearch(5));
        // System.out.println(ll.itrSearch(10));
        // ll.print(); // 1->2->3->4->5->null

        // Search (Recursive)
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(6));
        // ll.print();


        // Reverse & Remove Nth Node from End
        // Reverse a Linked List - Iterative Approach (Classical & Important Question)
        // ll.reverse();
        // ll.print();

        // Find & Remove Nth node from End (Iterative Approach)
        // ll.removeNthNode(2);
        // ll.print();


        // Check if LL is a Palindrome
        // 1st approach would be to solve it using help of other data structures like array or array list,
        // where we copy elements of linked list to array list and then check if its palindrome,
        // this approach would give us time & space complexity of O(n).
        // But we would solve it using constant space O(1).

        // LinkedList ll = new LinkedList();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);

        // ll.print(); // 1->2->2->1
        // System.out.println(ll.checkPalindrome()); // returns true

        /*
         * This problem is a classic pattern builder that teaches how to break down a complex requirement
         * into standard, reusable sub-problems. It demonstrates how to achieve O(1) space complexity by
         * manipulating memory in-place, rather than taking the easy route of dumping nodes into an array or stack.
         *
         * Core Concepts Applied:
         * - Algorithmic Modularity: Chaining distinct, smaller logic blocks together to solve the larger issue (Find Mid -> Reverse -> Compare).
         * - Two-Pointer Technique (Slow/Fast): Moving pointers at different speeds to find the exact middle of the data structure in a single pass.
         * - In-Place Reversal: Rewiring node pointers (prev, curr, next) safely to reverse the second half of the list without losing references or using extra memory.
         * - Space Optimization: Achieving O(n) time while strictly maintaining O(1) auxiliary space.
         */


        // Floyd's Cycle Finding Algorithm
        /*
         * Floyd's Cycle Finding Algorithm
         * Purpose: Detects if a Linked List contains a loop or cycle.
         *
         * How it works (Two Runners Analogy):
         * Think of two runners on a track. If the track is straight, the faster runner simply reaches the end.
         * If the track has a circular loop, the faster runner will eventually lap the slower runner, and they will meet.
         *
         * Step-by-Step Logic:
         * 1. Initial Setup: Use two pointers, a `slow` pointer and a `fast` pointer, both starting at the `head` of the linked list.
         * 2. Traverse at Different Speeds: Inside a `while` loop, move the `slow` pointer forward by 1 node (+1) and the `fast` pointer forward by 2 nodes (+2).
         * 3. Closing the Distance: The relative distance between them changes steadily by 1 unit per move, guaranteeing they will eventually land on the same node if a loop exists.
         * 4. Cycle Confirmed: If the condition `slow == fast` is met, a cycle is confirmed (return `true`).
         * 5. No Cycle: If the `fast` pointer (or its next node) reaches `null` `while (f != null && f.next != null)`, it means we hit the end of the list, breaking the loop (return `false`).
         */

        // Detect a Loop/Cycle in a Linked List
        // LinkedList.head = new LinkedList.Node(1);
        // LinkedList.head.next = new LinkedList.Node(2);
        // LinkedList.head.next.next = new LinkedList.Node(3);
        // LinkedList.head.next.next.next = LinkedList.head;
        // 1->2->3->1
        // System.out.println(LinkedList.isCycle());

        // Removing a Loop/Cycle in a Linked List
        //1.Detect if Cycle even exists.
        //a.slow = head
        //b.slow -> +1
        //  fast -> +1
        // As both grows by one after there first meet, there second meet would be exactly at the node where the cycle started or connected to the node.
        //and assign null to the prev of fast

        // LinkedList.head = new LinkedList.Node(1);
        // LinkedList.Node temp = new LinkedList.Node(2);
        // LinkedList.head.next = temp;
        // LinkedList.head.next.next = new LinkedList.Node(3);
        // LinkedList.head.next.next.next = temp;
        // // 1->2->3->2

        // System.out.println(LinkedList.isCycle());
        // LinkedList.removeCycle();
        // System.out.println(LinkedList.isCycle());

        // Removing Cycle Explanation (Math)

        //Java Collections Framework
        // The Java Collections Framework (JCF) is a standard library in Java that provides ready-made data structures—like lists, sets, and maps—so you can easily store and manage groups of objects without having to write the code from scratch.

    }
}

class LinkedList {

    public static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; // size of a linked list
    // Method

    public void addFirst(int data) { // O(1)
        // step1 - create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 - newNode next = head
        newNode.next = head; // link

        // step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) { // O(1)
        // step1 - create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 - point tail.next = newNode
        tail.next = newNode;

        // step3 - tail = newNode
        tail = newNode;
    }

    public void print() { // O(n)
        if (head == null) {
            System.out.println("It's empty...");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void add(int idx, int data) { // add in the mid of linked list
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp --> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("It's empty...");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
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
        if (size == 0) {
            System.out.println("It's empty...");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev : i = size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int idx = 0;

        while (temp != null) {
            if (temp.data == key) { // key found
                return idx;
            }
            temp = temp.next;
            idx++;
        }

        return -1; // key not found
    }

    public int helper(Node head, int key) { // O(n)
        if (head == null) { // base case
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() { // O(n)
        // 3 Variables
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            // 4 Steps
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void removeNthNode(int n) { // (size-n+1) | O(n)
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // delete the first node if n = size, from end to start
        if (n == sz) {
            head = head.next;
            return;
        }

        // sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
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

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }

        return slow; // slow is my midNode
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // step1 - find mid
        Node midNode = findMid(head);

        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head; // left half head

        // step3 - check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static boolean isCycle() { //Floyd's CFA
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if (slow == fast) {
                return true; // cycle exists
            }
        }

        return false; // cycle does not exist
    }

    public static void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
                return;
        }

        //find meeting point
        slow = head;
        Node prev = null; //last node
        while(slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        //remove cycle -> last.next = null
        prev.next = null;
    }
}
