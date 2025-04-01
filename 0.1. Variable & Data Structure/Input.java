import java.util.*;


public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String input = sc.next();
        // System.out.println(input);

        // String in = sc.nextLine();
        // System.out.println(in);

        // int n = sc.nextInt();
        // System.out.println(n);

        // float price = sc.nextFloat();
        // System.out.println(price);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = a + b;
        // int d = a*b;
        // System.out.println(c);
        // System.out.println(d);

        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.println(area);
        
        sc.close();
    }
}