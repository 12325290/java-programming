
import java.util.Arrays;
import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int left = 0;
        int right = size - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed array: " + Arrays.toString(array));
    }
}





// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 7};

//         for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//         }

//         // Print the reversed array
//         System.out.println(Arrays.toString(arr));
//     }
// }


