import java.util.Scanner;

public class CrossPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();                    // n Must be odd

        for (int i = 0; i  <  n; i++) {
            for (int j = 0; j  <  n; j++) {
                // Check if the current position is in the center row or center column
                if (i == n / 2 || j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
