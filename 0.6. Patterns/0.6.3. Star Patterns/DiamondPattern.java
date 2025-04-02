import java.util.Scanner;

public class DiamondPattern {
    public static void diamond(int n){
        //1st half
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=(n-i); j++){
                System.err.print(" ");
            }

            //star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--){
            //space
            for(int j=1; j<=(n-i); j++){
                System.err.print(" ");
            }

            //star
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 
        
        diamond(n);

        sc.close();
    }
}
