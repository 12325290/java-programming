
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. : ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for(int i=2;i<num;i++){
            int next = a+b;
            System.out.println(next);

            a=b;
            b=next;
        }
    }
    
}
