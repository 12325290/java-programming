// public class FloydWarshall {
//     static final int INF = 99999; // Using a large value to represent infinity
//     static final String[] cities = {"NY", "LA", "CHI", "HOU", "MIA"};

//     public static void main(String[] args) {
//         int[][] dist = {
//             {0, INF, 15, 40, INF},
//             {INF, 0, INF, 25, 60},
//             {15, INF, 0, 10, INF},
//             {40, 25, 10, 0, 30},
//             {INF, 60, INF, 30, 0}
//         };

//         int n = dist.length;
        
//         // Applying Floyd-Warshall Algorithm
//         for (int k = 0; k < n; k++) {
//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n; j++) {
//                     if (dist[i][k] != INF && dist[k][j] != INF) {
//                         dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
//                     }
//                 }
//             }
//         }

//         // Print the final shortest path matrix
//         printSolution(dist);
//     }

//     static void printSolution(int[][] dist) {
//         int n = dist.length;
//         System.out.println("Shortest travel times between cities:");
        
//         // Print column headers
//         System.out.print("      ");
//         for (int i = 0; i < n; i++) {
//             System.out.printf("%5s", cities[i]);
//         }
//         System.out.println();

//         // Print the matrix with row headers
//         for (int i = 0; i < n; i++) {
//             System.out.printf("%5s", cities[i]);
//             for (int j = 0; j < n; j++) {
//                 if (dist[i][j] == INF) {
//                     System.out.print("  INF");
//                 } else {
//                     System.out.printf("%5d", dist[i][j]);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }







import java.util.Scanner;

public class FloydWarshallUserInput {
    static final int INF = 99999; // Large value representing no direct path

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the number of cities as input
        System.out.print("Enter the number of cities: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Taking city names as input
        String[] cities = new String[n];
        System.out.println("Enter the names of the cities:");
        for (int i = 0; i < n; i++) {
            cities[i] = scanner.nextLine();
        }

        // Taking the adjacency matrix as input
        int[][] dist = new int[n][n];
        System.out.println("Enter the travel time matrix (use " + INF + " for no direct connection):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = scanner.nextInt();
            }
        }

        // Applying Floyd-Warshall Algorithm
        floydWarshall(dist, n);

        // Print the final shortest path matrix
        printSolution(dist, cities);
        
        scanner.close();
    }

    static void floydWarshall(int[][] dist, int n) {
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF) { // Ensure no overflow due to INF
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
    }

    static void printSolution(int[][] dist, String[] cities) {
        int n = dist.length;
        System.out.println("\nShortest travel times between cities:");

        // Print column headers
        System.out.print("      ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%5s", cities[i]);
        }
        System.out.println();

        // Print the matrix with row headers
        for (int i = 0; i < n; i++) {
            System.out.printf("%5s", cities[i]);
            for (int j = 0; j < n; j++) {
                if (dist[i][j] == INF) {
                    System.out.print("  INF");
                } else {
                    System.out.printf("%5d", dist[i][j]);
                }
            }
            System.out.println();
        }
    }
}

