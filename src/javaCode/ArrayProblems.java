package javaCode;

import java.util.Arrays;

public class ArrayProblems {
    public void copyArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        System.out.println("Original Array :- " + Arrays.toString(nums));
        System.out.println("Copied Array   :- " + Arrays.toString(arr));
    }
}
