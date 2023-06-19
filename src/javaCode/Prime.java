package javaCode;

public class Prime {
    public static void main(String[] args) {
        int count = 0;
        int num = 100;
        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.println("\n\nTotal number of prime number between 1 to " + num + " is " + count);
    }


    public static Boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
