// public class Question3 {
    

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter an integer value: ");
//         int num1 = sc.nextInt();

//         System.out.print("Enter a double value: ");
//         double num2 = sc.nextDouble();

//         System.out.print("Enter a single character: ");
//         char num3 = sc.next().charAt(0);

//         System.out.print("Enter a boolean value (true/false): ");
//         boolean num4 = sc.nextBoolean();

// //         System.out.println("Integer value: " + num1);
//         System.out.println("Double value: " + num2);
//         System.out.println("Character value: " + num3);
//         System.out.println("Boolean value: " + num4);
//         // Perform type conversion
//         double convertedDouble = num1; // Implicit conversion from int to double
//         int convertedInt = num3;     // Implicit conversion from char to int (ASCII value)

//         // Print values after conversion
//         System.out.println("\nValues After Type Conversion:");
//         System.out.println("Integer converted to double: " + convertedDouble);
//         System.out.println("Character converted to integer (ASCII value): " + convertedInt);
//     }
// }


// // import java.util.Scanner;

// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         int number = sc.nextInt();
        
// //         String result;
// //         switch (number / 10) { 
// //             case 0: 
// //                 result = "LOW";
// //                 break;
// //             case 1: 
// //                 result = "MEDIUM";
// //                 break;
// //             case 2: 
// //                 result = "HIGH";
// //                 break;
// //                 default:
// //                 result = "Out of Range";
// //         }
// //         System.out.println(result);
// //     }
// // }


// // Scanner scanner = new Scanner(System.in);
// // System.out.print("Enter your number: ");
// // int number = scanner.nextInt();
// // if(number>=0 && number<=10){
// // number =1;
// // }else if(number>=11 && number <=20){
// // number=2;
// // }else if(number>=21 && number<=30){
// // number=3;
// // }
// // switch(number){
// // case 1:
// // System.out.println("LOW");
// // break;
// // case 2:
// // System.out.println("MEDIUM");
// // break;
// // case 3:
// // System.out.println("HIGH");
// // break;
// // default:
// // System.out.println("out of range");
// // }


// /*A retail store offers discounts on the total amount of items in a shopping cart based on specific conditions. You need to write a program that calculates the final amount a customer needs to pay after applying a discount. Use primitive data types, type conversion, and conditional statements to solve the problem.

// Conditions:
// If the total cart amount is greater than ₹5000, apply a 20% discount.
// If the total cart amount is between ₹3000 and ₹5000 (inclusive), apply a 10% discount.
// If the total cart amount is less than ₹3000, no discount is applied.
// The program should:

// Accept the total cart amount as input from the user (use primitive data types).
// Calculate the discount and the final amount to be paid.
// Use appropriate operators (e.g., arithmetic, relational, and ternary).
// Display the discount and final amount in a user-friendly format.

// Input: Enter the total cart amount: 4500
// output:
// Discount: ₹450.0
// Final Amount: ₹4050.0*/

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the total cart amount: ");
//         int totalAmount = sc.nextInt(); 
//         double discount = 0; 
//         double finalVal;     

        
//         if (totalAmount > 5000) {
//             discount = (totalAmount * 20) / 100.0; // 20% discount
//         } else if (totalAmount >= 3000 && totalAmount <= 5000) {
//             discount = (totalAmount * 10) / 100.0; // 10% discount
//         }

//         // Calculate the final value after discount
//         finalVal = totalAmount - discount;

//         // Display the results
//         System.out.printf("Discount: ₹%.2f\n", discount);
//         System.out.printf("Final Amount: ₹%.2f\n", finalVal);
//     }
// }


Here are the Java programs for each of the tasks you listed:  

### **1. Sum and Average of All Elements in an Array**
```java
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / n);
        sc.close();
    }
}
```

---

### **2. Find the Occurrence of an Element in an Array**
```java
import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter the element to count: ");
        int num = sc.nextInt(), count = 0;
        
        for (int i : arr) if (i == num) count++;
        
        System.out.println("Occurrences: " + count);
        sc.close();
    }
}
```

---

### **3. Find Maximum and Minimum Elements in an Array**
```java
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int min = arr[0], max = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
            if (i > max) max = i;
        }

        System.out.println("Min: " + min + ", Max: " + max);
        sc.close();
    }
}
```

---

### **4. Check if the Given Array is Sorted**
```java
import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        boolean sorted = true;
        for (int i = 1; i < n; i++) if (arr[i] < arr[i - 1]) sorted = false;

        System.out.println(sorted ? "Sorted" : "Not Sorted");
        sc.close();
    }
}
```

---

### **5. Check if a New Array is a Palindrome**
```java
import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) if (arr[i] != arr[n - i - 1]) isPalindrome = false;

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
```

---

### **6. Merge Two Sorted Arrays**
```java
import java.util.Scanner;
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr1 = new int[n], arr2 = new int[m], merged = new int[n + m];

        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        System.arraycopy(arr1, 0, merged, 0, n);
        System.arraycopy(arr2, 0, merged, n, m);
        Arrays.sort(merged);

        System.out.println(Arrays.toString(merged));
        sc.close();
    }
}
```

---

### **7. Search an Element in a 2D Array**
```java
import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < cols; j++) 
                arr[i][j] = sc.nextInt();

        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < cols; j++) 
                if (arr[i][j] == target) found = true;

        System.out.println(found ? "Found" : "Not Found");
        sc.close();
    }
}
```

---

### **8. Sum and Average of All Elements in a 2D Array**
```java
import java.util.Scanner;

public class SumAverage2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(), cols = sc.nextInt(), sum = 0;
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }

        System.out.println("Sum: " + sum + ", Average: " + (double) sum / (rows * cols));
        sc.close();
    }
}
```

---

### **9. Sum of Two Diagonal Elements**
```java
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                arr[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++) sum += arr[i][i] + arr[i][n - i - 1];

        System.out.println("Diagonal Sum: " + sum);
        sc.close();
    }
}
```

---

### **10. Delete a Specific Element and Return New Array**
```java
import java.util.Scanner;
import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), del = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] newArr = Arrays.stream(arr).filter(x -> x != del).toArray();
        System.out.println(Arrays.toString(newArr));
        sc.close();
    }
}
```

---

### **11. Reverse an Array**
```java
import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
```