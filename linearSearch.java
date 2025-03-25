import java.util.Scanner;

public class linearSearch{

public static  int findValue(int [] arr,int find){
    // boolean found = false;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==find){
            // System.out.println("Element found " + i);
            // found=true;
            return i;
            // break;
        }
    }
   
//     if(!found){
//         System.out.println("elements not found.");
//     }
    return -1;
    }

   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            System.out.print("Enter the elements of the array: ");

            int [] arr = new int[size];
    
            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the element to search: ");

            int find = sc.nextInt();
    
            int result = findValue(arr,find);
            System.out.println(result);

            
    
        
    }
    

}
