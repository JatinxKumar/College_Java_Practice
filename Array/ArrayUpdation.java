import java.util.Scanner;
public class ArrayUpdation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.print("Enter the numbers in array: ");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("Entered numbers in Array are: ");
        for(int i=0; i<size; i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("Indexes are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i] + " = " + i);

        }
        System.out.print("Do you want to change any value? (1/0): ");
        int choice = sc.nextInt();

        if(choice==1){
            System.out.print("Enter the index number of the value: ");
            int index = sc.nextInt();
            System.out.print("Enter the new value: ");
            int value = sc.nextInt();

            numbers[index] = value;

            System.out.print("Updated Array: ");
            for(int i=0; i<size; i++){
                System.out.print(numbers[i] + " ");
            }
        }else{
            System.out.println("Okay! You don't want to update any value.");
        }

    }
}
