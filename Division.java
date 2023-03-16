package LearningGIT;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers for division.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+" / "+b+" = "+(a/b));
    }

}