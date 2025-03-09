
import java.util.*;

public class switchExample { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-6): ");
        int day = sc.nextInt();  

        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            // case 6 ,7-> "Saturday";
            default -> "Invalid day";  
        };

        System.out.println(dayName);
        sc.close();  
    }
}
