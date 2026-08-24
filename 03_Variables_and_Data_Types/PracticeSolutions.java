import java.util.*;

public class PracticeSolutions {

    public static void Q1() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int avg = (A+B+C)/3;
        System.out.println("Average is " + avg);
    }

    public static void Q2() {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("area of a square is " + area);
    }

    public static void Q3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price for Pencil, Pen & Eraser : ");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = (pencil + pen + eraser);
        System.out.println("Total Bill : " + total*1.18);

    }

    public static void Q4() {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
        // Ans. Type would be double because of type conversion.
    }

    public static void Q5() {
        int $ = 16;
        System.out.println($); // It would not give any error because $ sign is allowed in naming variables.
    }

    public static void main(String args[]) {
        // Q1();
        // Q2();
        // Q3();
        // Q4();
        // Q5();
    }
}
