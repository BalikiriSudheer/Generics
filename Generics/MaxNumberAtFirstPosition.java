package com.Generics;

public class MaxNumberAtFirstPosition {

        public static void main(String[] args) {
            // Test data
            int[] testData = {5, 2, 8, 3, 1};

            // Ensure max number is at the first position
            ensureMaxAtFirstPosition(testData);

            // Print the result
            System.out.println("Max number at first position: " + testData[0]);
        }

        // Method to ensure max number is at the first position
        private static void ensureMaxAtFirstPosition(int[] array) {
            if (array == null || array.length == 0) {
                System.out.println("Array is empty");
                return;
            }

            int maxIndex = 0;

            // Find the index of the maximum number
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }

            // Swap the maximum number with the number at the first position
            int temp = array[0];
            array[0] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }


