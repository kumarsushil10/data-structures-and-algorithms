package javaCode;

import java.util.ArrayList;
import java.util.List;

public class BouncyNumber {
    public boolean isBouncyNumber(int num) {
        List<Integer> numList = new ArrayList<>();
        while (num != 0) {
            numList.add(num % 10);
            num /= 10;
        }
        return !isIncreasing(numList) && !isDecreasing(numList);

    }

    private boolean isIncreasing(List<Integer> num) {
        for (int i = 0; i < num.size() - 1; i++) {
            if (num.get(i) < num.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean isDecreasing(List<Integer> num) {
        for (int i = 0; i < num.size() - 1; i++) {
            if (num.get(i) > num.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
