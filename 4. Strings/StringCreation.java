import java.util.*;

public class StringCreation {
    public static void main(String[] args) {
        String str = "Rohit";
        String str2 = new String("Rohit Sharma");

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        System.out.print("Write something: ");
        String name = sc.nextLine();
        System.out.println(name);
    }
}
