public class PivotElement {
    public static void main(String[] args) {
        int[] nums = { 3, 8, 10, 17, 1 };
        System.out.println("Pivot element is at index: " + pivotElement(nums));
    }

    // pivot element in a sorted and rotated array
    public static int pivotElement(int[] nums) {
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
}
