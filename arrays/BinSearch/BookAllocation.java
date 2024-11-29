package arrays.BinSearch;

public class BookAllocation {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int k = 2;

        System.out.println(findPages(arr, k));
    }

    // Allocate Minimum Pages
    // You are given an array arr[] of integers, where each element arr[i] represents the number of pages in the ith book. You also have an integer k representing the number of students. The task is to allocate books to each student such that:

    //Each student receives atleast one book.
    //Each student is assigned a contiguous sequence of books.
    //No book is assigned to more than one student.

    public static int findPages(int[] arr, int k) {
        int left = 0;
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }

        int right = sum;

        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (ifPossible(arr, k, mid)) {
                ans = mid;

                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return ans;
    }

    public static boolean ifPossible(int[] arr, int k, int mid) {
        int studentCount = 1;
        int pageSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pageSum + arr[i] <= mid) {
                pageSum += arr[i];
            }
            else {
                studentCount++;

                if (studentCount > k || arr[i] > mid) {
                    return false;
                }

                pageSum = arr[i];
            }
        }

        return true;
    }
}
