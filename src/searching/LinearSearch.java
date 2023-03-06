package searching;

public class LinearSearch {

    public static int linearSearch(int arr[], int x) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    //recursive approach
    public static int linearSearch(int arr[], int size, int key) {
        if (size == 0) {
            return -1;
        } else if (arr[size - 1] == key) {
            return size - 1;
        } else {
            return linearSearch(arr, size - 1, key);
        }
    }

    public static void main(String[] args) {
        int array[] = {2, 5, 1, 3, 4, 7, 6, 45};
        int number = 45;
        int result = linearSearch(array, number);
        int resultFromRecursiveApproach = linearSearch(array, array.length, number);
        if (result == -1)
            System.out.println("Number is not found");
        else
            System.out.println("Number is found at " + result + " index");
        System.out.println("Time Complexity: O(N) and Space Complexity: O(1).");
        System.out.println("-----------------------Recursive Approach---------------------------");
        if (resultFromRecursiveApproach == -1)
            System.out.println("Number is not found");
        else
            System.out.println("Number is found at " + resultFromRecursiveApproach + " index");
        System.out.println("Time Complexity: O(N) and Space Complexity: O(N).");
    }

    /*
    Advantages of Linear Search:
Linear search is simple to implement and easy to understand.
Linear search can be used irrespective of whether the array is sorted or not. It can be used on arrays of any data type.
Does not require any additional memory.
It is a well suited algorithm for small datasets.
Drawbacks of Linear Search:
Linear search has a time complexity of O(n), which in turn makes it slow for large datasets.
Not suitable for large array.
Linear search can be less efficient than other algorithms, such as hash tables.
When to use Linear Search:
When we are dealing with a small dataset.
When you need to find an exact value.
When you are searching a dataset stored in contiguous memory.
When you want to implement a simple algorithm.
Summary:
Linear search is a simple and flexible algorithm for finding whether an element is present within an array.
It sequentially examines each element of the array.
 The time complexity of linear search is O(n).
It is used for searching databases, lists, and arrays.
     */
}
