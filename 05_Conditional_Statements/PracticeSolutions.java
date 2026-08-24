import java.util.*;

public class PracticeSolutions {

    public static void Q1() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(((num < 0) ? "NEGATIVE" : "POSITIVE"));
    }

    public static void Q2() {
        double temp = 103.5;
        System.out.println((temp > 100) ? "You hava a fever" : "You don't have a fever");
    }

    public static void Q3() {
        System.out.print("Enter week number(1-7): ");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter week number between 1-7.");
        }
    }

    public static void Q4() {
        int a = 63, b = 36;
        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;
        System.out.println(x + " , " + y);
    }

    public static void Q5() {

        /*
         * Logic Behind Leap Year Rules:
         * * The Earth takes approximately 365.24219 days to orbit the Sun.
             * A standard calendar year is exactly 365 days.
         * * Rule 1 (year % 4 == 0):
             * The remaining ~0.242 days is roughly 1/4 of a day. To account for this,
             * we add 1 extra day every 4 years.
         * * Rule 2 (year % 100 != 0):
             * Adding a day every 4 years assumes an extra 0.25 days per year, which
             * overestimates the actual 0.24219 days. To fix this overcompensation,
             * we skip the leap year every 100 years (century years like 1700, 1800, 1900).
         * * Rule 3 (year % 400 == 0):
             * Skipping the leap year every 100 years slightly undercompensates the
             * calendar. To fine-tune the math perfectly, we add the leap day back
             * every 400 years (like the year 2000).
         */

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Its a Leap Year.");
                } else {
                    System.out.println("Its not a Leap Year.");
                }
            } else {
                System.out.println("Its a Leap Year.");
            }
        } else {
            System.out.println("Its not a Leap Year.");
        }
    }

    public static void main(String args[]) {
        // Q1();
        // Q2();
        // Q3();
        // Q4();
        Q5(); // Leap year OR not
    }
}
