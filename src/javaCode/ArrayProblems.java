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

    public void leftRotation(int[] nums, int rotation) {
        for (int i = 0; i < rotation; i++) {
            int j, first = nums[0];
            for (j = 0; j < nums.length - 1; j++) {
                nums[j] = nums[j + 1];
            }
            nums[j] = first;
        }

        System.out.println(Arrays.toString(nums));
    }

    public void rightRotation(int[] nums,int rotation){
        for (int i = 0; i < rotation; i++) {
            int j, last = nums[nums.length-1];
            for (j = nums.length-1; j >0; j--) {
                nums[j] = nums[j-1];
            }
            nums[j] = last;
        }
        System.out.println(Arrays.toString(nums));
    }
}
