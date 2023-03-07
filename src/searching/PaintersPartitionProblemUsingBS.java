package searching;

public class PaintersPartitionProblemUsingBS {

    public static boolean isPossibleSolution(int[] arr, int size, int noOfPainter, int mid) {
        int paintersCount = 1;
        int painterPartSum = 0;
        for (int i = 0; i < size; i++) {
            if (painterPartSum + arr[i] <= mid) {
                painterPartSum += arr[i];
            } else {
                paintersCount++;
                if (paintersCount > noOfPainter || arr[i] > mid) {
                    return false;
                }
                painterPartSum = arr[i];
            }
        }
        return true;
    }

    public static int partitionOfPainting(int[] arr, int size, int noOfPainter) {
        int start = 0;
        int arraySum = 0;

        for (int i = 0; i < size; i++) {
            arraySum += arr[i];
        }
        int end = arraySum;
        int ans = -1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (isPossibleSolution(arr, arr.length, noOfPainter, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5};
        System.out.println("First Partition sum for Painter One is: " + partitionOfPainting(arr, arr.length, 2));
    }
}
