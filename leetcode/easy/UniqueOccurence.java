package leetcode.easy;

import java.util.Arrays;

public class UniqueOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
    }

    // Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
    public static boolean uniqueOccurrences(int[] arr) {
        if (arr == null || arr.length == 0) {
            return true; // Empty array trivially satisfies the condition
        }

        // Sort the array
        Arrays.sort(arr);

        // Count occurrences and store them in a list
        int[] counts = new int[arr.length]; // To store the count of each element's occurrences
        int countIndex = 0;  // To track the index for storing counts
        int prevCount = 1;  // prevCount is initialized to 1 because the first element will always appear at least once.
        int prevValue = arr[0];  // because we start comparing from the second element onward.

        // Count occurrences of each number in the sorted array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == prevValue) {
                prevCount++;    // // Increment count if the current element is the same as the previous one
            } else {
                counts[countIndex] = prevCount;     // Store the count for the previous value
                countIndex++;   // Move to the next index in counts
                prevValue = arr[i];     // Update prevValue to the current element
                prevCount = 1;  // Reset count for the new element
            }
        }
        // Store the count for the last element
        counts[countIndex] = prevCount;
        countIndex++;

        // Check if all counts are unique
        for (int i = 0; i < countIndex; i++) {
            for (int j = i + 1; j < countIndex; j++) {
                if (counts[i] == counts[j]) {
                    return false;
                }
            }
        }

        return true; // All counts are unique
    }
}
