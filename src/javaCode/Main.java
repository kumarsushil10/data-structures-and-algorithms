package javaCode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayProblems arrayProblems = new ArrayProblems();
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("original array :  "+ Arrays.toString(nums));
        System.out.println("Element at even position");
        arrayProblems.elementAtEvenPosition(nums);
        System.out.println("\nElement at odd position");
        arrayProblems.elementAtOddPosition(nums);

    }
}