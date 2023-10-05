package javaCode;

public class NeonNumber {
    public boolean isNeon(int num){
        return num == sumOfDigit(num*num);
    }

    public int sumOfDigit(int num){
        int sum =0;
        while (num >0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
