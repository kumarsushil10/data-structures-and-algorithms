package javaCode;

public class Recursions {

    public int powerOfTwo(int num) {
        int power = 1;
        if (num == 1) {
            System.out.print(power);
            return power;
        } else {
            power = 2 * powerOfTwo(num - 1);
            System.out.print(", " + power);
            return power;
        }
    }

    public int factorial(int num) {
        if (num < 0)
            return -1;
        if (num == 0 || num == 1)
            return 1;
        return num * factorial(num - 1);
    }

    public int sumOfDigit(int num) {
        if (num >= 0)
            return num % 10 + sumOfDigit(num / 10);
        return 0;
    }

    public int gcd(int n, int m) {
        if (m != 0)
            return gcd(m, n % m);
        return n;
    }

    public Long decimalToBinary(int num) {
        if (num != 0) {
            return num % 2 + 10 * decimalToBinary(num / 2);
        }
        return 0L;
    }

    public int power(int base, int exponent) {
        if (exponent <= 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public int productOfArray(int[] arr, int len) {
        if (len != 0)
            return arr[len - 1] * productOfArray(arr, len - 1);
        return 1;
    }

    public int sumOfNaturalNumber(int num) {
        if (num != 0)
            return num + sumOfNaturalNumber(num - 1);
        return 0;
    }

    public int fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }


}
