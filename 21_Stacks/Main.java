/*
 What is a Stack?
 A linear data structure that follows the LIFO (Last In, First Out) principle.
 Think of it like a stack of plates: the last plate you put on top 
 is the very first one you pick up.

 Core Operations (All run in O(1) constant time):
 Push: Adds a new element to the top of the stack.
 Pop: Removes the element currently at the top of the stack.
 Peek: Looks at the top element without removing it.

 Implementations:
 1. Arrays: Fixed size.
 2. ArrayList: Variable size (expands automatically).
 3. LinkedList: Variable size. Typically uses a 'head' node to track 
 the top element for instant O(1) access.

 EXPLICIT VS. IMPLICIT STACK

 1. Explicit Stack:
 This is the actual data structure you manually write and control in your code.
 Example: Stack<Integer> st = new Stack<>();
 You decide exactly what data goes in and when to call push() or pop().

 2. Implicit Stack (Call Stack):
 This is the invisible stack managed automatically by the Java Virtual Machine (JVM).
 Every time a method is called, the JVM pushes that method's local 
 variables and state onto this stack. 
 When the method finishes executing, it is popped off.
 You don't write code to manipulate this stack; the system handles it entirely.
 This implicit stack is exactly what makes recursion possible in programming.
 */
// import java.util.ArrayList;
import java.util.*;

class Main {

    static class ALStack {
        static ArrayList<Integer> list = new ArrayList<>();
        
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        //push
        public static void push(int data) {
            list.add(data);
        }

        //pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }

            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            
            return list.get(list.size()-1);
        }
    }

    static class LLStack {
        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        //push
        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }

    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    
    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void stockSpan(int[] stocks, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                span[i] = i+1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }
    }

    public static void main(String args[]) {
        // Stacks using ArrayList
        // ALStack s = new ALStack();

        // Stacks using LinkedList
        // LLStack s = new LLStack();

        // Stacks using Collections Framework
        // Stack<Integer> s = new Stack<>();

        // s.push(1);
        // s.push(2);
        // s.push(3);

        // while(!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        // Push at the Bottom of the Stack
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // System.out.println(s);
        // pushAtBottom(s, 4);
        // System.out.println(s);

        //Reverse a String using a Stack
        // String str = "abc";
        // System.out.println(str);
        // System.out.println(reverseString(str));

        //Reverse a Stack
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // reverseStack(s);
        // printStack(s);

        //Stock Span Problem
        int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[stocks.length];

        stockSpan(stocks, span);

        for(int num : span) {
            System.out.print(num + " ");
        }
    }
}
