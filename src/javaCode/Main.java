package javaCode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayProblems arrayProblems = new ArrayProblems();
        int[] nums = new int[]{3,2,23,34,35,6,73,2,52,5,5,1};
        System.out.println(Arrays.toString(nums));
        System.out.println(arrayProblems.secondLargestNumber(nums));
        System.out.println(arrayProblems.secondSmallestNumber(nums));

    }
}