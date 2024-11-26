package arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5,2};
        System.out.println(findDuplicate(arr));
    }

    // array of n size containing elements from 1 to n-1, appearing at least once, on elements apprears twice, find the duplicate element  

    public static int findDuplicate(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        for (int i = 1; i < nums.length; i++) {
            ans ^= i;
        }

        return ans;
    }
}
