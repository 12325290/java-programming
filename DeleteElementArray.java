import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter element to delete: ");
        int elementToDelete = sc.nextInt();
        
        int[] newArr = deleteElement(arr, elementToDelete);
        
        System.out.print("New Array: ");
        printArray(newArr);
        
        sc.close();
    }

    public static int[] deleteElement(int[] arr, int element) {
        int count = 0;
        for (int num : arr) {
            if (num == element) {
                count++;
            }
        }
        
        if (count == 0) {
            return arr; // Return original array if element not found
        }
        
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int num : arr) {
            if (num != element) {
                newArr[index++] = num;
            }
        }
        return newArr;
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
