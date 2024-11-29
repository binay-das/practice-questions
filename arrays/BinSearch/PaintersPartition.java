package arrays.BinSearch;

import java.util.ArrayList;

public class PaintersPartition {
    public static void main(String[] args) {
//        int[] boards = {2, 1, 5, 6, 2, 3};
        int[] boards = {11, 6};
        int k = 6;

        ArrayList<Integer> boardList = new ArrayList<>();
        for (int board : boards) {
            boardList.add(board);
        }

        System.out.println(paintersPartition(boardList, k));
    }

    // Given an array/list of length ‘n’, where the array/list represents the boards and each element of the given array/list represents the length of each board. Some ‘k’ numbers of painters are available to paint these boards. Consider that each unit of a board takes 1 unit of time to paint.
    //You are supposed to return the area of the minimum time to get this job done of painting all the ‘n’ boards under a constraint that any painter will only paint the continuous sections of boards.
    public static int paintersPartition(ArrayList<Integer> boards, int k) {
        int left = 0;
        int total = 0;

        for (int i = 0; i < boards.size(); i++) {
            total += boards.get(i);
        }

        int right = total;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isPossible(boards, k, mid)) {
                ans = mid;

                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return ans;

    }

    public static boolean isPossible(ArrayList<Integer> boards, int k, int mid) {
        int painterCount  = 1;
        int total = 0;

        for (int i = 0; i < boards.size(); i++) {
            if (total + boards.get(i) <= mid) {
                total += boards.get(i);
            }

            else {
                painterCount ++;

                if (painterCount  > k || boards.get(i) > mid) {
                    return false;
                }

                total = boards.get(i);
            }
        }

        return true;
    }
}
