package javaCode;

public class StrontioNumber {
    public boolean isStrontioNumber(int num) {
        if (String.valueOf(num).length() != 4) {
            System.out.println("Please Enter 4 Digits number");
            return false;
        }
        int number = num * 2;
        System.out.println("after multiple of 2 == " + number);
        number /= 10;
        System.out.println("remove 1 place == " + number);
        int x = number % 10;
        System.out.println("10th place " + x);
        number /= 10;
        System.out.println("remove 10th place == " + number);
        int y = number % 10;
        System.out.println("100th place " + x);
        return x == y;
    }
}
