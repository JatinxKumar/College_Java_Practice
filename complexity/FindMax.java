// Space Complexity Example
// public class FindMax {
//     public static void main(String[] args) {
//         int[] numbers = { 3, 5, 7, 2, 8, -1 };
//         int max = FindMax.findMax(numbers);
//         System.out.println("The maximum value is: " + max);
//     }
//     public static int findMax(int[] arr) {
//         int max = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
// }

// Ques-> Wap to sum all elements in an integer array and determine its time complexity.
public class FindMax {
    public static void main(String[] args) {
        int[] numbers = { 3, 5, 7, 2, 8, -1 };
        int sum = FindMax.sumArray(numbers);
        System.out.println("The sum of all elements is: " + sum);
    }
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
