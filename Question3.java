package question.pkg3;
import java.util.Scanner;
public class Question3 {
    public static boolean isSortedIterative(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isSortedRecursive(int[] arr, int index) {
        if (index == arr.length - 1) {  // reached last element
            return true;
        }
        if (arr[index] > arr[index + 1]) {  // unsorted pair
            return false;
        }
        return isSortedRecursive(arr, index + 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("\nIterative Check: " +
                (isSortedIterative(arr) ? "Sorted" : "Not Sorted"));
        System.out.println("Recursive Check: " +
                (isSortedRecursive(arr, 0) ? "Sorted" : "Not Sorted"));
    }
}