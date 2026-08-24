import java.util.*;

public class Main{

    public static void introToNestedLoops() {
        for(int line = 1; line <= 4; line++) {
            for(int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    } 

    public static void invertedStarPattern() {
        int n = 4;

        for(int line = 1; line <= n; line++) {
            for(int star = n; star >= line ; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
        /* 
           --- ITERATION 1 ---
           line = 1 (1 <= 4 is True)
           Inner Loop execution:
             star = 4 (4 >= 1 is True) -> prints "*"
             star = 3 (3 >= 1 is True) -> prints "*"
             star = 2 (2 >= 1 is True) -> prints "*"
             star = 1 (1 >= 1 is True) -> prints "*"
             star = 0 (0 >= 1 is False) -> Inner loop ends
           Row Output: ****
           
           --- ITERATION 2 ---
           line = 2 (2 <= 4 is True)
           Inner Loop execution:
             star = 4 (4 >= 2 is True) -> prints "*"
             star = 3 (3 >= 2 is True) -> prints "*"
             star = 2 (2 >= 2 is True) -> prints "*"
             star = 1 (1 >= 2 is False) -> Inner loop ends
           Row Output: ***
           
           --- ITERATION 3 ---
           line = 3 (3 <= 4 is True)
           Inner Loop execution:
             star = 4 (4 >= 3 is True) -> prints "*"
             star = 3 (3 >= 3 is True) -> prints "*"
             star = 2 (2 >= 3 is False) -> Inner loop ends
           Row Output: **
           
           --- ITERATION 4 ---
           line = 4 (4 <= 4 is True)
           Inner Loop execution:
             star = 4 (4 >= 4 is True) -> prints "*"
             star = 3 (3 >= 4 is False) -> Inner loop ends
           Row Output: *
           
           --- ITERATION 5 ---
           line = 5 (5 <= 4 is False) 
           Outer loop terminates.
         */
    }

    public static void printHALF_PYRAMID_pattern() {
        int n = 4;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void characterPattern() {
        
        char ch = 'A';

        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // introToNestedLoops();
        // invertedStarPattern();
        // printHALF_PYRAMID_pattern();
        characterPattern();
    }
}
