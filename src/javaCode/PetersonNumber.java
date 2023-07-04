package javaCode;

import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = n.nextInt();
        if (isPetersonNumber(num)){
            System.out.println(num + " is peterson number");
        }else {
            System.out.println(num + " is not peterson number");

        }


    }
    public static boolean isPetersonNumber(int num){

        int number = num;
        int rem;
        int sum =0 ;
        while (num>0){
            rem = num%10;
            sum += factorial(rem);
            num /= 10;
        }
        return sum == number;

    }
    public static int factorial(int num){
        int fact = 1;
        for (int i = 1 ;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }
}
