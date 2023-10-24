package javaCode;

public class EvilNumber {

    public boolean isEvilNumber(int num) {
        int binaryNumber = decimalToBinary(num);
        int count = 0;
        while (binaryNumber != 0) {
            if (binaryNumber % 10 != 0)
                count++;

            binaryNumber /= 10;
        }
        return count % 2 == 0;
    }

    public int decimalToBinary(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 2;
            sum = sum * 10 + rem;
            num /= 2;
        }
        return reversedNumber(sum);
    }

    public int reversedNumber(int num) {
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}