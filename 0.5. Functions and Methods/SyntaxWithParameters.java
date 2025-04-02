import java.util.Scanner;

public class SyntaxWithParameters {
    public static void printRO(){
        System.out.println("RO");
        System.out.println("RO");
    }

    public static int printSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = printSum(a, b);
        System.out.println("Sum is: " + sum);

        sc.close();
    }
}
