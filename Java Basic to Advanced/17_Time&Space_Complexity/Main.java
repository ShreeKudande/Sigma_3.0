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
            for(int j=i+1; j<i+k; j++) {
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

        //Recursive Complexity Analysis (Factorial)
        //Total work done = (no of calls * work in each call)
        //Space complexity = (max depth * memory in each call)
        public static int fact(int n) {
            if(n == 0) {
                return 1;
            }

            return n * fact(n-1);
        } // T & S Complexity : O(n)

        //Sum of N numbers analysis
        public static int sum(int n) {
            if(n == 0) {
                return 0;
            }

            return n + sum(n-1);
        } // T & S Complexity : O(n)

        //Fibonacci Analysis
        public static int fib(int n) {
            if(n == 0 || n == 1) {
                return n;
            }

            return fib(n-1) + fib(n-2);
        }

    }

    //Merge Sort Analysis
    public static void mergeSort(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }
        
        int mid = si + (ei - si) / 2; //(si+ei)/2
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    } //TC : n x log n
    //SC : O(n)

    public static void merge(int arr[],int si,int mid,int ei) {
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp arr

        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else{
                temp[k] = arr[j];
              kk  j++;
            }
            k++;
        }

        //left part
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        //right part
        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for(k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    } //TC : O(n)

    //Power Function I - Analysis
    public static int power(int a, int n) {
        if(n == 0) {
            return 1;
        }

        return a * power(a, n-1);
    } //Time & Space Complexity : O(n)

    //Power Function II - Analysis
    public static int power2(int a, int n) {
        if(n == 0) {
            return 1;
        }

        int halfPowerSq = power2(a, n/2) * power2(a, n/2);

        if(n%2 != 0) { //a is odd
            return a * halfPowerSq;
        }

        return halfPowerSq;
    } //TC : O(n)

    //Power Function III - Analysis
    public static int power3(int a, int n) {
        if(n == 0) {
            return 1;
        }

        int halfPower = power3(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n%2 != 0) { //a is odd
            return a * halfPowerSq;
        }

        return halfPowerSq;
    } //Time & Space Complexity : O(log n)
} 

//How to approach coding questions :-
//Solve the question first with Brute Force Approach.
//then Optimize it in Time & Space.
//you can get the idea of time & Space complexity to solve it by looking into input and constrains of the problem.
//In Leetcode or contests if we pass 10^8 operations, Time Limit Exceeded Error comes.
//log(10^6) --> 6 * log2 10 --> 6 * 3.32 -->19.92(rounds to 20) 

// The power rule*
//The power rule states that you can take an exponent from inside a logarithm and move it to the front as a multiplier:
//log_b(x^y) = y * log_b(x)
