// Finding the Missing Number in an Array

import java.util.Scanner;


class findingMissingValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = (size + 1) * (size + 2) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        System.out.println("Missing number: " + (sum - actualSum));
    }
}
