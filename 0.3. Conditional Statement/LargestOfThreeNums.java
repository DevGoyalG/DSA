import java.util.Scanner;

public class LargestOfThreeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a>=b) && (a>=c)){
            System.out.println("a is larger");
        }

        else if(b>=c){
            System.out.println("b is larger");
        }

        else{
            System.out.println("c is larger");
        }
    }
}