package arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 10};
        System.out.println(findMax(arr));
        System.out.println(findMaxInRange(arr, 3, 4));
    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int findMaxInRange(int[] arr, int index1, int index2) {
        int max = arr[index1];
        for (int i = index1 + 1; i <= index2 ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
