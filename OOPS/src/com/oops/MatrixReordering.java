package com.oops;
public class MatrixReordering {
    public static void main(String[] args) {
        int[] inputArray = {3, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] outputArray = rearrangeArray(inputArray);

        // Print the output array
        for (int num : outputArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] rearrangeArray(int[] inputArray) {
        int n = inputArray.length;
        int[] outputArray = new int[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Even index
                outputArray[i] = inputArray[i / 2];
            } else {
                // Odd index
                outputArray[i] = inputArray[n / 2 + i / 2];
            }
        }

        return outputArray;
    }
}