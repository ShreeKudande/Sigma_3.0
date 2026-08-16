public class Main {

    public static void printArr(int arr[]) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }
        
        int mid = si + (ei - si) / 2; //(si+ei)/2
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[],int si,int mid,int ei) {
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp arr

        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left part
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        //right part
        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for(k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }

        //last element
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1); //left
        quickSort(arr, pidx+1, ei); //right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; //to make place for els smaller than pivot
        for(int j = si; j < ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        //swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static int search(int nums[], int target, int si, int ei) {
        if(si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if(nums[mid] == target) {
            return mid;
        }

        if(nums[si] <= nums[mid]) {
            if(nums[si] <= target && target <= nums[mid]) {
                return search(nums, target, si, mid-1);
            } else {
                return search(nums, target, mid+1, ei);
            }
        } else {
            if(nums[mid] <= target && target <= nums[ei]) {
                return search(nums, target, mid+1, ei);
            } else {
                return search(nums, target, si, mid-1);
            }
        }
    }

    public static void main(String args[]) {

        //merge sort
        // int arr[] = {6, 3, 9, 5, 2, 8};
        // printArr(arr);
        // mergeSort(arr, 0, arr.length-1);
        // System.out.println();
        // printArr(arr);

        //quick sort
        // int arr[] = {6, 3, 9, 5, 2, 8};
        // printArr(arr);
        // quickSort(arr, 0, arr.length-1);
        // System.out.println();
        // printArr(arr);
        //Worst Case --> worst case occurs when pivot is always the smallest or the largest element.

        //Search in Rotated Sorted Array
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int tarIdx = search(nums, target, 0, nums.length-1);
        System.out.println(tarIdx);
    }
}
