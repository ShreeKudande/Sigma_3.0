import java.util.*;

public class Main {

    public static void loopsBasics() {
        /* System.out.println("Hello Shree!");
        System.out.println("Hello Shree!");
        System.out.println("Hello Shree!"); 
        */

        // Problem: If we want to print this 1000 times, the manual approach above is not logical.
        // Solution: Loops allow us to execute code repeatedly. This reduces redundancy and makes the code cleaner and more efficient.

        // There are 3 types of Loops in Java:
        // 1. while Loop
        // 2. for Loop
        // 3. do-while Loop
    }

    public static void whileLoop() {
        /* while(condition) {
            //do something
        }  
        It would run while the condition is true */
        
        //Prints Hello Shree 100 times
        int counter = 0;
        while(counter < 100) {
            System.out.println("Hello Shree!");
            counter++;
        }

        // Infinite Loop -- Use Ctrl + C too Stop
        while(true) {
            System.out.println("Infinite Loop");
        }

    }

    public static void printNumbersFrom1to10() {
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i+=1;
        }
    }

    public static void printNumbersFrom1toN() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }

    public static void sumOfFirst_N_NaturalNumbers() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0, i = 0;

        while(i <= n) {
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }

    public static void forLoop() {
        /* 
        for(initialisation; condition; updation) {
        //do something
        }
         */

        // int i = 1;
        for(int i = 1; i <= 10; i++) {
            System.out.println("Hello World!");
        }
    }

    public static void printSquarePattern() {
        // for(int i = 1; i <= 4; i++) {
        //     System.out.println("* * * *");
        // }

        int line = 1;
        while(line <= 4) {
            System.out.println("* * * *");
            line++;
        }
    }

    public static void printReverseOfaNumber() {
        /*
        * LOGIC :-
        * 1. Extract: Use % 10 to get the last digit (Remainder).
        * 2. Print: Display that digit.
        * 3. Reduce: Use / 10 to remove that digit (Integer Division).
        * 4. Repeat: Keep doing this until the number becomes 0.
        */

        int number = 5102005; // Target: Print "5002015"

        // Loop runs as long as 'number' is greater than 0.
        // Note: 'i' increments but isn't used in the logic; it just counts iterations.
        for(int i = 1; number > 0; i++) {
            
            // STEP 1: THE GETTER (%)
            // Modulo 10 divides by 10 and gives ONLY the remainder.
            // Logic: 5102005 / 10 = 510200 with remainder 5.
            // Result: lastDigit becomes 5.
            int lastDigit = number % 10; 

            // STEP 2: THE REMOVER (/)
            // Integer division by 10 throws away the decimal part.
            // Logic: 5102005 / 10 = 510200.5 -> becomes 510200.
            // Result: The last digit (5) is permanently removed from 'number'.
            number = number / 10; 

            // Print the extracted digit immediately
            System.out.print(lastDigit);
        }

        /* Key Takeaways:-
        % 10 (Modulo): Think of this as a "Peeling Tool". It peels off just the very last digit so you can look at it or use it.

        / 10 (Division): Think of this as a "Chopping Tool". It chops off the last digit to shorten the number so the loop can process the next digit in the next round. */
    }

    public static void reverseTheGivenNumber() {
        int n = 10899; //99801
        int rev = 0;

        while(n > 0) {
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }

    public static void doWhileLoop() {
        /* 
        do{
        //do something
        } while(condition);
         */

        int counter = 1;
        do {
            System.out.println("Hello World!");
            counter++;
        } while(counter <= 100);
    }

    public static void breakStatement() {
        // too break the iteration or code.
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("i am out of the loop");
    }

    public static void question_break() {
        // Keep entering numbers till user enters a multiple of 10
        Scanner sc = new Scanner(System.in);

        do {
            int n = sc.nextInt();
            if(n % 10 == 0) {
                break;
            }
        } while(true);
    }

    public static void continueStatement() {
        //to skip an iteration
        for(int i = 1; i <= 10; i++) {
            if(i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void question_continue() {
        // Display all numbers entered by user except multiples of 10 
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter Number : ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                continue;
            }
            System.out.println("You entered " + n);
        }
    }

    public static void primeOrNot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its Prime or not : ");
        int n = sc.nextInt();

        if(n == 2) {
            System.out.println("n is prime");
        } else {

            boolean isPrime = true;
            for(int i = 2; i <= n/2; i++) {
                if(n % i == 0) { // n is a multiple of i (i not equal to 1 or n)
                    isPrime = false;
                }
            }

            if(isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
            }
    }

    public static void main(String args[]) {
        // loopsBasics();
        // whileLoop();
        // printNumbersFrom1to10();
        // printNumbersFrom1toN();
        // sumOfFirst_N_NaturalNumbers();
        // forLoop();
        // printSquarePattern();
        // printReverseOfaNumber(); //imp
        // reverseTheGivenNumber();
        // doWhileLoop();
        // breakStatement();
        // question_break();
        // continueStatement();
        // question_continue();
        primeOrNot();
        
    }
}
