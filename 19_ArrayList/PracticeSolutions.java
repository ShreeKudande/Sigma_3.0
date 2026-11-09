import java.util.ArrayList;

public class PracticeSolutions {

    public static boolean isMonotonic(ArrayList<Integer> nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for(int i = 0; i < nums.size()-1; i++) {
            if(nums.get(i) > nums.get(i+1)) {
                isIncreasing = false;
            }
            if(nums.get(i) < nums.get(i+1)) {
                isDecreasing = false;
            }
        }

        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) {
        //Q1
        // ArrayList<Integer> nums = new ArrayList<>();
        // nums.add(1);
        // nums.add(2);
        // nums.add(2);
        // nums.add(3);

        // System.out.println(isMonotonic(nums));

        /*
        Monotonic Array Logic Explanation

        - What is Monotonic
        The whole array must move in only one direction.
        It can either only go up, or only go down. It cannot zigzag (like 1, 3, 2).

        - Why two boolean flags
        We start with two assumptions before the loop:
        1. isIncreasing = true (Assume the whole array goes up)
        2. isDecreasing = true (Assume the whole array goes down)

        - How the loop checks
        If we see a step down (nums.get(i) > nums.get(i+1)), the array is not purely increasing. We set isIncreasing = false.
        If we see a step up (nums.get(i) < nums.get(i+1)), the array is not purely decreasing. We set isDecreasing = false.

        - The Final Return
        If the array zigzagged, both flags become false.
        If it only went one way, at least one flag stays true.
        return isIncreasing || isDecreasing; (Returns true if at least one assumption survived)
        */

       //Q2
       
    }
}