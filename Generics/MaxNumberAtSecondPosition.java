package com.Generics;

public class MaxNumberAtSecondPosition {
    public static void main(String[] args) {
        // Example test data
        int[] numbers = {3, 8, 5, 2, 7};

        // Call the function and print the result
        int result = getMaxNumberAtSecondPosition(numbers);
        System.out.println("Result: " + result);
    }

    static int getMaxNumberAtSecondPosition(int[] arr) {
        if (arr.length >= 2) {
            // Find the maximum number in the array
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            // Check if the maximum number is at the second position
            if (max == arr[1]) {
                return max;
            } else {
                System.out.println("Max number is not at the second position.");
                // You can handle the case when the maximum number is not at the second position.
            }
        } else {
            System.out.println("Array should have at least 2 elements.");
            // You can handle the case when the array doesn't have enough elements.
        }

        // Return a default value or handle the case when the conditions are not met
        return -1;
    }
    
}
