public class PracticeSolutions {

    public static void Q1() {
        int x = 2, y = 5;

        // exp1: Evaluates left-to-right -> (10 / 2) = 5
        int exp1 = (x * y / x);
        // exp2: Parentheses evaluate first -> (5 / 2) = 2 (integer division drops the 0.5), then 2 * 2 = 4
        int exp2 = (x * (y / x));

        System.out.print(exp1 + " , ");
        System.out.print(exp2);
    }

    public static void Q2() {
        int x = 200, y = 50, z = 100;
        if(x > y && y > z){
        System.out.println("Hello");
        }
        if(z > y && z < x){
        System.out.println("Java");
        }
        if((y+200) < x && (y+150) < z){
        System.out.println("Hello Java");
        }
    }

    public static void Q3() {
        int x, y, z;
        x = y = z = 2;
        x += y; // 2 + 2 = 4
        y -= z; // 2 - 2 = 0
        z /= (x + y); // 2 / (2 + 2) = 0.5
        System.out.println(x + " " + y + " " + z);
    }

    public static void Q4() {
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);

        // Breaking down the equation:
        // Part 1: 4/3 is 1 (integer division). 1 * (9 + 34) = 43
        // Part 2: 9 * (2 + (4 * 6)) = 9 * 26 = 234
        // Part 3: (3 + 12 * 4) / (2 + 48) = 51 / 50 = 1 (integer division)
        // Total: 43 + 234 + 1 = 278

        System.out.println(exp);
        
    }

    public static void Q5() {
        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2); 
    }

    public static void main(String args[]) {
        // Q1();
        // Q2();
        // Q3();
        // Q4();
        Q5();
    }
}
