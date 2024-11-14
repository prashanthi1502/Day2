import java.util.Scanner;

public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the rotated sorted array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] num = new int[n];

        System.out.println("Enter " + n + " integers (rotated sorted):");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        // Finding the minimum element
        int minElement = findMin(num);
        System.out.println("The minimum element in the rotated sorted array is: " + minElement);
    }

    public static int findMin(int[] num) {
        int left = 0;
        int right = num.length - 1;

        // If the array is not rotated
        if (num[left] < num[right]) {
            return num[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid element is greater than rightmost element
            if (num[mid] > num[right]) {
                // Minimum must be in the right half
                left = mid + 1;
            } else {

                right = mid;
            }
        }
        return num[left];
    }
}