/*
What is Recursion?
Recursion is a method of solving a computational problem where the solution depends on solutions to smaller instances of the same problem.
1.Define Base Case : 0
2.Work/Kaam : n * f(n-1)
3.Inner fun/call : f(n-1)
*/

public class Main {

    public static void printDec(int n) {
        if(n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int calSum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + calSum(n-1);
    }

    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

    public static boolean isSorted(int arr[], int i) {
        if( i == arr.length-1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    } 

    public static int firstOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }

        if(arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i+1);

    }

    // public static int lastOccurence(int arr[], int key, int i) {
    //     if(i < 0) {
    //         return -1;
    //     }

    //     if(arr[i] == key) {
    //         return i;
    //     }

    //     return lastOccurence(arr, key, i-1);

    // }

    public static int lastOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }

        int isFound = lastOccurence(arr, key, i+1);

        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;

    }

    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }

        return x * power(x, n-1);
    }

    public static int optimizedPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower*halfPower;

        if(n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

        public static int tilingProblem(int n) { // 2 x n (floor size)
        if(n == 0 || n == 1) {
            return 1;
        }

        int fnm1 = tilingProblem(n-1); //vertical choice
        int fnm2 = tilingProblem(n-2); //horizontal choice

        int totways = fnm1 + fnm2;
        return totways;
    }

    public static void main(String args[]) {
        //P1 : Print numbers from n to 1 (Decreasing Order)
        // for(int i = 10; i > 0; i--) {
        //     System.out.print(i + " ");
        // }

        // int n = 10;
        // printDec(n);

        //P2 : Print numbers from 1 to n (Decreasing Order)
        // int n = 10;
        // printInc(n);

        //P3 : Print factorial of a number n.
        // int n = 6;
        // System.out.print(fact(n));

        //P4 : Print sum of first n natural numbers.
        // int n = 5;
        // System.out.print(calSum(n));

        //P5 : Print Nth fibonacci number.
        // int n = 10;
        // System.out.print(fib(n));

        //P6 : Check if a given array is sorted or not.
        // int arr[] = {1, 2, 3, 4};
        // System.out.println(isSorted(arr, 0));

        //P7 : WAF to find the first occurence of an element in an array.
        // int arr[] = {8, 3, 6, 9, 10, 6, 2, 5, 3};
        // int key = 5;
        // System.out.println(firstOccurence(arr, key, 0));

        //P8 : WAF to find the last occurence of an element in an array.
        // int arr[] = {5, 8, 3, 6, 9, 10, 5, 6, 2, 3};
        // int key = 5;
        // // System.out.println(lastOccurence(arr, key, arr.length-1));
        // System.out.println(lastOccurence(arr, key, 0));

        //P9 : Print X^n
        // System.out.println(power(2, 10));

        //P9 : Optimized Power
        //Print x^n in O(logn)
        // System.out.println(optimizedPower(2, 10));

        //P10 : Tiling Problem
        System.out.println(tilingProblem(5));
        
    }   
}


