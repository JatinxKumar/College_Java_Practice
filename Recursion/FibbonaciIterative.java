import java.util.Scanner;
public class FibbonaciIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci Series: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
