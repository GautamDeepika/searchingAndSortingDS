package searching;

public class PeakIndexInMountainArrayUsingBS {

    public static int peakIndex(int arr[]) {
        int s = 0, e = arr.length - 1;
        int mid = s + (e - s) / 2;

        while (s < e) {
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
            mid = s + (e - s) / 2;
        }
        return s;
//        return e;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 1};

        int peakElement = peakIndex(arr);
        System.out.println("Peak element of mountain array is: " + peakElement);
    }

}
