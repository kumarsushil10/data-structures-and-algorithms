package javaCode;

public class BitManipulation {

    public int getIthBitOfN(int i, int n) {
        int bitMask = 1 << i;
        if ((bitMask & n) != 0)
            return 1;
        return 0;
    }

    // this method is set 1 to Ith bit
    //for Example
    // number == 8 ,i == 2
    // 8 in binary 1000 and it Ith position from right to left is 0
    // result will be 1100
    public int setIthBitOfN(int i, int num) {
        int bitMask = 1 << i;
        return bitMask | num;
    }


    // this method is set 1 to Ith bit
    //for Example
    // number == 15 ,i == 2
    // 15 in binary 1111 and it Ith position from right to left is 0
    // result will be 1011
    public int clearIthBitOfN(int i, int num) {
        int bitMask = ~(1 << i);
        return num & bitMask;
    }

    public int updateIthBitOfN(int i, int n, int changeTo) {
        if (changeTo == 0) {
            return clearIthBitOfN(i, n);
        } else {
            return setIthBitOfN(i, n);
        }
    }

    public int toggleIthBitOfN(int i, int n) {
        int bitMask = 1 << i;
        return n ^ bitMask;
    }

    public boolean isEven(int n) {
        return (n & 1) == 0;
    }

    public boolean isBothPositive(int m, int n) {
        return (m ^ n) > 0;
    }

    public int addOneWithoutUsingPlusOperator(int n) {
        return -~n;
    }

    public void swapTwoNumberWithoutUsingPlusOperatorAndThirdVariable(int n, int m) {
        System.out.println("Before Swap: n = " + n + ",  m = " + m);
        if (n != m) {
            n = n ^ m;
            m = n ^ m;
            n = n ^ m;
        }
        System.out.println("After Swap:  n = " + n + ",  m = " + m);

    }

    public int positionOfRightmostSetBit(int num) {
        num = (num & (num - 1)) ^ num;
        int position = 0;
        while (num != 0) {
            num = num >> 1;
            position++;
        }
        return position;
    }

    public boolean isPowerOfTwo(int num) {
        return (num & (num - 1)) == 0;
    }
}
