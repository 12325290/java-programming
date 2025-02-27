import java.util.Scanner;

public class Question5{
    public static boolean isRotation(String S1, String S2) {
        return S1.length() == S2.length() && (S1 + S1).contains(S2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input in the correct order
        System.out.print("Enter first string (S1): ");
        String S1 = scanner.nextLine();  // First input for S1

        System.out.print("Enter second string (S2): ");
        String S2 = scanner.nextLine();  // Second input for S2

        // Output result
        System.out.println(isRotation(S1, S2));

        scanner.close();
    }
}
