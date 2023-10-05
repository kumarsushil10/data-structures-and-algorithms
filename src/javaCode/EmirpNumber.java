package javaCode;

public class EmirpNumber {
    public boolean isEmirpNumber(int num) {
        return isPrime(num) && isPrime(reversedNumber(num));
    }

    public void allPrimeUpTo(int num) {
        for (int i = 1; i <= num; i++) {
            if (i < 3 || isPrime(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int reversedNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}
