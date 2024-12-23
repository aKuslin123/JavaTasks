package com.example.javatasks.expressInterviewTasks.hw.hw5;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {4,3,1,5,4};
        int target = 9;

        twoSum(nums, target);
    }

    public static void twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    System.out.println(j + "," + i);
                }
                break;
            }
        }
    }
}
