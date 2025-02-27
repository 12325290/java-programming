
import java.util.Scanner;

public class sumOf_Integer {



    public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int display = sumOfDigits(num);
    System.out.println(display);

  }   

  public static int sumOfDigits(int num){
    int sum = 0;
    while(num>0){
      sum=sum+num%10;
      num/=10;
    }
    return sum;
  }
}
