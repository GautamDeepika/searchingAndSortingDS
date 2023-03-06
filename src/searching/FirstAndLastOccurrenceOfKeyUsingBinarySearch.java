package searching;

public class FirstAndLastOccurrenceOfKeyUsingBinarySearch {

    public static int firstOccur(int arr[], int size, int key) {
        int s = 0, e = size - 1;
        int mid = s + (e - s) / 2;
        int ans = -1;

        while (s <= e) {
            if (key == arr[mid]) {
                ans = mid;
                e = mid - 1;
            } else if (key > arr[mid]) {
                s = mid + 1;
            } else if (key < arr[mid]) {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }

    public static int lastOccur(int arr[], int size, int key) {
        int s = 0, e = size - 1;
        int mid = s + (e - s) / 2;
        int ans = -1;

        while (s <= e) {
            if (key == arr[mid]) {
                ans = mid;
                s = mid + 1;
            } else if (key > arr[mid]) {
                s = mid + 1;
            } else if (key < arr[mid]) {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 3, 5};

        int firstOcc = firstOccur(arr, arr.length, 5);
        int lastOcc = lastOccur(arr, arr.length, 5);
        System.out.println("First occurrence of 3 is at " + firstOcc +" index");
        System.out.println("First occurrence of 3 is at " + lastOcc +" index");
    }
}
