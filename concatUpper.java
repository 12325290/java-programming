
import java.util.Scanner;

public class concatUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.next();
        String secondName = sc.next();

        String con = firstName.concat(" ").concat(secondName);
        System.out.printf("%S",con);

    }
    
}
