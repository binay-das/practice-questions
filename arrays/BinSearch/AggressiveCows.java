package arrays.BinSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AggressiveCows {
    public static void main(String[] args) {
        ArrayList<Integer> stalls = new ArrayList<>(Arrays.asList(0,3,4,7,10,9));
        int k = 4;
        System.out.println(getDistance(stalls, k));
    }

    // max possible min distance between 2 cows
    public static int getDistance(ArrayList<Integer> stalls, int k) {
        Collections.sort(stalls);

        int start = 1;
        int end = stalls.get(stalls.size() - 1) - stalls.get(0);
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(stalls, k, mid)) {
                ans = mid;

                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static boolean isPossible(ArrayList<Integer> stalls, int k, int minAllowedDist) {
        int cow = 1;
        int lastPos = stalls.get(0);

        for (int i = 1; i < stalls.size(); i++) {
            if (stalls.get(i) - lastPos >= minAllowedDist) {
                cow++;

                lastPos = stalls.get(i);
            }

            if (cow == k) {
                return true;
            }
        }

        return false;
    }
}
