
import java.util.Scanner;

class sumAvgArray {

    public static int calSum(int []arr){
        int sum=0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }

    public static double calAvg(int sum, int n){
        return (double) sum/n;
    }
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter elements in arr : ");
        int []arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();

        }

        int sum = calSum(arr);
        double avg = calAvg(sum, size);

        System.out.println("Sum : " +sum);
        System.out.println("Average : " + avg);

    }
    
}
