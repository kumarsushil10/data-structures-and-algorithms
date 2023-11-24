package javaCode;

public class MysteryNumber {

    // A number N is said to be a mystery number
    // if the number can be expressed by the sum of two numbers.
    // Note that these two numbers must be reverse of each other.

    public boolean isMysteryNumber(int num) {
        boolean isMysteryNumber = false;
        if (num < 22 || 198 < num) {
            System.out.println("Please Enter Number between 22 and 198 ");
            return false;
        }
        for (int i = 1; i < num / 2; i++) {
            if (reverse(i) + i == num) {
//                System.out.println(i + " , " + reverse(i));
                isMysteryNumber = true;
            }
        }
        return isMysteryNumber;
    }

    public static int reverse(int num) {
        int rem;
        int rev = 0;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }
}
