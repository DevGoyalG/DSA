import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
 
        for (int i = 0; i  <  n; i++) {
            // Print spaces
            for (int j = n; j  >  i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 0; k  <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
