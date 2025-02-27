import java.util.*;

public class Oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); // Read elements
        }

        // Store first and last elements
        int first = arr[0];
        int last = arr[size - 1];

        // Shift elements left correctly
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Place last element at the first index
        arr[0] = last;

        // Place first element at the last index (corrected this part)
        arr[size - 1] = first;

        // Print the modified array
        System.out.println("Modified array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}




// check arr isSorted or not

public class Main {
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 50, 225, 1800, 30000};
        System.out.println(isSorted(arr));
    }
}
