package javaCode;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter number:  ");
        int num = n.nextInt();

        if (num == revers(num)) {
            System.out.println(num + " is Palindrome number");
        } else {
            System.out.println(num + " is not Palindrome number");
        }

    }

    public static int revers(int num) {
        int rem;
        int rev = 0;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }
}
