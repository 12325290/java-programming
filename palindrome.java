import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        sc.close(); 

        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }

        if (name.equalsIgnoreCase(reversed)) {
            System.out.println("pali");
        } else {
            System.out.println("not");
        }
    }
}
