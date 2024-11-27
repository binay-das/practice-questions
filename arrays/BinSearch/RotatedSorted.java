public class RotatedSorted {
    public static void main(String[] args) {
        int[] nums = {7,8,1,3,5};
        System.out.println(rotatedSortedArray(nums, 3));
    }

    // find an element in a sorted and rotated array in O(log n) time complexity
    public static int rotatedSortedArray(int[] nums, int x) {
        int pivot = getPivot(nums);

        if (nums[pivot] <= x && x <= nums[nums.length - 1]) {
            return binarySearch(nums, pivot, nums.length - 1, x);
        }

        return binarySearch(nums, 0, pivot - 1, x);
    }

    public static int getPivot (int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= nums[0]) {
                left = mid + 1;
            }
            
            else {
                right = mid;
            }
        }

        return left;
    }


    public static int binarySearch(int[] nums, int start, int end, int x) {
        int left = start;
        int right = end;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == x) {
                return mid;
            }

            else if (nums[mid] < x) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
