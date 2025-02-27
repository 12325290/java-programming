import java.util.Scanner;

public class Multiplication {

    public static void printTable(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        printTable(number);

    }
    
}
