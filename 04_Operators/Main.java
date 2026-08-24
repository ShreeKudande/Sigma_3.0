public class Main {
    
    public static void typesOfOperator() {
        //Symbols that tell compiler to perform some operation
        int a = 5;
        int b = 10;
        int sum = a + b ; // here a,b is Operands & + is Operator
        System.out.println(sum);

        /* Types of Operators :-
        Arithmetic Operators (Binary/Unary)
        Relational Operators
        Logical Operators
        Bitwise Operators
        Assignment Operators
         */
    }

    public static void arithmeticOperators() {
        // Binary +, -, *, /, % (There are two operands in Binary)
        // Unary ++, -- (There is only one operand in Unary)
        int A = 10;
        int B = 5;

        int sum = A + B;
        int sub = A - B;
        int mul = A * B;
        int div = A / B;
        int mod = A % B; // Modulo Prints Remainder

        System.out.println("Add : " + sum + "\nSub : " + sub + "\nMul : " + mul + "\nDiv : " + div + "\nMod : " + mod);

    }

    public static void unaryOperators() {
        // Operators that perform an operation on a single operand
        // ++ Increment Operator
        // -- Decrement Operator

        // --- Pre-Increment Example ---
        int x = 10;
        // ++x increments 'x' to 11 first, THEN assigns that 11 to 'y'.
        int y = ++x; 
        System.out.println("Pre-Increment x: " + x); // Output: 11
        System.out.println("Pre-Increment y: " + y); // Output: 11

        // --- Post-Increment Example ---
        int a = 10;
        // a++ assigns the current value of 'a' (10) to 'b' first, THEN increments 'a' to 11.
        int b = a++; 
        System.out.println("Post-Increment a: " + a); // Output: 11
        System.out.println("Post-Increment b: " + b); // Output: 10

        //Vice-versa for Decrement Operator
    }

    public static void relationalOperators() {
        int A = 15; 
        int B = 20; 

        // Relational operators compare two operands and return a boolean (true or false)
        
        // Equal to
        System.out.println("Equal to (A == B): " + (A == B));                 // Output: false
        
        // Not equal to
        System.out.println("Not equal to (A != B): " + (A != B));             // Output: true
        
        // Greater than
        System.out.println("Greater than (A > B): " + (A > B));               // Output: false
        
        // Less than
        System.out.println("Less than (A < B): " + (A < B));                  // Output: true
        
        // Greater than or equal to
        System.out.println("Greater than or equal to (A >= B): " + (A >= B)); // Output: false
        
        // Less than or equal to
        System.out.println("Less than or equal to (A <= B): " + (A <= B));    // Output: true
    }

    public static void logicalOperators() {
        int a = 10;
        int b = 20;

        // Save our conditions into variables to keep the logic clean
        boolean condition1 = (a < b);  // This is TRUE
        boolean condition2 = (a == b); // This is FALSE

        // --- AND (&&) ---
        // Needs BOTH to be true
        System.out.println("AND Result: " + (condition1 && condition2)); // Output: false

        // --- OR (||) ---
        // Needs ONLY ONE to be true
        System.out.println("OR Result: " + (condition1 || condition2));  // Output: true

        // --- NOT (!) ---
        // Flips the value of condition1 (TRUE becomes FALSE)
        System.out.println("NOT Result: " + (!condition1));              // Output: false
    }

    public static void assignmentOperators() {
        // 1. Basic Assignment (=)
        int A = 10; 
        
        // 2. Addition Assignment (+=)
        // This is exactly the same as writing: A = A + 10;
        A += 10; 
        System.out.println("A after += 10 : " + A); // Output: 20

        // 3. Subtraction Assignment (-=)
        int B = 20;
        // This is exactly the same as writing: B = B - 5;
        B -= 5; 
        System.out.println("B after -= 5  : " + B); // Output: 15

        // 4. Multiplication Assignment (*=)
        int C = 5;
        // This is exactly the same as writing: C = C * 4;
        C *= 4; 
        System.out.println("C after *= 4  : " + C); // Output: 20

        // 5. Division Assignment (/=)
        int D = 20;
        // This is exactly the same as writing: D = D / 4;
        D /= 4; 
        System.out.println("D after /= 4  : " + D); // Output: 5
    }

    public static void main(String args[]) {
        // typesOfOperator();
        // arithmeticOperators();
        // unaryOperators();
        // relationalOperators();
        // logicalOperators();
        // assignmentOperators();
    }
}
