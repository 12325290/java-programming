
import java.util.Scanner;


    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter name :");
//         String name = sc.nextLine();
//         StringBuilder sb = new StringBuilder(name);
//         // System.out.println(sb.charAt(0));   // charAt()
//         // sb.setCharAt(0,'A');   // setCharAt(pos,replace with)
//         // sb.insert(2, 'n');     // insert
//         // sb.delete(2,4);  // delete
       
//         System.out.println(sb);

//     }
// }

// public class stringBuilders {
    
//     public static void main(String[] args) {

//         StringBuilder sb = new StringBuilder("h");
//         sb.append("e");
//         sb.append("l");
//         sb.append("l");
//         sb.append("0");
      
//         System.out.println(sb);
//         System.out.println(sb.length());

//     }
// }



// public class stringBuilders {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a word: ");
//         String input = scanner.next(); // Take user input
//         scanner.close();

//         StringBuilder sb = new StringBuilder(); // Initialize StringBuilder
        
//         for (char ch : input.toCharArray()) {
//             sb.append(ch); // Append each character
//         }

//         System.out.println(sb);
//         System.out.println("Length: " + sb.length());
//     }
// }




// public class stringBuilder {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of characters: ");
//         int n = scanner.nextInt();  // Take the number of characters
//         char[] arr = new char[n]; 

//         System.out.println("Enter the characters one by one:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.next().charAt(0);  // Read each character
//         }
//         scanner.close();

//         StringBuilder sb = new StringBuilder();
//         for (char ch : arr) {
//             sb.append(ch);  // Append each character
//         }

//         System.out.println(sb);
//         System.out.println("Length: " + sb.length());
//     }
// }


public class stringBuilder{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string :");
        String name = sc.nextLine();

        StringBuilder sb = new StringBuilder(name);

        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        
        System.out.println(sb);

    }
}