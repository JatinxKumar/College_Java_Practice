// values update according to user
import java.util.Scanner;
public class Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input values from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Update values according to user
        System.out.print("Enter index to update: ");
        int idx = sc.nextInt();
        if (idx >= 0 && idx < n) {
            System.out.print("Enter new value: ");
            arr[idx] = sc.nextInt();
        } else {
            System.out.println("Invalid index.");
        }

        // Print updated array
        System.out.println("Updated array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
