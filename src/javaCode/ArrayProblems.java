package javaCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

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

    public void rightRotation(int[] nums, int rotation) {
        for (int i = 0; i < rotation; i++) {
            int j, last = nums[nums.length - 1];
            for (j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[j] = last;
        }
        System.out.println(Arrays.toString(nums));
    }

    public void elementAtEvenPosition(int[] nums) {
        for (int i = 0; i < nums.length; i += 2) {
            System.out.print(nums[i] + "  ");
        }
    }

    public void elementAtOddPosition(int[] nums) {
        for (int i = 1; i < nums.length; i += 2) {
            System.out.print(nums[i] + "  ");
        }
    }

    public int largestElementOfArray(int[] nums) {
        int max = nums[0];
        for (int num : nums)
            if (max < num)
                max = num;
        return max;
    }

    public int smallestElementOfArray(int[] nums) {
        int min = nums[0];
        for (int num : nums)
            if (min > num)
                min = num;
        return min;
    }

    public int sumOfAllElement(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;
        return sum;
    }

    public int productOfAllElement(int[] nums) {
        int product = 1;
        for (int num : nums)
            product *= num;
        return product;
    }

    public void printAllDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print(map.get(key) + " ");
            }
        }
    }

    public void removeDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        System.out.println(set);
    }

    public int secondLargestNumber(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 2];
    }

    public int secondSmallestNumber(int[] nums) {
        Arrays.sort(nums);
        return nums[1];
    }
}
