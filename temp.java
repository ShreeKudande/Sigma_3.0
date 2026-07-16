import java.util.Arrays;

public class temp {

    public static void bubbleSort(int arr[]) {

        for(int turn = 0; turn < arr.length-1; turn++) {
            int swaps = 0;
            for(int j = 0; j < arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swaps+=1;
                }
            }
            if(swaps == 0) {
                    break;
                }
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct pos to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int freq[] = new int[largest+1];

        for(int i = 0; i < arr.length; i++) {
            freq[arr[i]]+=1;
        }

        int j = 0;
        for(int i = 0; i < freq.length; i++) {
            while(freq[i] > 0) {
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
    }
}
