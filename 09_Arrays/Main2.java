public class Main2 {

    public static void subArrays(int numbers[]) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++) { // int start = i;

            for(int j = i; j < numbers.length; j++) { // int end = j;
            curSum = 0;
                for(int k = i; k <= j; k++) { //print
                curSum += numbers[k];
                System.out.print(numbers[k] + " "); //subarray
                }
                System.out.print(" = " + curSum);

                if(maxSum < curSum) {
                    maxSum = curSum;
                }
                if(minSum > curSum) {
                    minSum = curSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max sum = " + maxSum);
        System.out.println("Min sum = " + minSum);
    }

    public static void prefixSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = i; j < numbers.length; j++) {
                int end = j;
                
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    
    public static void kadanes(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];

            maxSum = Math.max(currSum, maxSum);

            if(currSum < 0) {
                currSum = 0;
            }
        }

        System.out.println("Our max sum is " + maxSum);
    }

    public static int trappingRainwater(int height[]) { // O(n)
        //int height[] = {4, 2, 0, 6, 3, 2, 5};
        int n = height.length;
        int trappedWater = 0;
        
        //calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
    
        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int j = n-2; j >= 0; j--) {
            rightMax[j] = Math.max(height[j], rightMax[j+1]);
        }

        //loop
        for(int k = 0; k < n; k++) {
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[k], rightMax[k]);

            //trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[k];
        }

        return trappedWater;
            
    }

    public static int maxProfit(int[] prices) {
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < buyingPrice) {
                buyingPrice = prices[i];
            } else if(prices[i] - buyingPrice > maxProfit) {
                maxProfit = prices[i] - buyingPrice;
            }
        }
        return maxProfit;
    }
    
    public static void main(String args[]) {
        
        //Brute Force 
        // int numbers[] = {1, -2, 6, -1, 3};
        // subArrays(numbers);

        //prefix Sum
        // int numbers[] = {1, -2, 6, -1, 3};
        // prefixSum(numbers);

        /* 
        kadane's Algorithm
        Keep adding numbers. If the sum goes below zero, reset it to zero. Save the highest score.
        +ve + +ve --> +ve
        (big)+ve + (small)-v --> +ve
        (small)+ve + (big)-ve --> -ve(0)
        {-2, -3, 4, -1, -2, 1, 5, -3}

        [ curSum | 0, 0, 4, 3, 1, 2, 7, 4 ]
        [ maxSum | 0, 0, 4, 4, 4, 4, 7, 7 ] = 7
         */
        /* 
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int numbers[] = {-1, -2, -3, -4}; // negative array
        kadanes(numbers);
        */

        /*
        //Trapping Rainwater
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappingRainwater(height));
         */

        //Buy & Sell Stocks
        // int prices[] = {2, 4, 1};
        // System.out.print(maxProfit(prices));

        
    }
}
