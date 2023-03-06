package searching;

public class BinarySearch {

    public static int binarySearch(int arr[], int size, int key) {
        int start = 0;
        int end = size - 1;
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

    public static void main(String[] args) {
        int array[] = {3, 8, 11, 14, 16};

        int index = binarySearch(array, array.length, 20);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is found at index: " + index);
        }
        System.out.println("complexity of binary search is : O(log n)");

    }
}
