package javaCode;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayProblems {
    public void copyArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        System.out.println("Original Array :- " + Arrays.toString(nums));
        System.out.println("Copied Array   :- " + Arrays.toString(arr));
    }

    public void frequencyOfElementInArray(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!frequency.containsKey(num)) {
                frequency.put(num, 1);
            } else {
                frequency.put(num, frequency.get(num) + 1);
            }
        }

        System.out.println("key ==== value");
        for (int key : frequency.keySet()) {
            System.out.println(" " + key + "  ====  " + frequency.get(key));
        }
    }
}
