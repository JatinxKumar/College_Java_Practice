package Patterns;
public class Pyramid2 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for (int j = 0; j <= 3-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}


