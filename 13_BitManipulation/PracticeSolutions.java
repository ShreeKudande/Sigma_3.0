//Q1
//Ans : The value of x^x = 0
//Think about it, xor gives 0 when the bits are the same. if we compare the same number to itself, the bits will always be the same. So, the answer of x^x will be always be 0.

public class PracticeSolutions {


    public static void main(String args[]) {
        //Q2
        // int x = 3, y = 4;
        // System.out.println("Before swap: x = " + x + " y = " + y);

        // x = x ^ y;
        // y = x ^ y;
        // x = x ^ y;

        // System.out.println("After swap: x = " + x + " y = " + y);

        //Q3
        // int x = 6;
        // System.out.println(x + " + " + 1 + " is " + -~x);
        // int y = -4;
        // System.out.println(y + " + " + 1 + " is " + -~y);
        // int z = 0;
        // System.out.println(z + " + " + 1 + " is " + -~z);

        /*
            * UNDERSTANDING WHY -~x EQUALS x + 1
            * ---------------------------------------------------------
            * Let's break down the exact binary math using 8-bit Two's 
            * Complement (the standard way computers handle integers).
            * Example: x = 6.
            *
            * Step 1: Start with x
            * x = 6
            * Binary: 0000 0110
            *
            * Step 2: Apply the Bitwise NOT (~x)
            * The ~ operator flips every single bit (0s to 1s, 1s to 0s).
            * Flip the bits of 0000 0110
            * Binary result: 1111 1001
            * (Note: In Two's Complement, because the first bit is a 1, 
            * this is read as a negative number. This is -7).
            *
            * Step 3: Apply the Unary Minus (-) to that result
            * How does a computer make a number negative in Two's Complement? 
            * Strict two-step rule: Flip all the bits, then add 1.
            *
            * 1. Flip all the bits of 1111 1001.
            * Flipping them back returns us to our original number: 
            * 0000 0110 (which is exactly x)
            * 2. Add 1 to that result.
            * 0000 0110 + 0000 0001 = 0000 0111
            *
            * The Final Result
            * Binary: 0000 0111
            * Decimal: 7
            *
            * Why this always works:
            * Because ~ flips the bits, and - flips them back and adds 1, 
            * the two bit-flips cancel each other out completely. You are 
            * left with nothing but the "add 1" step.
            *
            * Therefore, in binary hardware, -~x is literally executed as 
            * "take x and add 1".
        */

        //Q4
        //Convert uppercase character to lowercase
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char)(ch | ' '));
            //abcd efg hijk lmnop qrst uv wxyz

        }
        
        //Q5 --> https://graphics.stanford.edu/~seander/bithacks.html


    }
}
