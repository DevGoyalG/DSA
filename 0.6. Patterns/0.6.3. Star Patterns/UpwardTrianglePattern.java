import java.util.Scanner;

public class UpwardTrianglePattern {
    public static void main(String[] args) {
        // one line
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
