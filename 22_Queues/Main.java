/*
 Queues -
  1. CORE PRINCIPLE: FIFO (First In, First Out)
     - The first element added is the first one removed (like a ticket line; opposite of a Stack's LIFO).
     - Operates at two ends:
          Rear  (Entry) : New elements are added here.
          Front (Exit)  : Elements are removed or viewed from here.
 
       Front (Exit) <--- [ 1 | 2 | 3 | 4 ] <--- Rear (Entry)
 
  2. CORE OPERATIONS (Ideal Time Complexity)
     - Add    (Enqueue) : Insert an element at Rear          -> O(1)
     - Remove (Dequeue) : Remove & return element at Front   -> O(1)
     - Peek   (Front)   : View Front element without removal -> O(1)
     - Helpers          : isEmpty(), size()                  -> O(1)
 
  3. WAYS TO IMPLEMENT
     - Array         : Fixed size. Simple array removal is O(n) due to
                       shifting; Circular Queue brings it back to O(1).
     - LinkedList    : Dynamic size. O(1) for all ops using head & tail.
     - Two Stacks    : Interview pattern; either add or remove is O(n).
     - Java Built-in : Queue<Integer> q = new ArrayDeque<>(); // or LinkedList
 
  4. COMMON VARIANTS & USES
     - Variants : Circular Queue, Deque (Double-Ended), Priority Queue.
     - Uses     : BFS (Trees & Graphs), CPU/printer scheduling, buffers.
 */

import java.util.*;

class Main {

    static class ArrayQueue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        ArrayQueue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        //add
        // public static void add(int data) { //O(1)
        //     if(rear == size-1) {
        //         System.out.println("queue is full");
        //         return;
        //     }

        //     rear = rear + 1;
        //     arr[rear] = data;
        // }

        public static void add(int data) { //O(1)
            if(isFull()) {
                System.out.println("queue is full");
                return;
            }

            //add 1st element
            if(front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //remove
        // public static int remove() { //O(n)
        //     if(isEmpty()) {
        //         System.out.println("empty queue");
        //         return -1;
        //     }

        //     int front = arr[0];
        //     for(int i = 0; i < rear; i++) {
        //         arr[i] = arr[i+1];
        //     }
        //     rear = rear - 1;
        //     return front;
        // }

        public static int remove() { //O(1)
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int result = arr[front];
            
            // if theres only 1 last element in arr
            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        //peak
        // public static int peek() {
        //     if(isEmpty()) {
        //         System.out.println("empty queue");
        //         return -1;
        //     }

        //     return arr[0];
        // }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return arr[front];
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class QueuesUsingLL {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = tail = newNode;
                return;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public static int remove() {
            if(isEmpty()) {
                return -1;
            }

            int front = head.data;
            //single element
            if(tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        //Queues using Arrays | Circular Queue using Arrays
        /*
        * 1. Queue using Array (Normal):
        *    - add(): O(1) | peek(): O(1) | remove(): O(n)
        *    - Drawback: Fixed size + slow removal because every element shifts left
        *      (or empty front slots go to waste if we don't shift).
        *
        * 2. Circular Queue using Array:
        *    - add(): O(1) | peek(): O(1) | remove(): O(1)
        *    - Fix: Wraps back to index 0 using modulo (%) to reuse empty front slots—no shifting.
        *      -> rear  = (rear + 1) % size
        *      -> front = (front + 1) % size
        *      -> Full condition: (rear + 1) % size == front
        */
        // ArrayQueue q = new ArrayQueue(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while(!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        //Queues using Linked List
        // QueuesUsingLL q = new QueuesUsingLL();
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while(!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        //Queues using JCF's
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
