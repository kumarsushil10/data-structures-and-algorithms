package javaCode;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = n.nextInt();

//        for (int i = 1; i <= num; i++) {
//            if (isArmstrong(i)) {
//                System.out.print(i + "\t");
//            }
//        }


        if (isArmstrong(num)) {
            System.out.println(num + " is Armstrong number");
        } else {
            System.out.println(num + " is not Armstrong number");
        }


    }

    public static int countDigit(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrong(int num) {
        int number = num;
        double pow = countDigit(num);
        double digit;
        double sum = 0;
        while (num > 0) {
            digit = num % 10;
            sum += Math.pow(digit, pow);
            num /= 10;
        }
        return number == sum;
    }
}
