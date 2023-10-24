package javaCode;

public class DuckNumber {
    public boolean isDuckNumber(int num) {
        while (num > 0) {
            if (num % 10 == 0)
                return true;
            num /= 10;
        }
        return false;
    }
}
