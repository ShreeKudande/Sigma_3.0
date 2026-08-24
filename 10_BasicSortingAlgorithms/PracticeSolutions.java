// public class PracticeSolutions {

//     public static void bubbleSort(int arr[]) {
//         for(int i = 0; i < arr.length; i++) {
//             for(int j = 0; j < arr.length-i-1; j++) {
//                 if(arr[j] < arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }

//     public static void selectionSort(int arr[]) {
//         for(int i = 0; i < arr.length-1; i++) {
//             int min = i;
//             for(int j = i+1; j < arr.length; j++) {
//                 if(arr[min] < arr[j]) {
//                     min = j;
//                 }
//             }
//             //swap
//             int temp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void insertionSort(int arr[]) {

//     }

//     public static void printArr(int arr[]) {
//         for(int num : arr) {
//             System.out.print(num + " ");
//         }
//     }

//     public static void main(String args[]) {
//         //Use the following sorting algorithms to sort an array in DESCENDING order:
//         int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

//         //Bubble Sort
//         // bubbleSort(arr);
//         // printArr(arr);

//         //Selection Sort
//         selectionSort(arr);
//         printArr(arr);

//         //Insertion Sort
//         insertionSort(arr);
//         printArr(arr);

//         //Counting Sort
//     }
// }

public class PracticeSolutions {

    public static void bubbleSort(int arr[]) {
        for(int turn = 0; turn < arr.length; turn++) {
            for(int j = 0; j < arr.length-turn-1; j++) {
                if(arr[j] < arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int arr[]) {

        for(int i = 0; i < arr.length; i++) {
            int largest = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[largest]) {
                    largest = j;
                }
            }
            //swap
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] < curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }

    public static void countingSort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int freq[] = new int[max+1];

        for(int i = 0; i < arr.length; i++) {
            freq[arr[i]]+=1;
        }

        int j = 0;
        for(int i = freq.length-1; i >= 0; i--) {
            while(freq[i] > 0) {
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
    }

    public static void main(String args[]) {
        //Use the following sorting algorithms to sort an array in DESCENDING order:
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        //Bubble Sort
        // bubbleSort(arr);

        //Selection Sort
        // selectionSort(arr);

        //Insertion Sort
        // insertionSort(arr);

        //Counting Sort
        countingSort(arr);
        printArr(arr);
    }
}
