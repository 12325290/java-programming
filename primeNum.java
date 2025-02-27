
// public class primeNum {
//     public static void main(String[] args) {
        
//         int n = 4;
//         if(n<=0 && n<=1)
//         return;

//         for (int i = 2; i <= n; i++) {

//             if(n%2==0)
//             System.out.println("not");
//             else
//             System.out.println("yes");


            
//         }
//     }
    
// }




public class primeNum {
    public static void main(String[] args) {
        
        int n = 5; // Change this value to test different numbers
        
        if (n <= 1) {
            System.out.println("Not a prime number");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i*i<= n; i++) { // Check up to sqrt(n)
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}

