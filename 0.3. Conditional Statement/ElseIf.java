// package Conditional Statement;

public class ElseIf {
    public static void main(String[] args) {
        int age=9;
    if(age>=18){
        System.out.println("Adult");
    }

    else if(age>= 13 && age <18){
        System.out.println("Teenager");
    }

    // else if(age>=13 && age<18){
    //     System.out.println();
    // }

    else{
        System.out.println("Child");
    }
    }  
}
