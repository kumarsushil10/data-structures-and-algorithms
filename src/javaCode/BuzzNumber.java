package javaCode;

public class BuzzNumber {
    //    A number is said to be Buzz number if number is divisible by 7 or at unit is 7
    public boolean isBuzzNumber(int num){
        return num % 10 == 7 || num % 7 == 0;
    }
}
