package javaCode;

public class SpyNumber {
    public boolean isSpyNumber(Long num) {
        int sum = 0, product = 1;
        while (num>0){
            sum += num%10;
            product *= num%10;
            num /=10;
        }
        return sum == product;
    }

    public boolean isSpyNumber(int num) {
        return productOfDigit(num) == sumOfDigit(num);
    }

    public int productOfDigit(int num) {
        int product = 1;
        while (num > 0) {
            product *= num % 10;
            num /= 10;
        }
        return product;
    }

    public int sumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
