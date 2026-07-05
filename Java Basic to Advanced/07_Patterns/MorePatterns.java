public class MorePatterns {

    public static void numberPyramid(int n) {
        //Number Pyramid Pattern

        for(int i = 1; i <= n; i++) {

            //Spaces
            for(int space = 1; space <= n-i; space++) {
                System.out.print(" ");
            }

            //Stars
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromicPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for(int k = 2; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {

        //Number Pyramid Pattern
        // int n = 5;
        // numberPyramid(n);

        //Palindromic Pattern with Numbers
        int n = 5;
        palindromicPattern(n);
    }
}
