import java.util.*;
import java.util.Arrays;
import java.util.Collections;

/* 
Basic Algorithms
- Bubble Sort
- Selection Sort
- Insertion Sort
- Counting Sort (Advanced)
 */

public class Main{

    public static void bubbleSort(int arr[]) {
        int temp = 0;
        System.out.println();
        System.out.println("after sorting");

        for(int i = 0; i < arr.length; i++) {

            int swaps = 0;

            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swaps = 1;
                }
            }
            if(swaps == 0) {
                break;
            }

            System.out.println();
            for(int num : arr) {
            System.out.print(num + " ");
            }
        }

        // for(int num : arr) {
        //     System.out.print(num + " ");
        // }
    }

    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length-1; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        
        // Start from the second element (index 1) because a single element is already sorted
        for (int i = 1; i < n; i++) {
            int currentCard = arr[i]; // The element we want to position
            int j = i - 1;            // The last index of the "sorted" portion

            // Compare currentCard with elements in the sorted portion (from right to left).
            // If the sorted element is bigger, shift it one position to the right to make space.
            while (j >= 0 && arr[j] > currentCard) {
                arr[j + 1] = arr[j]; // Shift element right
                j--;                 // Move to the next element on the left
            }
            
            // We found the right spot! Insert the currentCard here.
            arr[j + 1] = currentCard;
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void printArr(int arr[]) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    public static void printArrInteger(Integer arr[]) {
        for(Integer num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int compare(int a, int b) {
        // a < b -ve
        // a == b 0
        //a > b +ve
        return a - b;
        // return b - a; --> gives descending order [Comparators]
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String args[]) {

        //Bubble Sort
        // int arr[] = {5, 4, 1, 3, 2};

        // System.out.println("before sorting");
        // for(int num : arr) {
        //     System.out.print(num + " ");
        // }

        // bubbleSort(arr);

        //Selection Sort
        // int arr[] = {5, 4, 1, 3, 2};
        // selectionSort(arr);

        //Insertion Sort
        // int arr[] = {5, 4, 1, 3, 2};
        // insertionSort(arr);

        //Inbuilt Sort
        // int arr[] = {5, 4, 1, 3, 2};
        // Integer arr1[] = {5, 4, 1, 3, 2};

        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);
        // printArr(arr);

        // Arrays.sort(arr1, Collections.reverseOrder());
        //Arrays.sort(arr1, 0, 3, Collections.reverseOrder());
        // printArrInteger(arr1);

        //Counting Sort
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
        printArr(arr);


    }

}
