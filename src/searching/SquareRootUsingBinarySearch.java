package searching;

import java.util.Scanner;

public class SquareRootUsingBinarySearch {

    public static int binarySearch(int number) {
        int s = 0, e = number;
        int mid = s + (e - s) / 2;
        int ans = -1;

        while (s <= e) {
            int square = mid * mid;
            if (square == number) {
                return mid;
            }
            if (square < number) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }

    public static int sqrt(int num) {
        return binarySearch(num);
    }

    public static double morePrecision(int num, int precision, int tempSol) {
        double factor = 1;
        double ans = tempSol;

        for (int i = 0; i < precision; i++) {
            factor = factor / 10;

            for (double j = ans; j * j < num; j = j + factor) {
                ans = j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Please enter number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tempSol = sqrt(n);
        double sqrt = morePrecision(n, 3, tempSol);
        System.out.println(sqrt);

    }
}
