package javaCode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayProblems arrayProblems = new ArrayProblems();
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,23,43,111,533,124,1,50,-12,456};
        System.out.println("original array :  "+ Arrays.toString(nums));
        System.out.println("largest Element");
        System.out.println(arrayProblems.largestElementOfArray(nums));
        System.out.println("smallest Element");
        System.out.println(arrayProblems.smallestElementOfArray(nums));

    }
}