import java.util.Arrays;
import java.util.Scanner;

public class removingDuplicateElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        int j = 0;
        for (int i = 1; i < size; i++) {
            if (array[i] != array[j]) {
                j++;
                array[j] = array[i];
            }
        }

        int[] result = Arrays.copyOfRange(array, 0, j + 1);
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}

