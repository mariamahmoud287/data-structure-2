package question.pkg1;
import java.util.Scanner;
public class Question1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array N: ");
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
         System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nUpper Triangular:");
        printUpper(arr);

        System.out.println("\nLower Triangular:");
        printLower(arr);

        sc.close();
    }
    public static void printUpper(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j >= i)
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void printLower(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j <= i)
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
