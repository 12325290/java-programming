import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guessing no. : ");
        int num = sc.nextInt();
        int guess;

        do { 
            System.out.print("Please guess the number : ");
            guess= sc.nextInt();
        } while (num != guess);
        System.out.println("You have successfully guessed the number");


    }
    
}
