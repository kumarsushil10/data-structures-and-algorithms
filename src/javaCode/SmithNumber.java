package javaCode;

import java.util.ArrayList;
import java.util.List;

public class SmithNumber {
//    A Smith number is a composite number whose
//    sum of digits equals to the sum of digits of its prime factors

    public boolean isSmithNumber(int num) {
        List<Integer> primeFactors = primeFactor(num);
        int sumOfPrimeFactor = 0;
        for (Integer primeFactor : primeFactors) {
            sumOfPrimeFactor += sumOfDigit(primeFactor);
        }
        return sumOfDigit(num) == sumOfPrimeFactor;
    }

    public List<Integer> primeFactor(int num) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                primeFactors.add(i);
                num /= i;
            }
        }
        if (num > 2)
            primeFactors.add(num);
        return primeFactors;
    }

    public int sumOfDigit(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
