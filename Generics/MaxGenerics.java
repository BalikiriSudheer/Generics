package com.Generics;

public class MaxGenerics {

        public static Integer findMax(Integer num1, Integer num2, Integer num3) {
            Integer max = num1;

            if (num2.compareTo(max) > 0) {
                max = num2;
            }

            if (num3.compareTo(max) > 0) {
                max = num3;
            }

            return max;
        }

        public static void main(String[] args) {
            // Test Case 1: Max at 1st position
            Integer result1 = findMax(10, 5, 8);
            System.out.println("Test Case 1: Max at 1st position - Max: " + result1);

            // Test Case 2: Max at 2nd position
            Integer result2 = findMax(3, 12, 7);
            System.out.println("Test Case 2: Max at 2nd position - Max: " + result2);

            // Test Case 3: Max at 3rd position
            Integer result3 = findMax(4, 6, 15);
            System.out.println("Test Case 3: Max at 3rd position - Max: " + result3);
        }
    }


