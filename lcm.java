
import java.util.Scanner;

public class lcm{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = 0;

        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0)
                temp=i;
        
    }
    System.out.println(temp);

    int lcm = a*b / temp;
    System.out.println(lcm);

    }
    
}
