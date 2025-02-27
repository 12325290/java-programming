import java.util.Scanner;

public class factorial {
    // Function to calculate factorial
    public static long Factorial(int num) {
        long fact = 1; // Using long to handle large numbers
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Calling the function and printing the result
        System.out.println("Factorial of " + number + " is: " + Factorial(number));
        
        scanner.close();
    }
}
