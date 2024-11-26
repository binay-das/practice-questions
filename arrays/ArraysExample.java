package arrays;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr = new int[4];
    // compile-time      // run-time
    // may or may not be continuous, depends on the JVM

        System.out.println(Arrays.toString(arr));

        int[][] array = {
            {3, 6, 4},
            {1, 2, 9, 11, 15},
            {4, 6, 7, 4}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
