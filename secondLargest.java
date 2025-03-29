public class secondLargest{

    public static void main(String []args){
       int [] arr = {12,35,67,5,7,86};
       int max=arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
       }
            System.out.println(max);
            
       int max1=arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]>max1 & arr[i]!=max){
               max1=arr[i];
           }
       }
                    System.out.println(max1);

    }

}



//////////////////////////////////
/// 
/// 



// import java.util.Arrays;
// import java.util.Scanner;

// public class SecondLargest {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter array size: ");
//         int size = scanner.nextInt();
//         int[] array = new int[size];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < size; i++) {
//             array[i] = scanner.nextInt();
//         }

//         Arrays.sort(array);
//         System.out.println("Second largest element: " + array[size - 2]);
//     }
// }