package arrays.BinSearch;

public class TotalOccurence {
    public static void main(String[] args) {
        int[] nums = { 3, 9, 11, 32, 32, 32, 32, 48, 52 };
        System.out.println(totalOccurrences(nums, 32));
    }

    // find the total number of occurrences of an element in a non-decreasing sorted
    // array

    public static int totalOccurrences(int[] arr, int target) {
        int firstOccurrence = position(arr, target, true);
        int lastOccurrence = position(arr, target, false);

        return (lastOccurrence - firstOccurrence + 1);

    }

    public static int position(int[] nums, int x, boolean firstOccurence) {
        int left = 0;
        int right = nums.length - 1;

        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == x) {

                ans = mid;

                if (firstOccurence) {
                    right = mid - 1;
                }

                else {
                    left = mid + 1;
                }
            }

            else if (nums[mid] < x) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
