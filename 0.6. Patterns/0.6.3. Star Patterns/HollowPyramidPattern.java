import java.util.Scanner;

public class HollowPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i  <  n; i++) {
            // Print leading spaces
            for (int j = n - 1; j  >  i; j--) {
                System.out.print(" ");
            }

            // Print the first and last rows
            if (i == 0 || i == n - 1) {
                for (int k = 0; k  <= i; k++) {
                    System.out.print("* ");
                }
            } else {
                // Print the first asterisk
                System.out.print("*");

                // Print spaces inside the pyramid
                for (int k = 1; k  <  i; k++) {
                    System.out.print("  ");
                }

                // Print the second asterisk
                System.out.print(" *");
            }

            // Move to the next line
            System.out.println();
        }
        sc.close();
    }
}
