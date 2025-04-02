import java.util.Scanner;

public class DownwardTrianglePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
 
        // Loop to print rows
        for (int i = n; i  >= 1; i--) {
            // Loop to print asterisks in each row
            for (int j = 1; j  <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
        sc.close();
    }
}
