public class PracticeSolutions {

    public static void hollowRectanglePattern(int totRows, int totCols) {
        //outer loop
        for(int i = 1; i <= totRows; i++) {
            //inner loop
            for(int j = 1; j <= totCols; j++) {
                //cell - (i, j)
                if(i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
                System.out.println();
        }
    }

    public static void inverted_rotated_HalfPyramid(int n) {
        //outer loop - rows
        for(int i = 1; i <= n; i++) {
            //inner loop - cols(spaces)
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //inner loop - cols(starts)
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            //new line
            System.out.println();
        }
    }
    
    public static void inverted_HalfPyramid_with_Numbers(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n-i+1); j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public static void floydsTrianglePattern(int n) {
        int counter = 1;
        //outer loop - rows
        for(int i = 1; i <= n; i++) {
            //inner loop - cols
            for(int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void _01TrianglePattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
                System.out.println();
        }
    }

    public static void butterflyPattern(int n) {
        //1st half
        for(int i = 1; i <= n; i++) {
            //stars - i
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces - 2*(n-1)
            for(int k = 1; k <= 2*(n-i); k++) {
                System.out.print(" ");
            }
            //stars - i
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i = n; i >= 1; i--) {
            //stars - i
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces - 2*(n-1)
            for(int k = 1; k <= 2*(n-i); k++) {
                System.out.print(" ");
            }
            //stars - i
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRhombusPattern(int n) {
        for(int i = 1; i <= n; i++) {
            //spaces
            for(int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            //stars
            for(int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombusPattern(int n) {
        for(int i = 1; i <= n; i++) {
            //spaces
            for(int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }

            //hollow rectangle - stars
            for(int j = 1; j<=n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
    }

    public static void diamondPattern(int n) {
        //1st half
        for(int i = 1; i <= n; i++) {
            //spaces
            for(int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            //stars
            for(int k = 1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i = n; i >= 1; i--) {
            //spaces
            for(int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            //stars
            for(int k = 1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        // hollowRectanglePattern(4, 5);
        // inverted_rotated_HalfPyramid(14);
        // inverted_HalfPyramid_with_Numbers(10);
        // floydsTrianglePattern(7);
        // _01TrianglePattern(5);
        // butterflyPattern(4);
        // solidRhombusPattern(5);
        // hollowRhombusPattern(7);
        diamondPattern(5);
    }
}
