import java.util.*;

public class Main{

    public static void ifElse() {
        int age = 16;
        if(age >= 18) {
            System.out.println("adult : drive, vote");
        }
        if(age > 13 && age < 18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("not adult");
        }
    }

    public static void printTheLargestof2Numbers() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B) {
            System.out.println("A is greater then B");
        }
        else if(A < B) {
            System.out.println("Both are equal");
        }
        else {
            System.out.println("B is greater then A");
        }
    }

    public static void printIfNumberisOddorEven() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num % 2 == 0) {
            System.out.println("It's Even!");
        } else {
            System.out.println("It's Odd!");
        }
    }

    public static void elseIf() {
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();

        if(income < 500000) {
            System.out.print("You pay 0% tax.");
        } else if(income <= 1000000 && income >= 500000) {
            System.out.print("You pay " + income * 0.2 + " in tax.");
        } else if(income >= 1000000) {
            System.out.print("You pay " + income * 0.3 + " in tax.");
        }
    }

    public static void printTheLargestof3Numbers() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is greater.");
        } else if(n2 > n3) {
            System.out.println(n2 + " is greater.");
        } else{
            System.out.println(n3 + " is greater.");
        }
    }

    public static void ternaryOperator() {
        // A ternary operator is a shorthand, single-line conditional operator in programming that replaces simple if-else statements. It uses three operands—a condition, a true value, and a false value—to quickly assign variables or execute code based on a boolean condition. It is represented as condition ? value1 : value2. 

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(((number%2)==0)? "Even" : "Odd");
        sc.close()
    }

    public static void checkIfaStudentWillPassOrFail() {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        System.out.println(((marks >= 33)? "PASS" : "FAIL"));

    }

    public static void switchStatement() {
        // Switch statement in Java is a control flow structure that allows a program to execute different blocks of code based on the value of a single expression. It provides a cleaner, more efficient alternative to a long chain of if-else-if statements when dealing with multiple discrete values.

        /* switch(expression) {
        case value1:
        // Code to execute if expression == value1
        break; // Optional, but recommended
        case value2:
        // Code to execute if expression == value2
        break;

        default:
        // Code to execute if none of the cases match
        }
         */

    }

    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int n1 = sc.nextInt();
        System.out.println("Enter b : ");
        int n2 = sc.nextInt();
        System.out.println("Enter operator : ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            case '%':
                System.out.println(n1%n2);
                break;
            default:
                System.out.println("Wrong Operator");
        }

    }

    public static void main(String args[]) {
        // ifElse();
        // printTheLargestof2Numbers();
        // printIfNumberisOddorEven();
        // elseIf();
        // printTheLargestof3Numbers();
        // ternaryOperator();
        // checkIfaStudentWillPassOrFail();
        // switchStatement();
        calculator();

    }
}
