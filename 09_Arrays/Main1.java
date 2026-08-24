import java.util.*;

public class Main1 {

    public static void introduction() {
        //Definition of an Array
        // List of Elements of the same type placed in a contiguous memory location

        // JAVA ARRAYS: QUICK REFERENCE

        // 1. CORE CONCEPTS
        // - Definition: A fixed-size, ordered collection of elements.
        // - Strongly Typed: All elements must share the exact same data type.
        // - Memory: Stored in contiguous (continuous) memory locations.
        // - 0-Indexed: First element is at index 0, last is at (length - 1).
        // - Fixed Size: Capacity cannot change after creation.

        // 2. SYNTAX & EXAMPLES
        //instantiation is the process of creating an object from a class, while initialization is the process of assigning initial values to that newly created object's properties.

        // A. Declaration (Defining type and name)
        int[] numbers;

        // B. Instantiation (Allocating memory for 5 integers, defaults to 0)
        numbers = new int[5];

        // C. Initialization (Assigning values to indexes)
        numbers[0] = 10;
        numbers[1] = 20;

        // D. All-in-One (Declare, Instantiate, and Initialize)
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // E. Accessing & Modifying
        // String firstFruit = fruits[0]; // Gets "Apple"
        // fruits[1] = "Mango";           // Changes "Banana" to "Mango"

        // F. Getting Array Length (Property, not a method)
        // int size = fruits.length;      // Returns 3
    
    }
    
    public static void operationsInArrays() {
        //Creating an Array
        //dataType arrayName[] = new dataType[size];
        /* int marks[] = new int[50];

        int numbers[] = {1, 2, 3};

        int moreNumbers[] = {4, 5, 6};

        String fruits[] = {"apple", "mango", "orange"}; */

        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();

        System.out.print("Enter marks for physics : ");
        marks[0] = sc.nextInt(); // phy
        System.out.print("Enter marks for chemistry : ");
        marks[1] = sc.nextInt(); // che
        System.out.print("Enter marks for math : ");
        marks[2] = sc.nextInt(); // math
    
        System.out.println("phy : " + marks[0]);
        System.out.println("che : " + marks[1]);
        System.out.println("math : " + marks[2]);

        // marks[2] = 100;
        // marks[2] = marks[2] + 1;
        // System.out.println("math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%");
        System.out.println("Length of array = " + marks.length);


    }

    public static void update(int marks[], int nonChangable) {
        nonChangable = 10;
        for(int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void arraysAsFunctionArguments() {

        int marks[] = {97, 98, 99};
        int nonChangable = 5;
        update(marks, nonChangable);

        //print our marks
        System.out.println(nonChangable); // here value remained same even after changing it in update function too 10 ; Output - 5
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        } //this value changed because arrays values are passed by reference to the update function

    }

    public static int linearSearch(int numbers[], int key) {
       for(int i = 0; i < numbers.length; i++) {
        if(numbers[i] == key) {
            return i;
        }
       }
       return -1;
    }

    public static int linearSearchForStrings(String numbers[], String key) {
       for(int i = 0; i < numbers.length; i++) {
        if(numbers[i] == key) {
            return i;
        }
       }
       return -1;
    }

    public static int largestInArray(int numbers[]) {
        int largest = Integer.MIN_VALUE; //-ve infinity

        for(int i = 0; i < numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int smallestInArray(int numbers[]) {
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            if(smallest > numbers[i]) {
            smallest = numbers[i];
            }
        }
        return smallest;
        
    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end)/2;

            //comparisions
            if(numbers[mid] == key) { //found
                return mid;
            }
            if(numbers[mid] < key) { //right
                start = mid + 1;
            } else { //left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int numbers[]) {
        int start = 0;
        int end = numbers.length-1;

        while(start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

    }

    public static void pairsInArray(int numbers[]) {
        int total_pairs = 0;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                System.out.print(numbers[i] + "," + numbers[j] + " ");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.print("Total Pairs = " + total_pairs);
    }

    public static void subArrays(int numbers[]) {
        int[] sumArray = new int[numbers.length * (numbers.length + 1) / 2]; // formula = n(n+1)/2
        int ts = 0;
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) { // int start = i;

            for(int j = i; j < numbers.length; j++) { // int end = j;

                for(int k = i; k <= j; k++) { //print
                sum+=numbers[k];
                System.out.print(numbers[k] + " "); //subarray
                }
                System.out.print(" = " + sum);
                System.out.println();
                sumArray[ts] = sum;
                ts++;
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("Total sub arrays = " + ts);

        System.out.print("sumArray = ");
        for(int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i] + " ");
        }

        System.out.println();
        System.out.println("max = " + largestInArray(sumArray));
        System.out.println("min = " + smallestInArray(sumArray));
    }

    public static void main(String args[]) {
        // introduction();
        // operationsInArrays();
        // arraysAsFunctionArguments();
        
        /* int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        
        int index = linearSearch(numbers, key);
        if(index == -1) {
            System.out.print("NOT found");
        } else {
            System.out.print("Key is at index : " + index);
        } */

       // Time Complexity: O(n) - In the worst case, it has to check every single element in the array one by one.

        /* String menu[] = { "dosa", "chole bhature", "samosa", "vada pav", "momos" };

        String fav = "vada pav";

        int index = linearSearchForStrings(menu, fav);

        if(index == -1) {
            System.out.print("Item not found");
        } else {
            System.out.print("fav item is at index : " + index);
        } */
       
       /* int numbers[] = {0, 2, 6, 3, 5};
       System.out.println("largest value is : " + largestInArray(numbers));
       System.out.println("smallest value is : " + smallestInArray(numbers)); */

        /* int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("index for key is " + binarySearch(numbers, key)); */

        /* int numbers[] = {2, 4, 6, 8, 10};
        reverse(numbers);
        for(int i = 0; i < numbers.length; i++) {
            System.out.print( numbers[i] + " ");
        } */
       
       /* int numbers[] = {2, 4, 6, 8, 10};
       pairsInArray(numbers); */

        int numbers[] = {2, 4, 6, 8, 10};
        subArrays(numbers);
    }
}
