package com.leetcode;

import java.util.Arrays;

/**
 * @author june
 */
public class MoveZeroes {
    public static int[] moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 0, 0, 6, 7, 0};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }
}
