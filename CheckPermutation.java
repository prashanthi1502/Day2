import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input for the second array
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Check if the arrays are permutations of each other
        if (arePermutations(arr1, arr2)) {
            System.out.println("The arrays are permutations of each other.");
        } else {
            System.out.println("The arrays are not permutations of each other.");
        }
    }

    // Method to check if two arrays are permutations of each other
    public static boolean arePermutations(int[] arr1, int[] arr2) {
        // If the arrays have different lengths, they cannot be permutations
        if (arr1.length != arr2.length) {
            return false;
        }

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}