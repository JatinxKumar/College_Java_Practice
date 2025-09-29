public class Quick {
    public static void main(String[] args) {
        int[] arr = {16, 10, 9, 15, 20};
        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num+" ");
        }
    }

    // Quick Sort with partition logic in one function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            int pivotIndex = i + 1;

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
}
