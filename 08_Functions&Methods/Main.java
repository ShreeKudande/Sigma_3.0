import java.util.*;

public class Main{

    public static void introductionToFunctions() {
        // In Java, functions are exclusively referred to as methods because they must always be defined within a class. A method is a reusable block of code that performs a specific task. Instead of writing the same logic multiple times, you write it once inside a method and "call" or execute it whenever you need that specific task done.

        /* 
        Syntax -->
        returnType name() {
            //body
            return statement;
        }
        */

        // static void myMethod() {
        //     code to be executed
        // }
    }
    
    public static void calculateSum(int a, int b) { //parameters or formal parameters
        /* syntaxWithParameters -->
        returnType name(type param1, type param2) {
            //body
            return statement;
        }
        */
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter b : ");
        // int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is : " + sum);
        // return sum; --> if using this doo change the function type too Int
    }

    public static void whatHappensInMemory() {  
        /*
        * What happens in memory?
        * The Call Stack is a LIFO (Last-In, First-Out) memory structure that a program uses 
        * to manage function calls and local variables. Whenever a function is invoked, a new 
        * block of memory called a "Stack Frame" is added (pushed) to the top of the stack. 
        * When the function finishes executing, its frame is deleted (popped) from the stack.
        
        * SUMMARY OF EXECUTION FLOW:
        * * 1. Program Starts: The main() function runs first. A Stack Frame is created for main() 
        * and pushed to the bottom of the Call Stack.
        * * 2. Function is Called: When main() calls sum(), main() is paused. A new Stack Frame 
        * for sum() is pushed exactly on top of the main() frame.
        * * 3. Memory is Isolated: The sum() frame holds its own specific parameters and local 
        * variables (like a, b, and the result). main() cannot see or touch this memory.
        * * 4. Function Finishes: Once sum() completes its task, its entire Stack Frame is 
        * destroyed (popped off the stack). Its local variables are permanently deleted.
        * * 5. Program Resumes: Control goes back down to main(). When main() finishes, its 
        * frame is popped, the stack is empty, and the program ends.
        */
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        // System.out.println("a = " + a); // This would print 6
        // System.out.println("b = " + b); // This would print 5

        /* 
        Call by Value vs. Call by Reference
        Call by Value: A copy of the variable's value is passed to the method. Any modifications made to the parameter inside the method only affect the local copy, leaving the original variable unchanged.

        Call by Reference: The memory address (reference) of the variable is passed to the method. Any modifications made to the parameter directly affect the original variable in memory.

        Important Note for Java: Java is strictly Call by Value. It does not support Call by Reference. When passing primitive data types (like int, char), it passes a copy of the literal value. When passing objects, it passes a copy of the reference pointing to that object.
         */
    }

    public static int productOfa_b(int a, int b) {
        int ans = a*b;
        return ans;
    }

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        int ans = factorial(n-1) * n;
        return ans;
    }

    public static int binomialCoefficient(int n, int r) {
        int ans = factorial(n) / (factorial(r) * factorial(n-r));
        return ans;
    }

    public static void inbuild_vs_UserDefinedMethods() {
        /*
        In-built methods are pre-written functions provided by Java's standard library, such as System.out.println() or Math.max(). They are ready to use for common tasks, saving you from writing basic logic from scratch.

        User-defined methods are custom functions you create to perform specific tasks unique to your program. You define their logic, name, and parameters to break down complex problems and make your code reusable and organized.
        */
    }

    static class Calculator {
        /* 
        Method Overloading in Java -
        Method overloading (often called function overloading) occurs when two or more methods within the same class share the exact same name but have different parameter lists. It is a way to implement compile-time (static) polymorphism in Java.

        The compiler differentiates these methods based on the method signature, which includes:

        The number of parameters.

        The data types of the parameters.

        The sequence of the parameters.

        Note: Changing only the return type is not sufficient to overload a method and will cause a compilation error.
        
         */
        
        // Method 1: Adds two integers
        public int add(int a, int b) {
            return a + b;
        }

        // Method 2: Overloaded - changes the NUMBER of parameters
        public int add(int a, int b, int c) {
            return a + b + c; 
        }

        // Method 3: Overloaded - changes the DATA TYPE of parameters
        public double add(double a, double b) {
            return a + b;
        }
    }

    public static boolean check_if_a_number_is_PrimeOrNot(int n) {
        /*  boolean isPrime = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime; */

        //corner cases
        if(n == 1) {
            System.out.println("1 is neither prime nor composite.");
            return false;
        }
        
         for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;

    } 

    public static boolean check_prime_Optimized(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
        for(int i = 2; i <= n; i++) {
            if(check_prime_Optimized(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void binaryToDecimal(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum /= 10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }

    public static void decimalToBinary(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum = decNum/2;
        }
        System.out.println("binary form of " + myNum + " = " + binNum);
    }
 
    public static void main(String args[]) {
        // introductionToFunctions(); //function call
        // calculateSum(4, 6); // arguments or actual parameters
        // whatHappensInMemory();

        /* 
        int a = 5, b = 6;
        swap(a, b); // Call by value: Passes the values '5' and '6', NOT the variables themselves.       
        // Since swap() only modified its local copies, the original 'a' and 'b' remain unchanged.
        System.out.println("a = " + a); // This would print 5
        System.out.println("b = " + b); // This would print 6
        */

        // System.out.println(productOfa_b(4, 5));  
        // System.out.println(factorial(6));
        // System.out.println(binomialCoefficient(4, 2));
        // inbuild_vs_UserDefinedMethods();
        
        /* // 1. Create an instance of the Calculator class
        Calculator calc = new Calculator();
        // 2. Call the overloaded methods and print the results
        System.out.println("Sum of two integers: " + calc.add(10, 20));       // Calls Method 1
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30)); // Calls Method 2
        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.5));    // Calls Method 3
        } */

        // System.out.println(check_if_a_number_is_PrimeOrNot(1));
        // System.out.println(check_prime_Optimized(9)); 
        // primesInRange(20);  
        // binaryToDecimal(1010);    
        // decimalToBinary(10); 

    }
}
