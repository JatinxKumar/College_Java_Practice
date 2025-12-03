// check if matrix is upper triangular
// Given a square matrix mat[][], the task is to determine whether it is in upper triangular form. A matrix is considered upper triangular if all elements below the main diagonal are zero, while the diagonal and elements above it can be any value.
public class UpperTriangle {
    public static boolean isUpperTriangle(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        if (isUpperTriangle(arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}