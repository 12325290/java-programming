import java.util.*;

class PrimeFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the prime checker : ");
        System.out.print("Enter your no. : ");
        int num = sc.nextInt();

        boolean isPrime = isPrime(num);
        // System.out.println(isPrime);
        System.out.println("Your no. is " + (isPrime ? "prime" : "not prime"));

    }

    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num % i == 0){
                return  false;
            }
        }
        return true;
    }
    
}
