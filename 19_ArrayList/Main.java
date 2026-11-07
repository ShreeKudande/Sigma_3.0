/*
Java ArrayList
An ArrayList is like a resizable array.

It is part of the java.util package and implements the List interface.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.
*/

import java.util.ArrayList;
import java.util.Collections;

class Main {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String args[]) {
        // // Create an ArrayList
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> l2 = new ArrayList<>();
        // ArrayList<Boolean> l3 = new ArrayList<>();

        // // Add Element
        // list.add(1); // O(1)
        // list.add(2);
        // list.add(3);
        // list.add(4);

        // list.add(1, 6); // Add a number at specific index O(n)

        // System.out.println(list);

        // // Get Element
        // System.out.println(list.get(0)); // O(1)
        // System.out.println(list.get(3));

        // // Remove Element
        // list.remove(0); // O(n)
        // System.out.println(list);

        // // Set Element at Index
        // list.set(2, 10); // O(n)
        // System.out.println(list);

        // // Contains Element
        // System.out.println(list.contains(1)); // O(n)
        // System.out.println(list.contains(3));

        // // Size of ArrayList
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // System.out.println(list);

        // System.out.println("List Size: " + list.size());

        // // print the arraylist
        // for(int i = 0; i < list.size(); i++)
        // {
        //     System.out.println(list.get(i));
        // }

        // // Print Reverse of an ArrayList - O(n)
        // for(int i = list.size()-1; i >= 0; i--)
        // {
        //     System.out.print(list.get(i) + " ");
        // }

        // // Find Maximum in an ArrayList - O(n)
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < list.size(); i++)
        // {
        //     // if(list.get(i) > max)
        //     // {
        //     //     max = list.get(i);
        //     // }
        //     max = Math.max(max, list.get(i));
        // }
        // System.out.println("\nMaximum Element: " + max);

        // //Swap 2 Numbers
        // ArrayList<Integer> newList = new ArrayList<>();
        // newList.add(2);
        // newList.add(5);
        // newList.add(9);
        // newList.add(3);
        // newList.add(6);
        
        // System.out.println("Before Swap: " + newList);
        // swap(newList, 1, 3);
        // System.out.println("After Swap: " + newList);

        // // Sorting an ArrayList - O(n log n)
        // Collections.sort(newList); // ascending
        // System.out.println(newList);

        // Collections.sort(newList, Collections.reverseOrder()); // descending
        // // the second parameter is a Comparator - fnx logic is defined
        // System.out.println(newList);

        // Implementation of ArrayList in Java
        // At its core, a Java ArrayList is just a standard array (Object[]) dressed up with some dynamic logic to resize itself automatically, an ArrayList is implemented internally using a dynamic Object[] array that automatically manages its own memory. It begins with a default capacity of 10 (allocated upon adding the first element) and tracks the current number of items using an internal size variable. When this array becomes completely full, the list automatically resizes itself by creating a new array that is 50% larger than the original, using the highly optimized System.arraycopy() method to transfer all existing elements into the new space before letting the garbage collector clear the old one. Because it relies on contiguous memory, retrieving elements by index is instantly fast (O(1)), but inserting or removing items anywhere except the very end takes O(n) time since all subsequent elements must be physically shifted left or right to maintain the correct order.

        // // Multi-dimensional ArrayList
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1); list1.add(2); 
        // mainList.add(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(2); list2.add(4); 
        // mainList.add(list2);

        // /*
        // mainList [ list1 | list2 ]
        //             1,2     3,4
        // */
       
        // for(int i=0; i<mainList.size(); i++) {

        //     ArrayList<Integer> currList = mainList.get(i);

        //     for(int j = 0; j<currList.size(); j++) {
        //         System.out.print(currList.get(j) + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println(mainList);

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i <= 5; i++) {
            list1.add(i*1); //1 2 3 4 5
            list2.add(i*2); //2 4 6 8 10
            list3.add(i*3); //3 6 9 12 15
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        for(int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(mainList);

    }
}
