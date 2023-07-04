package javaCode;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        double a = random.nextDouble(10,110);
        System.out.println(a);
    }
}
