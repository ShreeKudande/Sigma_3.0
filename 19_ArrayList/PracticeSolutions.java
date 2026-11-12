import java.util.*;

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

    public static ArrayList findLonely(int nums[]) {
        int n = nums.length;
        ArrayList<Integer> newList = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < n; i++) {
            boolean isLeftClear = (i == 0 || nums[i-1] < nums[i]-1);
            boolean isRightClear = (i == n-1 || nums[i+1] > nums[i]+1);

            if(isLeftClear && isRightClear) {
                newList.add(nums[i]);
            }
        }

        return newList;
    }

    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int count[] = new int[1001];
        int maxCount = 0;
        int maxNum = 0;

        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == key) {
                int target = nums.get(i+1);
                count[target]++;

                if(count[target] > maxCount) {
                    maxCount = count[target];
                    maxNum = target;
                }
            }
        }
        return maxNum;
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
        //int nums[] = {10, 6, 5, 8};
        //System.out.println(findLonely(nums));

        //Q3
        // ArrayList<Integer> newList = new ArrayList<>();
        // newList.add(1);
        // newList.add(100);
        // newList.add(200);
        // newList.add(1);
        // newList.add(100);
        // int key = 1;

        // System.out.println(mostFrequent(newList,key));

        //Q4
        
    }
}