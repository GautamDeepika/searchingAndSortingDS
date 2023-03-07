package searching;

import java.util.Arrays;

import static java.lang.Math.max;

public class AggressiveCowsProblemTofindMaxDistanceUsingBS {

    public static boolean isPossibleSolution(int[] arr, int noOfCows, int mid) {
        int cowCount = 1;
        int firstPosition = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - firstPosition >= mid) {
                cowCount++;
                if (cowCount == noOfCows) {
                    return true;
                }
                firstPosition = arr[i];
            }
        }
        return false;
    }

    public static int agressiveCows(int[] arrOfStalls, int noOfCows) {
        Arrays.sort(arrOfStalls);
        int start = 0;
        int maximum = -1;

        for (int i = 0; i < arrOfStalls.length; i++) {
            maximum = max(maximum, arrOfStalls[i]);
        }
        int end = maximum;
        int ans = -1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (isPossibleSolution(arrOfStalls, noOfCows, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

}
