// package Conditional

import java.util.Scanner;

// Statement;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt(); 
        int tax;

        if(income < 500000){
            tax = 0;
            System.out.println(tax);
        }

        else if(income >=500000 && income < 1000000){
            tax= (int)(income*0.2);
            System.out.println(tax);
        }

        else{
            tax = (int)(income*0.3);
        }
        System.out.println("your tax is: " + tax);

        sc.close();
        }
}
