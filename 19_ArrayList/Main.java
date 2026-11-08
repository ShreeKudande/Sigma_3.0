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

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int n = height.size();

        //brute force approach - O(n^2)
        // for(int i = 0; i < n; i++) {
        //     for(int j = i+1; j < n; j++) {
        //         int minHeight = Math.min(height.get(i), height.get(j));
        //         int width = j-i;
        //         maxWater = Math.max(maxWater, minHeight*width);
        //     }
        // }

        //2 pointer approach - O(n)
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp) {
            int minHeight = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            maxWater = Math.max(maxWater, minHeight*width);

            if(height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }

    public static Boolean pairSum1(ArrayList<Integer> list, int target) {
        int n = list.size();

        // BruteForce Approach - O(n^2)
        // for(int i = 0; i < n; i++) {
        //     for(int j = i; j < n; j++) {
        //         if(list.get(i) + list.get(j) == target) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // 2 Pointer Approach O(n)
        int lp = 0;
        int rp = n-1;

        while (lp <= rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            else {
                rp--;
            }
        }

        return false;
    }

    public static Boolean pairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();

        //Brute Force Approach would be same for this as pairSum1, because the nested logic does not care about if its sorted or not, it will always return correct answer - O(n^2)

        
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

        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();

        // for(int i = 1; i <= 5; i++) {
        //     list1.add(i*1); //1 2 3 4 5
        //     list2.add(i*2); //2 4 6 8 10
        //     list3.add(i*3); //3 6 9 12 15
        // }

        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);

        // for(int i = 0; i < mainList.size(); i++) {
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j = 0; j < currList.size(); j++) {
        //         System.out.print(currList.get(j) + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println(mainList);

        // Container with Most Water
        // For given n lines on x-axis, use 2 lines to form a container such that it holds maximum water.
        // height = [1, 8, 6, 2, 5, 4, 8, 3, 7];

        // int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        // int maxWater = 0;
        // for(int i = 0; i < height.length; i++) {
        //     for(int j = i + 1; j < height.length; j++) {
        //         int width = j-i;
        //         if(height[j] <= height[i]) {
        //             maxWater = Math.max(maxWater, height[j]*width);
        //         }
        //         else {
        //             maxWater = Math.max(maxWater, height[i]*width);
        //         }
        //     }
        // }

        // System.out.println("Max Water: " + maxWater);

        // ArrayList<Integer> height = new ArrayList<>();
        // //1, 8, 6, 2, 5, 4, 8, 3, 7
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);

        // System.out.println(storeWater(height));

        // How is this different than Trapping Rainwater?
        /*
        Algorithm Comparison: Container with Most Water vs Trapping Rain Water

        1. Container with Most Water (LeetCode 11)

        - The Goal: Find just two boundary lines that form a single, wide container 
        holding the maximum possible water.
        - The Logic: The lines inside your two chosen boundaries are completely ignored. 
        The water level is determined only by the distance between the two endpoints 
        and the height of the shorter boundary line.
        - The Math: Area = (rightIndex - leftIndex) * Math.min(height[leftIndex], height[rightIndex])
        - Algorithm: Solved in O(n) time using a standard two-pointer approach. Start 
        at opposite ends of the array and shift the pointer of the shorter line inward.


        2. Trapping Rain Water (LeetCode 42)

        - The Goal: Calculate the total sum of water trapped across the entire terrain 
        of elevation blocks.
        - The Logic: Every single block in the array matters. The water trapped directly 
        on top of any specific block is dictated by the tallest block anywhere to 
        its left and the tallest block anywhere to its right.
        - The Math: Water at index i = Math.min(leftMax, rightMax) - height[i]
        - Algorithm: Requires knowing the maximum heights on both sides of every element. 
        Typically solved using auxiliary arrays (Prefix Max and Suffix Max) to store 
        those boundaries, or optimized to O(1) space using a complex two-pointer setup.
        */

        // Pair Sum - 1
        // Find if any pair in a Sorted ArrayList has a target sum.
        // list = [1, 2, 3, 4, 5, 6], target = 5

        // ArrayList<Integer> list = new ArrayList<>();
        // // 1, 2, 3, 4, 5, 6
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // int target = 5;

        // System.out.println(pairSum1(list, target));

        // Pair Sum - 2
        // Find if any pair in a Sorted & Rotated ArrayList has a target sum.
        // list = [11, 15, 6, 8, 9, 10], target = 16
        ArrayList<Integer> list = new ArrayList<>();
        // 11, 15, 6, 8, 9, 10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;

        pairSum2(list, target);
    }
}
