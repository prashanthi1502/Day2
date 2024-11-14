import java.util.Scanner;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the rotated sorted array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input for the target element
        System.out.print("Enter the target element to search: ");
        int target = scanner.nextInt();

        // Find the index of the target element
        int targetIndex = searchTarget(arr, target);

        // Output the result
        if (targetIndex != -1) {
            System.out.println("The target element " + target + " is found at index: " + targetIndex);
        } else {
            System.out.println("The target element " + target + " is not found in the array.");
        }
    }

    // Method to search for the target element in the rotated sorted array
    public static int searchTarget(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If the target is found at mid, return the index
            if (arr[mid] == target) {
                return mid;
            }

            // Determine which part is sorted
            if (arr[left] <= arr[mid]) {
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}