import java.util.LinkedList; // JCF

class MainExtend {

    public static void main(String args[]) {
        //Linked List in Java Collections Framework
        //create - objects int, float, boolean -> Integer, Float, Character
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}