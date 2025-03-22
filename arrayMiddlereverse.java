import java.util.*;

public class arrayMiddlereverse {

    public static void left(int arr[], int n){
  int temp = arr[0];
  for(int i=1;i<n;i++){
    arr[i-1]=arr[i];
  }
  arr[n-1]=temp;
  }

  public static void left1(int arr[], int n, int d){
  
    for(int i=0;i<d;i++){
      left(arr,n);
    }
    System.out.println(Arrays.toString(arr));
     
  }


    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];

    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
      
  left1(arr,n,d);

    }

}
