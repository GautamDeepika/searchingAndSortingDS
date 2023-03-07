package searching;

//
public class BookAllocationProblemUsingBS {

    public static boolean isPossibleSolution(int[] arr, int size, int noOfStu, int mid) {
        int studentCount = 1;
        int pageSum = 0;
        for (int i = 0; i < size; i++) {
            if (pageSum + arr[i] <= mid) {
                pageSum += arr[i];
            } else {
                studentCount++;
                if (studentCount > noOfStu || arr[i] > mid) {
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }

    public static int allocateBooks(int[] arr, int size, int noOfStudent) {
        int start = 0;
        int arraySum = 0;

        for (int i = 0; i < size; i++) {
            arraySum += arr[i];
        }
        int end = arraySum;
        int ans = -1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (isPossibleSolution(arr, size, noOfStudent, mid)) {
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
        int[] arr = {10, 20, 30, 40};
        int result = allocateBooks(arr, arr.length, 2);
        System.out.println("Ist student allocation page sum is " + result);
    }
}
