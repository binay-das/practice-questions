package arrays.BinSearch;

public class NthRoot {
    public static void main(String[] args) {

    }

    // You are given 2 numbers n and m, the task is to find n√m (nth root of m). If the root is not integer then returns -1.
    public int nthRoot(int n, int m) {
        int start = 1;
        int end = m;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= mid;

                if (result > m) {
                    break;
                }
            }

            if (result == mid) {
                return mid;
            }
            else if (result < mid) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }

        return -1;
    }

}
