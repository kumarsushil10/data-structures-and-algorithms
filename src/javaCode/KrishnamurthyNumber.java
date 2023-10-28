package javaCode;

public class KrishnamurthyNumber {
    public boolean isKrishnamurthyNumber(int num) {
        int number = num;
        int sumOfFactorial = 0;
        while (number != 0) {
            sumOfFactorial += factorial(number % 10);
            number /= 10;
        }
        return num == sumOfFactorial;
    }
    public int factorial(int num) {
        if (num == 0)
            return 1;
        return num * factorial(num - 1);
    }
}
