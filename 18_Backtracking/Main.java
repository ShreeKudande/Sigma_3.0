/*
The Definition
Backtracking is a trial-and-error algorithm that builds a solution step-by-step, but immediately abandons (reverses) its current path the moment it realizes that path cannot lead to a valid answer.

How It Works
It operates as a highly organized search process, working through three basic steps until the problem is solved:

1. Take a Step: Make a single, tentative choice toward solving the problem.
2. Evaluate: Does this choice break any rules?
 If no: Move forward and make the next choice.
 If yes (or if you hit a dead end): Stop going down this path.
3. Undo and Pivot (The Backtrack): Erase that last choice, step backward to your previous position, and try the next available option instead.

By immediately throwing away bad paths instead of blindly following them to the end, backtracking saves time while guaranteeing that every possible valid combination is checked.
*/

/*
Types of Backtracking :-
*Decision Problems: Backtracking to find just one valid solution or a simple "Yes/No" answer. (Example: Solving a maze; you stop as soon as you find the exit).
*Enumeration Problems: Backtracking to find and list every possible solution. (Example: Generating all possible subsets or password combinations; you must check every path).
*Optimization Problems: Backtracking to find the absolute best solution out of all valid options. (Example: Finding the shortest possible route between 5 cities; you compare paths to find the most efficient one).
*/

// Key takeaway: The logic of moving forward and backward remains exactly the same across all three. The only difference is what your code does when it hits a valid end-state: does it stop (Decision), save to a list (Enumeration), or compare against a high score (Optimization)?


class Main {

    public static void changeArr(int arr[], int i, int val) {
        //base case
        if(i == arr.length) {
            printArr(arr);
            return;
        }

        //recursion (kaam)
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); //fnx call step
        arr[i] = arr[i] - 2; //backtracking step
    }

    public static void printArr(int arr[]) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        //Backtracking on Arrays
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);

        /*
        Time & Space Complexity : O(n)
        Output :-
        1 2 3 4 5 
        -1 0 1 2 3 
        */

       //Find Subsets
       //find and print all subsets of a given string
       // "abc"
       // a, b, c, ab, bc, ac, abc, "" --> empty set (null set) represented using five in math
       //above there are 8 subsets
       //Note :- String length n --> 2^n subsets
    }
}
