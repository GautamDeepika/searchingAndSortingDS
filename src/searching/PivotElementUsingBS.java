package searching;

public class PivotElementUsingBS {

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

    public static void main(String[] args) {
        int arr[] = {3, 8, 10, 17, 1};
        System.out.println("Pivot element is : " + pivotElement(arr, arr.length));
    }
}
