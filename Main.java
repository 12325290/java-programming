public class Question3 {
    
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a double value: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter a single character: ");
        char num3 = sc.next().charAt(0);

        System.out.print("Enter a boolean value (true/false): ");
        boolean num4 = sc.nextBoolean();

        System.out.println("Integer value: " + num1);
        System.out.println("Double value: " + num2);
        System.out.println("Character value: " + num3);
        System.out.println("Boolean value: " + num4);
        // Perform type conversion
        double convertedDouble = num1; // Implicit conversion from int to double
        int convertedInt = num3;     // Implicit conversion from char to int (ASCII value)

        // Print values after conversion
        System.out.println("\nValues After Type Conversion:");
        System.out.println("Integer converted to double: " + convertedDouble);
        System.out.println("Character converted to integer (ASCII value): " + convertedInt);
    }
}


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int number = sc.nextInt();
        
//         String result;
//         switch (number / 10) { 
//             case 0: 
//                 result = "LOW";
//                 break;
//             case 1: 
//                 result = "MEDIUM";
//                 break;
//             case 2: 
//                 result = "HIGH";
//                 break;
//                 default:
//                 result = "Out of Range";
//         }
//         System.out.println(result);
//     }
// }


// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter your number: ");
// int number = scanner.nextInt();
// if(number>=0 && number<=10){
// number =1;
// }else if(number>=11 && number <=20){
// number=2;
// }else if(number>=21 && number<=30){
// number=3;
// }
// switch(number){
// case 1:
// System.out.println("LOW");
// break;
// case 2:
// System.out.println("MEDIUM");
// break;
// case 3:
// System.out.println("HIGH");
// break;
// default:
// System.out.println("out of range");
// }


/*A retail store offers discounts on the total amount of items in a shopping cart based on specific conditions. You need to write a program that calculates the final amount a customer needs to pay after applying a discount. Use primitive data types, type conversion, and conditional statements to solve the problem.

Conditions:
If the total cart amount is greater than ₹5000, apply a 20% discount.
If the total cart amount is between ₹3000 and ₹5000 (inclusive), apply a 10% discount.
If the total cart amount is less than ₹3000, no discount is applied.
The program should:

Accept the total cart amount as input from the user (use primitive data types).
Calculate the discount and the final amount to be paid.
Use appropriate operators (e.g., arithmetic, relational, and ternary).
Display the discount and final amount in a user-friendly format.

Input: Enter the total cart amount: 4500
output:
Discount: ₹450.0
Final Amount: ₹4050.0*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total cart amount: ");
        int totalAmount = sc.nextInt(); 
        double discount = 0; 
        double finalVal;     

        
        if (totalAmount > 5000) {
            discount = (totalAmount * 20) / 100.0; // 20% discount
        } else if (totalAmount >= 3000 && totalAmount <= 5000) {
            discount = (totalAmount * 10) / 100.0; // 10% discount
        }

        // Calculate the final value after discount
        finalVal = totalAmount - discount;

        // Display the results
        System.out.printf("Discount: ₹%.2f\n", discount);
        System.out.printf("Final Amount: ₹%.2f\n", finalVal);
    }
}


