import java.util.Scanner;

public class Question4  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();
        
        String longest =" ";
        for (String word : sentence.split(" ")) {
            if (word.length() > longest.length()) longest = word;
        }
        
        System.out.println(longest);
    }
}

