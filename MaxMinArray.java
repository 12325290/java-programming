import java.util.Scanner;

// public class MaxMinArray {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();
        
//         int[] arr = new int[size];

//         System.out.println("Enter elements:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int max = findMax(arr);
//         int min = findMin(arr);

//         System.out.println("MAX: " + max);
//         System.out.println("MIN: " + min);

//         sc.close();
//     }

//     // Function to find the maximum value in the array
//     public static int findMax(int[] arr) {
//         int max = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     // Function to find the minimum value in the array
//     public static int findMin(int[] arr) {
//         int min = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         return min;
//     }
// }


// import java.util.Scanner;

// public class MaxMinArray {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();
        
//         System.out.println("Enter elements :");
//         int [] arr = new int[size];
        
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }

//         int max = arr[0];
//         int min = arr[0];

//         for(int i=1;i<size;i++){

//             if(arr[i] > max){
//                 max=arr[i];
//             }
//             if(arr[i] < min){
//                 min=arr[i];
//             }

//         }
//         System.out.println("MAX : " +max);
//         System.out.println("MIN : " +min);
//     }
    
// }








class MaxMinArray{

public static void main(String []args){

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int [] arr = new int[n];

    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    int max = max(arr);
    int min = min(arr);

    System.out.println(max);
    System.out.println(min);

}

public static int max(int []arr){
    int max =arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
}

public static int min(int []arr){
    int min =arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    return min;

}
}




