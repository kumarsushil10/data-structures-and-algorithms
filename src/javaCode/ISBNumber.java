package javaCode;

public class ISBNumber {
    public boolean isISBNumber(Long num) {
        if (String.valueOf(num).length() != 10) {
            return false;
        }
        long sumOfDigit = 0L;
        for (int i = 1; i < 11; i++) {
            sumOfDigit += (num % 10) * i;
            num /= 10;
        }
        return sumOfDigit % 11 == 0;
    }
}
