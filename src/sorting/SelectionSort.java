package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4, 1, 9, 2, 3, 6};
        //time complexity is O(n square)
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            if (smallest != i) {
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }

        for (int j : arr) {
            System.out.print(" " + j);
        }
        //time complexity - O(n ^ 2)
    }


}
