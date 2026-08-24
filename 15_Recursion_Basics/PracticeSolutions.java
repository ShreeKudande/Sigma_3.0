public class PracticeSolutions {

    public static void allOccurrences(int arr[], int i, int key) {
        if(i == arr.length) {
            return;
        }

        if(arr[i] == key) {
            System.out.print(i + " ");
        } 
        allOccurrences(arr, i+1, key);
    }

    public static void printDigits(int n, String[] digits) {
        if(n == 0) {
            return;
        }

        int lastDigit = n%10;
        printDigits(n/10, digits);

        System.out.print(digits[lastDigit] + " ");
    }

    public static int length(String str) {
        if(str.length() == 0) {
            return 0;
        }

        return length(str.substring(1)) + 1;
    }

    public static void main(String args[]) {
        //Q1
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // int key = 2;
        
        // allOccurrences(arr, 0, key);

        //Q2
        // String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // printDigits(2019, digits);

        //Q3
        // String str = "abcde";
        // System.out.print(length(str));

        //Q4
        //Q5
        

    }
}