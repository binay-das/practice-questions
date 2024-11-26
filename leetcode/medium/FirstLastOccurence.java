package leetcode.medium;

import java.util.Arrays;

public class FirstLastOccurence {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    // 34. Find First and Last Position of Element in Sorted Array

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };

        ans[0] = position(nums, target, true);
        ans[1] = position(nums, target, false);

        return ans;
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
                } else {
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
