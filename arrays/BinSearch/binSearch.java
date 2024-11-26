package arrays.BinSearch;

public class binSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;

        System.out.println(binarySearch(arr, x));
    }

    public static int binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            else if (arr[mid] < x) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return -1; // Element not found
    }
}
