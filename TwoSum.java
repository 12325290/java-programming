// Two Sum Problem

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        Arrays.sort(array);
        int left = 0;
        int right = size - 1;
        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                System.out.println("Two sum solution: " + array[left] + ", " + array[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No two sum solution found.");
    }
}

