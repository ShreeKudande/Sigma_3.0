//First doo read the pdf in docs folder provided - Understanding Bit Manipulation Deeply.pdf

public class Main {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            //even number
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static int getIthBit(int n, int i) { //Read a specific bit
        int bitMask = 1<<i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) { //Turn a specific bit ON
        int bitMask = 1 << i;

        return (n | bitMask);
    }

    public static int clearIthBit(int n, int i) { //Turn a specific bit OFF
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) { //Change a bit to a variable value
        // if(newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        clearIthBit(n, i);
        int BitMask = newBit << i;
        return n | BitMask;
    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearBitsinRange(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;   
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerofTwo(int n) {
        return (n & (n-1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) { //check our LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;

        while(n > 0) {
            if((n & 1) != 0) { //check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String args[]) {

        //Basics
        System.out.println((5 & 6)); //AND &
        System.out.println((5 | 6)); //OR |
        System.out.println((5 ^ 6)); //XOR ^
        System.out.println((~5)); // Binary One's Complement ~ | ~0 --> -1
        System.out.println((5<<2)); // Binary Left Shift
        //Note :- [a << b = a * 2^b] ex,. 5 << 2 = 5 * 2^2 --> 20
        System.out.println((6>>1)); // Binary Right Shift
        //Note :- [a >> b = a/2^b] ex,. 6 >> 1 = 6/2^1 --> 3
    

        //Check if a number is Odd or Even
        oddOrEven(3);  
        oddOrEven(11);  
        oddOrEven(14);

        //get ith Bit
        System.out.println(getIthBit(10, 2));    

        //set ith Bit
        System.out.println(setIthBit(10, 2));

        //clear ith Bit
        System.out.println(clearIthBit(10, 1));

        //update ith bit
        System.out.println(updateIthBit(10, 2, 1));

        //clear last i bits
        System.out.println(clearIBits(15, 2));

        //clear range of bits
        System.out.println(clearBitsinRange(10, 2, 4));

        //check if a number is power of 2 or not
        System.out.println(isPowerofTwo(8));

        //count set bits in a number
        System.out.println(countSetBits(15));

        //fast Exponentiation
        System.out.println(fastExpo(5, 3));

        //modular Exponentiation
        
    }
}
