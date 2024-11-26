package arrays;

import java.util.Arrays;

public class SwapAlternate {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 10 };
        System.out.println(Arrays.toString(arr));
        swapAlternate(arr);
        System.out.println(Arrays.toString(arr));

        int[] array = { 1, 3, 23, 9, 10, 11 };
        System.out.println(Arrays.toString(array));
        swapAlternate(array);
        System.out.println(Arrays.toString(array));
    }

    public static void swapAlternate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            // checking if((i+1) < arr.length) is not required
            // because the loop's condition, ie: (i < arr.length - 1) ensures (i + 1) is always a valid index.
            swap(arr, i, i + 1);
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}