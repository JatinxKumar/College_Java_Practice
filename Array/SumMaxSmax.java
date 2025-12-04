// In an beautiful garden there is special arrangement of plants along a path and that arrangement is represented by an array of integers where each integer represents the height of a plant.
// Your task is to find the sum of the heights of the tallest and the second tallest plants

public class SumMaxSmax {
    public static void main(String[] args) {
        int[] arr = { 5,3,6,3,7 };
        int max = 0;
        int smax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.println(max+smax);
    }
}
