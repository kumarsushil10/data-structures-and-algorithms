package javaCode;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = n.nextInt();

        int fact = 1;
        for (int i = 1 ;i<=num;i++){
            fact = fact*i;
        }
        System.out.print("Factorial of "+num+" is " + fact);
    }
}
