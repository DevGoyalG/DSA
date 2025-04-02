import java.util.Scanner;

public class HollowRhombusPattern {
    public static void hollow_rhombus(int var0) {
       for(int var1 = 1; var1 <= var0; ++var1) {
          int var2;
          for(var2 = 1; var2 <= var0 - var1; ++var2) {
             System.out.print(" ");
          }
 
          for(var2 = 1; var2 <= var0; ++var2) {
             if (var1 != 1 && var1 != var0 && var2 != 1 && var2 != var0) {
                System.out.print(" ");
             } else {
                System.out.print("*");
             }
          }
 
          System.out.println();
       }
 
    }
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int var0 = sc.nextInt(); 

        hollow_rhombus(var0);

        sc.close();
    }
}
