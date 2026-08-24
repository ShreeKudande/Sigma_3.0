import java.util.Arrays;

public class PracticeSolutions {

    public static boolean containsDuplicate(int nums[]) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static int searchInRotatedSortedArray(int nums[], int tar) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(nums[mid] == tar) {
                return mid;
            }

            if(nums[start] <= nums[mid]) { //left sorted
                if(nums[start] <= tar && tar <= nums[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else { //right sorted
                if(nums[mid] <= tar && tar <= nums[end]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        //Q1
        // int[] nums = {1, 2, 3, 1};
        // System.out.println(containsDuplicate(nums));

        //Q2
        // int[] nums = {3, 4, 5, 6, 7, 0, 1, 2};
        // int tar = 0;
        // System.out.println(searchInRotatedSortedArray(nums, tar));

        //Q3,Q4 & Q5 would solve afterwards 
        

    }
}
