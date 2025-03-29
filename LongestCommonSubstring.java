

// public class Main {
//     public static void main(String[] args) {
//         String t1 = "ezupkr";
//         String t2 = "ubmrapg";
//         int count = 0;
        
//         // Check common characters in both strings
//         for (int i = 0; i < t1.length(); i++) {
//             char ch = t1.charAt(i);
//             if (t2.contains(String.valueOf(ch))) {
//                 count++;
//             }
//         }
        
//         System.out.println(count);
//     }
// }


// public class LongestCommonSubstring {
//     public static String findLongestCommonSubstring(String t1, String t2) {
//         int m = t1.length();
//         int n = t2.length();
//         int[][] dp = new int[m + 1][n + 1];
//         int maxLength = 0;  // Stores the length of the longest common substring
//         int endIndex = -1;  // Stores the end index of the longest common substring in t1

//         for (int i = 1; i <= m; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (t1.charAt(i - 1) == t2.charAt(j - 1)) {
//                     dp[i][j] = dp[i - 1][j - 1] + 1;
//                     if (dp[i][j] > maxLength) {
//                         maxLength = dp[i][j];
//                         endIndex = i;  // Update the ending index of the common substring
//                     }
//                 } else {
//                     dp[i][j] = 0;
//                 }
//             }
//         }

//         // Extract longest common substring using substring()
//         return (maxLength > 0) ? t1.substring(endIndex - maxLength, endIndex) : "";
//     }

//     public static void main(String[] args) {
//         String t1 = "abcdef";
//         String t2 = "abdfef";
//         System.out.println("Longest Common Substring: " + findLongestCommonSubstring(t1, t2));
//     }
// }


import java.util.Scanner;

public class LongestCommonSubstring {
    public static String findLongestCommonSubstring(String t1, String t2) {
        int m = t1.length();
        int n = t2.length();
        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0;  // Stores the length of the longest common substring
        int endIndex = -1;  // Stores the end index of the longest common substring in t1

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (t1.charAt(i - 1) == t2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i;  // Update the ending index of the common substring
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        // Extract longest common substring using substring()
        return (maxLength > 0) ? t1.substring(endIndex - maxLength, endIndex) : "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first string: ");
        String t1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String t2 = scanner.nextLine();

        // Finding and displaying the longest common substring
        System.out.println("Longest Common Substring: " + findLongestCommonSubstring(t1, t2));

        scanner.close();
    }
}





// public class LongestCommanSubstring {
//     public static String findLongestCommonSubstring(String t1, String t2) {
//         int m = t1.length();
//         int n = t2.length();
//         int[] prev = new int[n + 1];
//         int[] curr = new int[n + 1];
//         int maxLength = 0;
//         int endIndex = -1;

//         for (int i = 1; i <= m; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (t1.charAt(i - 1) == t2.charAt(j - 1)) {
//                     curr[j] = prev[j - 1] + 1;
//                     if (curr[j] > maxLength) {
//                         maxLength = curr[j];
//                         endIndex = i;
//                     }
//                 } else {
//                     curr[j] = 0;
//                 }
//             }
//             // Swap rows (move curr to prev for next iteration)
//             int[] temp = prev;
//             prev = curr;
//             curr = temp;
//         }

//         // Extract substring using substring()
//         return (maxLength > 0) ? t1.substring(endIndex - maxLength, endIndex) : "";
//     }

//     public static void main(String[] args) {
//         String t1 = "abcdef";
//         String t2 = "ab3dfcef";
//         System.out.println("Longest Common Substring: " + findLongestCommonSubstring(t1, t2));
//     }
// }
