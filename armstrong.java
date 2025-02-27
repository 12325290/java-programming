
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. : ");

        int num = sc.nextInt();

        int original_num = num;
        int sum = 0;
        int count = String.valueOf(num).length();

        while(num>0){
            int div = num%10;
            sum+= Math.pow(div, count);
            num/=10;
        }

        if((sum==original_num)){
            System.out.println("arm");
        }
        else{
            System.out.println("not");
        }


    }
}
