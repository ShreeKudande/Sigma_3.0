import java.util.*;

public class PracticeSolutions{

    public static void Q1() {
        for(int i=0; i<5; i++) {
        System.out.println("Hello");
        i+=2;
        }
        //Ans. Hello is printed 2 times.
    }

    public static void Q2() {
        Scanner sc = new Scanner(System.in);
        
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("Enter the number : ");
            number = sc.nextInt();

            if(number % 2 == 0) {
                evenSum += number;
            } else{
                oddSum += number;
            }

            System.out.println("Do you want to choice? Press 1 for yes or 0 for no : ");
            choice = sc.nextInt();
        } while(choice == 1);

        System.out.println("sum of even numbers " + evenSum);
        System.out.println("sum of odd numbers " + oddSum);
    }

    public static void Q3() {
        System.out.print("Enter a number to find its factorial : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("The factorial of this number is " + fact);
    }

    public static void Q4() {
        System.out.println("Enter a number for its table :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 12; i++) {
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }
    
    public static void Q5() {
        for(int i = 0; i <= 5; i++) {
        System.out.println("i = " + i );
        }
        System.out.println("i after the loop = " + i );
        /* 
        In this program variable i is declared in the for loop. So scope of variable i is limited to the for loop only that is between { and } of the for loop. There is a display statement after the for loop
        where variable i is used which means i is used out of scope. This leads to compilation errors. The program given will not run and give an error instead. To correct the program, the variable i
        needs to be declared outside the for loop.
        */

        /*
        int i; 
        
        for(i = 0; i <= 5; i++) {
            System.out.println("i = " + i );
        }
        
        // 'i' is now accessible here
        System.out.println("i after the loop = " + i );
        */

    }
   
    public static void main(String args[]) {
        // Q1();
        // Q2();
        // Q3();
        // Q4();
        Q5();
    }
}

