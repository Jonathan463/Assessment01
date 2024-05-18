package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static int findSmallestNonOccurring(int[] array) {
        Set<Integer> numbers = new HashSet<>();

        for (int num : array) {
            if (num > 0) {
                numbers.add(num);
            }
        }

        int smallestNonOccurring = 1;
        while (numbers.contains(smallestNonOccurring)) {
            smallestNonOccurring++;
        }

        return smallestNonOccurring;
    }

    //Testing Assessment 1
    public static void main(String[] args) {
        int[] array1 = {1, 3, 6, 4, 1, 2};
        int[] array2 = {5, -1, -3};

        System.out.println("The smallest non-occurring integer in array1 is: " + findSmallestNonOccurring(array1)); // Should print 5
        System.out.println("The smallest non-occurring integer in array2 is: " + findSmallestNonOccurring(array2)); // Should print 1
        }
    }


