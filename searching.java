
import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int [] arr = {3,5,7,2,7,43,67,87};
        System.out.println("Enter number you want to search : ");
        int num = sc.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.println("number is Found");
        }else{
            System.out.println("not found");
        }

    }

    public static boolean isFound(int []arr, int num){
        int index = 0;
       
            while(arr[index] < arr.length){
                if(arr[index]  == num){
                    return true;
                }
                index++;
            }
            return false;
        }
    }
    

