import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        do{

              
               System.out.print("Enter a no:");
        int n=sc.nextInt();
        
        if(n<=0){
            System.out.println("Enter a positive integer");
            break;
        }
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
        System.out.print("Enter  1 to exit any integer to continue:");
        int o=sc.nextInt();
        if(o==1){
            System.out.println("Exiting...");
            System.exit(0);

        }

    }
    while(true);
    
        
    }
}
