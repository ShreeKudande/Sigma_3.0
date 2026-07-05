// Time Complexity: How the number of operations scales as the input size grows.
// Space Complexity: How the extra memory required scales as the input size grows.

/*
Note :-
An arithmetic progression (AP) or arithmetic sequence is a sequence of numbers where the difference between any two consecutive terms is a constant. This fixed, constant amount is known as the common difference.
Core Components
First term (a): The starting number of the sequence.
Common difference (d): The fixed amount added (or subtracted) to get the next number.
General Form: a, a+d, a+2d, a+3d,...

Example: 2, 5, 8, 11, 14,...
Here, the first term (a) is 2, and the common difference (d) is 3 (since 5 - 2 = 3, 8 - 5 = 3, etc.).
*/


public class Main {

    public static void main(String args[]) {

        //Simple Loop Analysis
        for(int i=0; i < n; i++) {
            //some constant work
            //is done in this loop
        } //TM --> O(n)

        //Nested Loop 1 Analysis
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                //some constant work
                //is done in this loop
            }
        } //TM --> O(n^2)

        //Nested Loop 2 Analysis
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                //some constant work
                //is done in this loop
            }
        } //TM --> O(n^2)

        //Nested Loop 3 Analysis
        //some k < n
        for(int i=0; i<n; i=i+k) {
            for(int j=i+1; j<=k; j++) {
                //some constant work
                //is done in this loop
            }
        } //TM --> O(n)

        //Bubble Sort
        public static void bubbleSort(int arr[]) {
            for(int turn = 0; turn < arr.length-1; turn++) {
                for(int j = 0; j < arr.length-1-turn; j++) {
                    if(arr[j] > arr[j+1]) {
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            for(int num : arr) {
                System.out.print(num + " ");
            }
        } //TM --> O(n^2)

        //Optimized Bubble Sort
        public static void bubbleSort(int arr[]) {
            for(int turn = 0; turn < arr.length-1; turn++) {
                int swaps = 0;
                for(int j = 0; j < arr.length-1-turn; j++) {
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swaps++;
                    }
                }
                if(swaps == 0) {
                        break;
                    }
            }

            for(int num : arr) {
                System.out.print(num + " ");
            }
        } //Worst-Case : TM --> O(n^2) Best-Case : TM --> O(n)

        //Binary Search Analysis
        public static int binarySearch(int arr[], int key) {
            int start = 0, end = arr.length-1;

            while(start <= end) {
                int mid = (start + end) / 2;

                if(arr[mid] == key) {
                    return mid;
                }
                else if(arr[mid] > key) { //Left
                    end = mid - 1;
                }
                else if(arr[mid] < key) { //Right
                    start = mid + 1;
                }
            }
            return -1;
        } //TM --> O(log n)

    }
} 
