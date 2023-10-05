package javaCode;

public class BitManipulation {

    public int getIthBitOfN(int i, int n) {
        int bitMask = 1 << i;
        if ((bitMask & n) != 0)
            return 1;
        return 0;
    }

    public int setIthBitOfN(int i, int n) {
        int bitMask = 1 << i;
        return bitMask | n;
    }
    public int clearIthBitOfN(int i, int n) {
        int bitMask = 1 << i;
        return n & ~bitMask;
    }

    public int updateIthBitOfN(int i, int n, int changeTo)   {
        if (changeTo == 0){
          return   clearIthBitOfN(i,n);
        }else {
           return setIthBitOfN(i,n);
        }
    }

    public int toggleIthBitOfN(int i,int n){
        int bitMask = 1<<i;
        return n^bitMask;
    }

    public boolean isEven(int n){
        return (n & 1) == 0;
    }
    
    public boolean isBothPositive(int m,int n){
        return (m^n) > 0;
    }
}
