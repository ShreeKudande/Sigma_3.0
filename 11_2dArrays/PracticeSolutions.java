public class PracticeSolutions {

    public static int countKey(int array[][], int key) {
        int count = 0;

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                if(array[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int rowSum(int array[][], int rowNum) {
        int sum = 0;

        for(int i = 0; i < array[0].length; i++) {
            sum += array[rowNum][i];
        }

        return sum;
    }

    public static void transposeArray(int array[][]) {
        int[][] transpose = new int[3][3];
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                transpose[j][i] = array[i][j];
            }
        }
        
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
            System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        //Q1
        // int[][] array = {
        //     {4, 7, 8},
        //     {8, 8, 7}
        // };

        // System.out.print(countKey(array, 8));

        //Q2
        // int[][] array = {
        //     {1, 4, 9},
        //     {11, 4, 3},
        //     {2, 2, 3}
        // };

        // System.out.print(rowSum(array, 1));

        //Q3
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        transposeArray(array);
    }
}