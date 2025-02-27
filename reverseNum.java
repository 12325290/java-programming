
import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=num-1;i>=0;i--)
        {
            System.out.println(i);
        }
    }
}
