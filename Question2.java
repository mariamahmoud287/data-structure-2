package question.pkg2;
import java.util.Scanner;
public class Question2 {
    public static int[] to1D(int[][] matrix) {
        int n = matrix.length;
        int size = n * (n + 1) / 2;
        int[] arr = new int[size];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int index = (i * (i + 1)) / 2 + j;
                arr[index] = matrix[i][j];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix size n: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the matrix values:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        int[] result = to1D(matrix);
        System.out.println("1D array (lower triangular):");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
    }
