import  java.util.*;

public class recursionFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        long fact = (factorial(num));
        System.out.println(fact);

    }


    public static long factorial(int num){
        if(num==1){
            return 1;
        }
    
        return  num* factorial(num-1);
    }
}


