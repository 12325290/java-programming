// class arrayTostring {

//     public static void main(String[] args) {
//         String [] arr = new String[]{
//             "this", "is", "the", "best", "and", "most", 
//             "detailed", "course" ,"on" ,"java" ,"on" ,
//             "the", "internet"
//         };

//         StringBuilder sb = new StringBuilder();
//         for(String str : arr){
//             sb.append(str).append(" ");
//         }
//         System.out.println(sb);
//     }
// }


// USER INPUT


import java.util.Scanner;

class arrayTostring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of words: ");
        int n = scanner.nextInt();
        // scanner.nextLine(); // Consume newline

        String[] arr = new String[n];
        // System.out.println("Enter " + n + " words:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }

        System.out.println("Concatenated String: " + sb.toString().trim());

        scanner.close();
    }
}


