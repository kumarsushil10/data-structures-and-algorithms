package javaCode;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter range for prime number:  ");
        int length = n.nextInt();
        int count = 0;
        for (int i = 2; i <= length; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
                count++;
            }
        }

        System.out.println("\nTotal prime number from 1 to " + length + " is : " + count);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
