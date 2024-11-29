package leetcode.hard;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }
    
    // 410. Split Array Largest Sum
//    Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
//    Return the minimized largest sum of the split.
//    A subarray is a contiguous part of the array.
    public static int splitArray(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        for (int i: nums) {
            sum += i;
        }

        int right = sum;

        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(isPossible(nums, k, mid)) {
                ans = mid;

                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return ans;
    }

    public static boolean isPossible(int[] nums, int k, int mid) {
        int studentCount = 1;   // Start with the first student
        int pageSum = 0;    // Pages assigned to the current student

        for (int i = 0; i < nums.length; i++) {
            if (pageSum + nums[i] <= mid) {
                pageSum += nums[i];     // Add the book to the current student
            }
            else {
                studentCount++;      // Assign to a new student
                if (studentCount > k || nums[i] > mid) {
                    return false;       // More students needed or book too large for current mid
                }
                pageSum = nums[i];      // Start new student with the current book
            }
        }

        return true;
    }
}
