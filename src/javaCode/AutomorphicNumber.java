package javaCode;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = n.nextInt();
        if (isAutomorphicNumber(num)) {
            System.out.println(num + " is Automorphic number");
        } else {
            System.out.println(num + " is not Automorphic number");

        }
    }

    public static boolean isAutomorphicNumber(int number) {
        int squareLastDigit, numberLastDigit;
        int square = (int)Math.pow(number, 2);
        int num = number;
        while (num > 0) {
            squareLastDigit = square % 10;
            numberLastDigit = num % 10;
            if (numberLastDigit != squareLastDigit) {
                return false;
            }
            square /= 10;
            num /= 10;
        }
        return true;
    }
}
