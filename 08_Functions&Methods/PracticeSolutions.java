import java.util.*;

public class PracticeSolutions {

    public static double Q1(double a, double b, double c) {
        double avg = a + b + c / 3;
        return avg;
    }

    public static boolean Q2(int n) {
        if(n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Q3(int n) {
        int check_n = n;
        int rev = 0;

        while(n > 0) {
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n/=10;
        }
        if(check_n == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void Q4() {
        int num1 = 25;
        int num2 = -10;
        double base = 5.0;
        double exponent = 3.0;

        // a. Math.min() - Returns the smaller of two values
        System.out.println("Math.min(" + num1 + ", " + num2 + ") = " + Math.min(num1, num2));

        // b. Math.max() - Returns the larger of two values
        System.out.println("Math.max(" + num1 + ", " + num2 + ") = " + Math.max(num1, num2));

        // c. Math.sqrt() - Returns the square root of a value
        System.out.println("Math.sqrt(" + num1 + ") = " + Math.sqrt(num1));

        // d. Math.pow() - Returns the value of the first argument raised to the power of the second
        System.out.println("Math.pow(" + base + ", " + exponent + ") = " + Math.pow(base, exponent));

        // e. Math.avg() - NOTE: There is no Math.avg() method in the standard Java Math class. 
        // You must calculate the average manually.
        double avg = (num1 + num2) / 2.0;
        System.out.println("Average of " + num1 + " and " + num2 + " = " + avg);

        // f. Math.abs() - Returns the absolute (positive) value
        System.out.println("Math.abs(" + num2 + ") = " + Math.abs(num2));
    }

    public static int Q5(int n) {
        int sum = 0;
        while(n != 0) {
            int digit = n % 10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }

    public static void main(String args[]) {
        // System.out.println(Q1(13,17,19));
        
        /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print(Q2(n)); */

        /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number too check if its palindrome or not : ");
        int n = sc.nextInt();
        System.out.print(Q3(n)); */

        // Q4();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for sum of its digits : ");
        int n = sc.nextInt();
        System.out.print("The sum is " + Q5(n));

    }
}