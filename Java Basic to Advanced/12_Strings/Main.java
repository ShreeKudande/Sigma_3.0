import java.util.*;

public class Main {

    public static void printLetters(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for(int i = 0; i <= n/2; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false; //not a palindrome
            }
        }
        return true; //is a palindrome
    }

    public static float shortestPath(String str) {
        int x = 0, y = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'N') {
                y++;
            } else if(str.charAt(i) == 'S') {
                y--;
            } else if(str.charAt(i) == 'E') {
                x++;
            } else if(str.charAt(i) == 'W') {
                x--;
            }
        }
        float displacement = (float) Math.sqrt(x*x+y*y);
        return displacement;
    }

    public static void substring(String str, int startIndex, int endingIndex) {
        for(int i = startIndex; i < endingIndex; i++) {
            System.out.print(str.charAt(i));
        }
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str) { //O(n)
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < str.length(); i++) {
            int count = 1;
            sb.append(str.charAt(i));
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            if(count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }
    
    public static void main(String args[]) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str1 = "abcd";
        // String str2 = new String("xyz@#$1234");

        // //Strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name;
        // // name = sc.next(); *Only takes single word after space is all ignored
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Shree Kudande";
        // System.out.println(fullName.length());

        //concatenation
        // String firstName = "Shree";
        // String lastName = "Kudande";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.charAt(0)); //prints first letter of a string

        // printLetters("IamtheBest!");

        //Q1.Check if a String is a Palindrome Ex:- "racecar", "noon", "madam" etc,.
        // String str = "racecar";
        // System.out.print(isPalindrome(str)); 

        //Q2
        // String str = "WNEENESENNN";
        // System.out.println(shortestPath(str));

        // String s1 = "Shree";
        // String s2 = "Shree";
        // String s3 = new String("Shree");

        // if(s1 == s2) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // if(s1 == s3) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // if(s1.equals(s3)) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        //Output
        // Strings are equal
        // Strings are not equal
        // Strings are equal //Used .equals

        //Substring
        // String str = "HelloWorld!";
        // substring(str, 0, 4);
        // System.out.println(str.substring(0, 4)); //Java has already a function for this

        // String fruits[] = {"apple", "mango", "banana"};
        
        // String largest = fruits[0];
        // for(int i = 1; i < fruits.length; i++) {
        //     if(largest.compareTo(fruits[i]) < 0) {
        //         largest = fruits[i];
        //     }
        // }
        // System.out.print(largest);

        // StringBuilder sb = new StringBuilder("");
        // for(char ch = 'a'; ch <= 'z'; ch++) {
        //     sb.append(ch);
        // }

        // System.out.println(sb);
        // System.out.println(sb.length());
        //abcd efg hijk lmnop qrst uv wxyz
        //26
        //O(26)
        //O(26 * n^2) if used only Strings


        //Q4
        // String str = "hi, i am shree ";
        // System.out.println(toUpperCase(str));

        //Q5
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
