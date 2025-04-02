import java.util.Scanner;

public class RhombusPattern {
    public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 

        solid_rhombus(n);

        sc.close();
    }
}
