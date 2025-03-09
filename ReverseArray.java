

import java.util.Scanner;

class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Reversed Array:");
        reversee(arr);
        
        sc.close();
    }

    public static void reversee(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}



