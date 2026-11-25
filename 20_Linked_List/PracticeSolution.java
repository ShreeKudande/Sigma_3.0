class PracticeSolution {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int size = 1;

    public static Node createList(int[] arr) {
        if(arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node curr = head;

        for(int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);   
            curr = curr.next;
            size++;
        }
        return head;
    }

    public static void printList(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println(" null ");
    }

    public static void skipMdeleteN(Node head, int M, int N) {
        Node curr = head;

            while(curr != null) {
                for(int skip = 1; skip < M && curr != null; skip++) {
                    curr = curr.next;
                }

                if(curr == null) {
                    break;
                }

                Node next = curr.next;

                for(int del = 1; del <= N && next != null; del++) {
                    next = next.next;
                }
                curr.next = next;
                curr = next;
        }
    }

    public static Node swapNodes(Node head, int x, int y) {
        //if x & y are same
        if(x == y) {
            return head;
        }

        Node curr = head;
        Node prevX  = null, currX = null;
        Node prevY = null, currY = null;

        //first loop to find x
        while(curr != null) {
            if(curr.data == x) {
                currX = curr;
                break;
            }
            prevX = curr;
            curr = curr.next;
        }

        curr = head;

        //second loop to find y
        while(curr != null) {
            if(curr.data == y) {
                currY = curr;
                break;
            }
            prevY = curr;
            curr = curr.next;
        }

        // if x and y are not present, nothing to do
        if( currX == null || currY == null) {
            return head;
        }

        //if x is not head of the linked list
        if(prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        //if y is not head of the linked list
        if(prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        //swap next pointers
        Node temp = currY.next;
        currY.next = currX.next;
        currX.next = temp;


        return head;
    }

    public static Node oddEvenLL(Node head) {
        Node prev = null;
        Node curr = head;
        Node oddNode = new Node(0);
        Node temp = oddNode;
        
        while(curr != null) {
            if(curr.data % 2 == 0) { //even
                prev = curr;
                curr = curr.next;
            } else { //odd
                temp.next = new Node(curr.data);
                temp = temp.next;

                if(prev != null) {
                    prev.next = curr.next;
                } else { //prev == null
                    head = curr.next;
                }
                curr = curr.next;
            }
        }
        if(prev != null) {
            prev.next = oddNode.next;
        } else {
            head = oddNode.next;
        }
        return head;
    }

    public static Node optimalOddEvenLL(Node head) {
        Node evenHead = new Node(0), evenTail = evenHead;
        Node oddHead = new Node(0), oddTail = oddHead;
        Node curr = head;

        while(curr != null) {
            if(curr.data % 2 == 0) { //even
                evenTail.next = curr;
                evenTail = evenTail.next;
            } else { //odd
                oddTail.next = curr;
                oddTail = oddTail.next;
            }
            curr = curr.next;
        }
        oddTail.next = null;
        evenTail.next = oddHead.next;
        return evenHead.next;
    }

    public static void main(String[] args) {
        //Q1
        //Solved in LeetCode : https://leetcode.com/problems/intersection-of-two-linked-lists

        //Q2
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Node head = createList(arr);
        // printList(head);

        // int M = 3, N = 2;
        // skipMdeleteN(head, M, N);
        // printList(head);

        //Q3
        // int[] arr = {1, 2, 3, 4};
        // Node head = createList(arr);
        // int x = 2;
        // int y = 4;

        // printList(head);
        // head = swapNodes(head, x, y);
        // printList(head);

        //Q4
        // int[] arr = {1, 3, 5, 7, 2};
        // Node head = createList(arr);
        // printList(head);
        // head = optimalOddEvenLL(head);
        // printList(head);

        //Q5
        // Solved in LeetCode :- https://leetcode.com/problems/merge-k-sorted-lists
    }
}
