import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Left rotate the array by one position
        leftRotateByOne(arr);

        // Output the rotated array
        System.out.print("Array after left rotation by one position: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Method to left rotate an array by one position
    public static void leftRotateByOne(int[] arr) {
        int firstElement = arr[0];
        int n = arr.length;

        // Shift all elements to the left by one position
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        // Move the first element to the end of the array
        arr[n - 1] = firstElement;
    }
}