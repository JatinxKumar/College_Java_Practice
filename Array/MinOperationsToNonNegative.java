public class MinOperationsToNonNegative {
    public static int minOperations(int[] arr) {
        int operations = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                operations += Math.abs(arr[i]);
                arr[i] = 0;
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -2, 3, -4, 5};
        System.out.println("Minimum operations to make all elements non-negative: " + minOperations(arr));
    }
}