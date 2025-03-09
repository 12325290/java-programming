
import java.util.Scanner;

class OccurenceArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();
        System.out.print("Enter the number to find occurrences: ");
        int num = sc.nextInt();
        System.out.println("Enter elements :");
        int [] arr = new int[size];
        
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int occur = noOfOccurence(arr, num);
        System.out.println("Number " + num + " occurs " + occur + " times in the array.");

    }

    public static int noOfOccurence(int []arr, int num){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }
        }
        return  count;
    }
}
