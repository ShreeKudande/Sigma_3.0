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

class Main {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        //add
        public static void add(int data) { //O(1)
            if(rear == size-1) {
                System.out.println("queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        //remove
        public static int remove() { //O(n)
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];
            for(int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            return front;
        }

        //peak
        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}