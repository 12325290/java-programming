import java.util.Scanner;

class Solution {
    public int search(int[] arr, int find) {
        int left = 0, right = arr.length - 1;

        while (left <= right) { // Loop until search space is exhausted
            int mid = left + (right - left) / 2; // Prevent overflow

            if (arr[mid] == find) {
                return mid; // Element found at index mid
            }

            if (arr[mid] < find) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Element not found
    }
}

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the sorted array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int find = sc.nextInt();

        Solution sol = new Solution();
        int result = sol.search(arr, find);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
