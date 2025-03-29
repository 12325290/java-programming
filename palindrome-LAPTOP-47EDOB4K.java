// import java.util.Scanner;

// public class palindrome {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String name = sc.nextLine();
//         sc.close(); 

//         String reversed = "";
//         for (int i = name.length() - 1; i >= 0; i--) {
//             reversed += name.charAt(i);
//         }

//         if (name.equalsIgnoreCase(reversed)) {
//             System.out.println("pali");
//         } else {
//             System.out.println("not");
//         }
//     }
// }




// Reversing a Number as a String)


// class Solution {
//     public boolean isPalindrome(String x) {
//         String rev = ""; // To store the reversed string

//         for (int i = x.length() - 1; i >= 0; i--) {
//             rev += x.charAt(i); // Append characters in reverse order
//         }

//         return x.equalsIgnoreCase(rev); // Compare original and reversed strings
//     }
// }




// (for Checking If an Integer is a Palindrome)


// class Solution {
//     public boolean isPalindrome(int x) {
//         String str = String.valueOf(x); // Convert int to String
//         String rev = new StringBuilder(str).reverse().toString(); // Reverse it
//         return str.equals(rev); // Compare original and reversed values
//     }
// }



import java.util.Scanner;

class palindrome {
    public static boolean pali(int x) {
        String str = String.valueOf(x);
        String sb = new StringBuilder(str).reverse().toString();
        return str.equals(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: "); // Prompt user
        int x = sc.nextInt();
        
        System.out.println("Is Palindrome? " + pali(x)); // Print result
        sc.close();
    }
}
