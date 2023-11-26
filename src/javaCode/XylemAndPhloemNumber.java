package javaCode;

import java.util.ArrayList;
import java.util.List;

public class XylemAndPhloemNumber {
    public void XylemOrPhloem(int num) {
        int number = num;
        List<Integer> numList = new ArrayList<Integer>();
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            numList.add(digit);
            sum += digit;
            num /= 10;
        }
        if (sum - (numList.get(0) + numList.get(numList.size() - 1)) == (numList.get(0) + numList.get(numList.size() - 1))) {
            System.out.println(number + " is Xylem Number");
        } else {
            System.out.println(number + " is Phloem Number");
        }
    }
}
