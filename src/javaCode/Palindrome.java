package javaCode;

public class Palindrome {
    public static void main(String[] args) {
        palindrome(234);
        palindrome(23432);

    }

    public static void palindrome(int num) {
        if (num == reversed(num)) {
            System.out.println(num + " is palindrome.");
        } else {
            System.out.println(num + " is not palindrome.");
        }
    }

    public static int reversed(int num) {
        int number = num;
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            sum = sum * 10 + rem;
            number = number / 10;
        }
        return sum;
    }
}
