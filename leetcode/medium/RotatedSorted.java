package leetcode.medium;

public class RotatedSorted {
    // 33. Search in Rotated Sorted Array

    // There is an integer array nums sorted in ascending order (with distinct
    // values).

    // Prior to being passed to your function, nums is possibly rotated at an
    // unknown pivot index k (1 <= k < nums.length) such that the resulting array is
    // [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
    // (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3
    // and become [4,5,6,7,0,1,2].

    // Given the array nums after the possible rotation and an integer target,
    // return the index of target if it is in nums, or -1 if it is not in nums.

    // You must write an algorithm with O(log n) runtime complexity.

    public int search(int[] nums, int target) {
        int pivot = getPivot(nums);

        if (nums[pivot] <= target && target <= nums[nums.length - 1]) {
            return binarySearch(nums, pivot, nums.length - 1, target);
        }

        return binarySearch(nums, 0, pivot - 1, target);
    }

    public int getPivot(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= nums[0]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        int left = start;
        int right = end;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
