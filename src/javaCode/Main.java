package javaCode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayProblems arrayProblems = new ArrayProblems();
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,5,2,3,2};
        arrayProblems.printAllDuplicate(nums);
        System.out.println();
        arrayProblems.removeDuplicate(nums);

    }
}