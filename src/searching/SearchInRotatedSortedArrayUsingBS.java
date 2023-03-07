package searching;

public class SearchInRotatedSortedArrayUsingBS {

    static int pivotElement(int arr[], int size) {
        int s = 0, e = size - 1;
        int mid = s + (e - s) / 2;

        while (s < e) {
            if (arr[mid] >= arr[0]) { //exist in first line
                s = mid + 1;
            } else {
                e = mid;
            }
            mid = s + (e - s) / 2;
        }
        return s;
    }

    public static int binarySearch(int arr[], int s, int e, int key) {
        int start = s;
        int end = e;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (arr[mid] == key) {
                return mid;
            }
            //go to right part
            if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            mid = start + (end - start) / 2;
        }
        return -1;
    }

    public static int findPosition(int arr[], int size, int key) {
        int pivot = pivotElement(arr, size);

        if (key >= arr[pivot] && key <= arr[size - 1]) {
            //Bs on second line
            return binarySearch(arr, pivot, size - 1, key);
        } else {
            //Bs on first line
            return binarySearch(arr, 0, pivot - 1, key);
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 9, 1, 2, 3};
        int indexOfKey = findPosition(arr, arr.length, 2);
        if (indexOfKey == -1) {
            System.out.println("Element is absent");
        } else {
            System.out.println("Key is present at " + indexOfKey + " index");
        }
    }
}
