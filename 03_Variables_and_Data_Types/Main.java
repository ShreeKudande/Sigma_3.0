import java.util.*;

public class Main {

    public static void boilerPlate() {
        /*
        public class <YourClassNameGoesHere> {
            public static void main(String args[]) {
      
            }
        }
        */
    }

    public static void outputInJava() {
        System.out.print("Hey Shree!"); // Prints text without a new line
        System.out.println("Hey Shree!"); // Prints text and moves to a new line
        System.out.print("Hey Shree!\n Hey Shree!"); // '\n' adds a new line inside the text (Escape Sequence Cha)
    }

    public static void printPattern() {
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }

    public static void variablesInJava() {
        /*
        In Java, variables are containers used to store data in memory. Variables define how data is stored, accessed, and manipulated.

        A variable in Java has three components,

        Data Type: Defines the kind of data stored (e.g., int, String, float).
        Variable Name: A unique identifier following Java naming rules.
        Value: The actual data assigned to the variable.

        Note:-
        - Variables store data.
        - Literals are the fixed values assigned to variables.
        - Identifiers are the names given to variables, methods, classes, etc.

        The general rules for naming variables are:
            - Names can contain letters, digits, underscores, and dollar signs
            - Names must begin with a letter
            - Names should start with a lowercase letter, and cannot contain whitespace
            - Names can also begin with $ and _
            - Names are case-sensitive ("myVar" and "myvar" are different variables)
            - Reserved words (like Java keywords, such as int or boolean) cannot be used as names
        */

       int a = 10;
       int b = 5;
       System.out.println(a+b);

       String name = "Shree Kudande";
       System.out.println(name);

       a = 15; //we can change variable values after assigning it.
       a = b; //Or we can assign it too other variables value
       System.out.print(a);
    }

    public static void dataTypesInJava() {
        /* 
        Primitive data types are the basic building blocks that store simple, single values directly in memory, while Non-primitive (reference) data types are complex, user-defined types that store references (memory addresses) to objects. 

        Two main categories:
        #Primitive Data Types – the building blocks
            ·byte, short, int, long → Numbers
            ·float, double → Decimals
            ·char → Single character
            ·boolean → true/false
        #Non-Primitive Data Types – objects & references
            ·String
            ·Arrays
            ·Classes
            ·Interfaces
         */

        byte b = 8;
        System.out.println(b);

        char ch = 'a'; //If we type 'abc' in value it would give error because we can only save single characters in char.
        System.out.println(ch);

        boolean var = true; //Or false & its used to check conditions like if its true or false.
        System.out.println(var);

        float price = 10.5f;
        int number = 16;
        short n = 365;
        // & there are 'long' & 'double' too, long is used for numbers only but it gives more memeory for bigger numbers and double is used for decimals which is also bigger then float

        /* NOTE: "Lossy Conversion" error occurs when putting a larger type (double) into a smaller type (float).It is called "lossy" because you risk losing information (precision or magnitude) during the process.
        Think of it like trying to pour a liter of water into a half-liter cup — the excess simply spills over.
        Example: 'float price = 10.5;' fails because 10.5 is a double by default.
        Fix: Use '10.5f' to explicitly define it as a float.*/

        /* Size of Data Types -->
         * Data Type | Size    | Description & Range (Magnitude)
         * ----------------------------------------------------------------------------------------
         * byte      | 1 byte  | Stores whole numbers from -128 to 127
         * short     | 2 bytes | Stores whole numbers from -32,768 to 32,767 (~32 Thousand)
         * int       | 4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647 (~2.14 Billion)
         * long      | 8 bytes | Stores whole numbers from -9,223,372... to 9,223,372... (~9.22 Quintillion)
         * float     | 4 bytes | Stores fractional numbers. Sufficient for 6 to 7 decimal digits
         * double    | 8 bytes | Stores fractional numbers. Sufficient for 15 decimal digits
         * boolean   | 1 bit   | Stores true or false values
         * char      | 2 bytes | Stores a single character/letter or ASCII values
        */

    }

    public static void sumOfab() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println(sum);
    }

    public static void commentsInJava() {
        // This is a single line comment -- Shortcut key [Ctrl+/]

        /* This is a 
        multi-line 
        comment -- Shortcut key [Shift+Alt+A]
        */ 
    }

    public static void inputInJava() {
        // import java.util.*; -- Add this at the very top of your file to import the Scanner class

        Scanner sc = new Scanner(System.in); // Create a Scanner object to read from standard input (keyboard)

        // 1. next() - Reads a single word (stops reading at the first space)
        // String input = sc.next();
        // System.out.println(input);

        // 2. nextLine() - Reads an entire line of text (including spaces) until the Enter key is pressed
        // String name = sc.nextLine();
        // System.out.println(name);

        // 3. nextInt() - Reads a 32-bit integer (whole number)
        // int number = sc.nextInt();
        // System.out.println(number);

        // 4. nextFloat() - Reads a 32-bit decimal number
        float price = sc.nextFloat();
        System.out.print(price);
    
        /*
         OTHER SCANNER METHODS (For different data types)
         * nextByte()    : Reads a byte (1 byte). Use case: Extremely memory-tight whole numbers (-128 to 127).
         * nextShort()   : Reads a short (2 bytes). Use case: Small whole numbers up to ~32,000.
         * nextLong()    : Reads a long (8 bytes). Use case: Massive whole numbers like population counts or database.
        
         IDs.
         * nextDouble()  : Reads a double (8 bytes). Use case: High-precision decimal numbers (e.g., scientific calculations).
         * nextBoolean() : Reads a boolean (1 bit). Use case: True/False logic triggers (user types "true" or "false").
        */
    }

    public static void sumOfNumbers() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println(sum);
    }

    public static void productOfab() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println(product);
    }

    public static void areaOfaCircle() {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float pie = 3.14f;
        float area = pie * r * r;
        System.out.println(area);
    }

    public static void typeConversion() {
        /* * TYPE CONVERSION (Implicit / Widening)
         * Java auto-converts data types when:
         * 1. Types are compatible (e.g., both numeric).
         * 2. Destination size > Source size.
         * Hierarchy: byte -> short -> int -> long -> float -> double
         */

        // Example 1: Valid Conversion
        // int smallNum = 25;       // 4 bytes
        // long bigNum = smallNum;  // 8 bytes -> Fits perfectly.

        /*
         * LOSSY CONVERSION
         * Occurs when forcing a larger/precise type (long, double) into a 
         * smaller type (int, float). Java blocks this to prevent data loss.
         */

        // Example 2: Invalid Conversion (Throws Error)
        long a = 25;              
        // int b = a;             // ERROR: possible lossy conversion from long to int.
        // Fails because int < long.

        // System.out.println(b); 
    }

    public static void typeCasting() {
        /* * TYPE CASTING (Narrowing / Explicit Conversion)
         * Forcing a larger or more precise data type into a smaller one.
         * Requires manually specifying the target type in parentheses: (type).
         * Warning: This often causes data loss (e.g., dropping decimals entirely).
         */

        // Example 1: Float to Int
        float marks = 99.999f;
        int score = (int) marks; // Drops the decimal completely (Outputs 99, does not round up)
        System.out.println(score);

        /*
         * TYPE PROMOTION / CHAR TO INT
         * Characters are stored as numbers behind the scenes.
         */

        // Example 2: Char to Int
        char ch = 'a';
        int number = ch; // Automatically assigns the ASCII value of 'a' (which is 97)
        System.out.print(number);
    }

    public static void typePromotionInExpression() {
        /* * TYPE PROMOTION IN EXPRESSIONS
         * 1. Java automatically promotes byte, short, and char to int when evaluating an expression.
         * 2. If one operand is long, float, or double, the whole expression is promoted to 
         * long, float, or double respectively (the largest type present).
         */

        // Example 1: char promoted to int
        char a = 'a'; // ASCII 97
        char b = 'b'; // ASCII 98
        // char c = a - b; // ERROR: 'a - b' is evaluated as an int (97 - 98).
        System.out.println((int) a); // Prints 97
        System.out.println(b - a);   // Prints 1 (Expression promoted to int)

        // Example 2: short, byte, char promoted to int
        short s = 5;
        byte by = 25;
        char c = 'c';
        // byte bt = s + by + c; // ERROR: The result of this addition is an int.
        byte bt = (byte) (s + by + c); // FIX: Explicitly cast the entire int result back to byte.
        System.out.println(bt);

        // Example 3: Promotion to the largest data type
        int i = 10;
        float f = 20.5f;
        long l = 25;
        double d = 30;
        // int ans = i + f + l + d; // ERROR: Expression contains a double, so result is double.
        double ans = i + f + l + d; // Runs perfectly.
        System.out.println(ans);

        /* * COMMON PITFALL: Literal Numbers
         * Literal whole numbers (like 2) are treated as 'int' by default.
         */
        byte b2 = 5;
        // byte a2 = b2 * 2; // ERROR: 'b2' is promoted to int to multiply with int '2'. Result is int.
        byte a2 = (byte) (b2 * 2); // FIX: Cast the final evaluated expression back to byte.
        System.out.println(a2);
    }

    public static void howDoesJavaCodeRun() {
        // HOW JAVA CODE RUNS: A TWO-STEP PROCESS
        
        // --- PHASE 1: COMPILATION ---
        // 1. Source Code: Developer writes human-readable Java code (.java file).
        // 2. Compiler: The Java compiler checks for syntax errors and translates the code.
        // 3. Byte Code: The output is a platform-independent bytecode (.class file). 
        
        // --- PHASE 2: EXECUTION ---
        // 4. Java Virtual Machine (JVM): The JVM reads the generated .class bytecode.
        // 5. Native Code: The JVM translates the bytecode into machine-specific Native Code.
        // 6. Execution: The host computer's hardware executes this native machine code.

        // JAVA ENVIRONMENT ARCHITECTURE
        // * JVM (Java Virtual Machine): The core engine that runs the bytecode.
        // * JRE (Java Runtime Environment): JVM + Core Libraries. Provides everything needed to RUN a Java program.
        // * JDK (Java Development Kit): JRE + Development Tools (like the compiler). Provides everything needed to DEVELOP a Java program.
    }

    //main method
    public static void main(String args[]) {
        // boilerPlate();
        // outputInJava();
        // printPattern();
        // variablesInJava();
        // dataTypesInJava();
        // sumOfab();
        // commentsInJava();
        // inputInJava();
        // sumOfNumbers(); //Input from User
        // productOfab();
        // areaOfaCircle();
        // typeConversion();
        // typeCasting();
        // typePromotionInExpression();
        // howDoesJavaCodeRun();
    }
}
