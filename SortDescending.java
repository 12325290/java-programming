import java.util.Arrays;

public class SortDescending {
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // Swap if next element is greater
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        bubbleSortDescending(arr);
        System.out.println("Sorted in Descending Order: " + Arrays.toString(arr));
    }
}
