package Basic;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = new int[5];
//
////        System.out.println("Enter 5 numbers:");
//        
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = scanner.nextInt();
//        }
//
//        
//        int largest = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > largest) {
//                largest = numbers[i];
//            }
//        }
//        System.out.println("Largest: " + largest);
//        scanner.close();
    	
    	
//    	int[][] arr = new int[2][2];
//    	arr[0][0] = 10;
//    	arr[1][0] = 20;
//    	arr[0][1] = 40;
//    	arr[1][1] = 50;
//
//    	for (int i = 0; i < 2; i++) {
//    	    for (int j = 0; j < 2; j++) {
//    	        System.out.print(arr[i][j
    	// Adjoint formula for 2x2: swap diagonals, negate off-diagonals
    	
    	
    	        int[][] adj = new int[2][2];
    	        adj[0][0] =  arr[1][1];
    	        adj[0][1] = -arr[0][1];
    	        adj[1][0] = -arr[1][0];
    	        adj[1][1] =  arr[0][0];

    	        System.out.println("Adjoint Matrix:");
    	        for (int i = 0; i < 2; i++) {
    	            for (int j = 0; j < 2; j++) {
    	                System.out.print(adj[i][j] + "\t");
    	                
    	    }
    	    System.out.println();
    	}

    }
}








//
//
//package Basic;
//
//import java.util.Scanner;
//
//public class AdjacencyMatrix {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter number of vertices: ");
//        int n = scanner.nextInt();
//
//        System.out.print("Enter number of edges: ");
//        int m = scanner.nextInt();
//
//        int[][] adj = new int[n][n];
//
//        System.out.println("Enter edges (source destination) using 0 to " + (n - 1) + ":");
//        for (int i = 0; i < m; i++) {
//            int u = scanner.nextInt();
//            int v = scanner.nextInt();
//            adj[u][v] = 1;
//            adj[v][u] = 1; // Remove this line for a directed graph
//        }
//
//        System.out.println("\nAdjacency Matrix:");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(adj[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        scanner.close();
//    }
//}
//
