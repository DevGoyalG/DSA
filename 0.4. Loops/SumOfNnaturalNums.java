import java.util.*;

public class SumOfNnaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of no. is: "+ sum);
        sc.close();
    }
}

