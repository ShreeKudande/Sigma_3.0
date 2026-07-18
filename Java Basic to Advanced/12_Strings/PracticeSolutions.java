import java.util.*;
import java.util.Arrays;

public class PracticeSolutions{

    public static void main(String args[]) {
        //Q1
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();

        // int count = 0;

        // for(int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);

        //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //         count++;
        //     }
        // }

        // System.out.println("Lowercase vowels entered by the user in str : " + count);

        //Q2
        //false true

        //Q3
        //ApnaCoege

        //Q4 Determine if 2 Strings are anagrams of each other.
        String str1 = "earth";
        String str2 = "heart";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray, str2charArray);

            if(result) {
                System.out.println("Both strings are anagrams of each other");
            } else {
                System.out.println("Both strings are not anagrams of each other.");
            }
        } else {
            System.out.println("Both strings are not anagrams of each other."); 
        }

        //Q5
        //Check docs folder for Q5.Solution.md file
    }
}