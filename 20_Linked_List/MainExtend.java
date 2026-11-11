public class MainExtend {

    public static void main(String[] args) {
        // Search for a key in a Linked List. Return the position where it is found. If not found, return -1;

        // LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);

        // Search (Iterative(loop))
        // System.out.println(ll.itrSearch(5));
        // System.out.println(ll.itrSearch(10));
        // ll.print(); //1->2->3->4->5->null

        //Search (Recursive)
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(6));
        // ll.print();

        //Reverse a Linked List - Iterative Approach (Classical & Important Question)
        // ll.reverse();
        // ll.print();

        //Find & Remove Nth node from End
        //Iterative Approach
        // ll.removeNthNode(2);
        // ll.print();

        //Check if LL is a Palindrome
        // 1st approach would be to solve it using help of other data structures like array or array list, where we copy elements of linked list to array list and then check if its palindrome, this approach would give us time & space complexity of O(n).
        // but we would solve it using constant space O(1).

        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print(); //1->2->2->1
        System.out.println(ll.checkPalindrome()); //returns true

        /* 
        * This problem is a classic pattern builder that teaches how to break down a complex requirement into standard, reusable sub-problems. It demonstrates how to achieve O(1) space complexity by manipulating memory in-place, rather than taking the easy route of dumping nodes into an array or stack.
        * Core Concepts Applied:
        * - Algorithmic Modularity: Chaining distinct, smaller logic blocks together to solve the larger issue (Find Mid -> Reverse -> Compare).
        * - Two-Pointer Technique (Slow/Fast): Moving pointers at different speeds to find the exact middle of the data structure in a single pass.
        * - In-Place Reversal: Rewiring node pointers (prev, curr, next) safely to reverse the second half of the list without losing references or using extra memory.
        * - Space Optimization: Achieving O(n) time while strictly maintaining O(1) auxiliary space.
        */

    }
}
