package javaCode;

import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = n.nextInt();
        if (isTechNumber(num)) {
            System.out.println(num + " is Tech number");
        } else {
            System.out.println(num + " is not Tech number");
        }

    }

    public static boolean isTechNumber(int num) {
        int firstHalf = num / (int) Math.pow(10, countDigit(num) / 2);
        int secondHalf = num % (int) Math.pow(10, countDigit(num) / 2);
        return (int) Math.pow(firstHalf + secondHalf, 2) == num;
    }

    public static int countDigit(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
