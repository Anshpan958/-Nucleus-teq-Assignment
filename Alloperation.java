package LearningGIT;

import java.util.Scanner;

public class Alloperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers- ");
        int a = sc.nextInt();
        int b  = sc.nextInt();
        System.out.println("Enter + for additaion");
        System.out.println("Enter - for subtraction");
        System.out.println("Enter * for multiplication");
        System.out.println("Enter / for division");
        System.out.println("Enter your choices : ");
        String choice = sc.next();
        switch(choice)
        {
            case "+":
                System.out.println(a+" + "+b+" = "+(a+b));

                break;
            case "-":
                System.out.println(a+" - "+b+" = "+(a-b));
                break;
            case "*":
                System.out.println(a+" * "+b+" = "+(a*b));
                break;
            case "/":
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            default:System.out.println("Wrong choice.");
                break;

        }
    }

}