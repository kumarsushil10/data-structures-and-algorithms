package javaCode;

public class Fibonacci {
    public static void main(String[] args) {

        fibonacci(10);
    }



    public static void fibonacci(int length){
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + "\t"+ num2);
        for (int i = 0;i<length;i++){
            int sum = num1+num2;
            System.out.print("\t"+sum);
            num1 = num2;
            num2 = sum;
        }
    }
}
