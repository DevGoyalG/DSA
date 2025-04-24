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

        // length of string
        System.out.println(name.length());

        // string concatenantion
        String s1 = "Mumbai";
        String s2 = "Indians";
        String s = s1 + " " + s2;
        System.out.println(s);

        // string comparison
        String ss1 = "Rohit";
        String ss2 = "Rohit";
        if(ss1.equals(ss2)){
            System.out.println("String same");
        } else{
            System.out.println("String not same");
        }
    }
}
