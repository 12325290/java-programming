import java.util.Scanner;

class passwordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to set your password\n");
        String password;
        do{
            System.out.print("Enter your password : ");
            password = sc.nextLine();
        }while(!isValidPassword(password));
        {
            System.out.println("Thanks for entering a valid password");
        }
    }
    
    public static boolean isValidPassword(String password){
        return password.length() > 6;
    }
}
