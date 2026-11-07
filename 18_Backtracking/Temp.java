class temp {

    public static void printArr(int arr[])
    {
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }

    public static void changeArr(int arr[], int i, int val)
    {
        if(i == arr.length)
        {   
            printArr(arr);
            return;
        }

        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;

    }

    public static void main(String args[])
    {
        //Backtracking
        int arr[] = new int[5];

        changeArr(arr, 0, 1);
        System.out.println();
        printArr(arr);
    }
}
