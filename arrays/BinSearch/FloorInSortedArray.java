package arrays.BinSearch;

public class FloorInSortedArray {
    public static void main(String[] args) {

    }
    // Given a sorted array arr[] (with unique elements) and an integer k, find the index (0-based) of the largest element in arr[] that is less than or equal to k. This element is called the "floor" of k. If such an element does not exist, return -1.
    static int findFloor(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] < k) {
                ans = mid;      // Update the floor to mid index.

                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
