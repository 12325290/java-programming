import java.util.Scanner;

class reverseArray1 {
  
  public static void rev(int [] arr){
    for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    
  }
  
  public static void swap(int [] arr, int i, int j){
    int temp = arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
    
  
  }
  
  
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int i=0, j=n-1;
        
        // for (int i = 0; i < arr.length; i++){
        while(i<j){
          // int temp = arr[i];
          // arr[i]=arr[j];
          // arr[j]=temp;
          swap(arr,i,j);
          i++;
          j--;
        }
          
        // }
        
        rev(arr);
        
            
       
        
    }
}