package Sorting;

import java.util.Arrays;

public class CycleSortCorrect {
    public static void main(String[] args) {
        int[] nums = {2,4,9,6,7,1,3,8,5};
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void cycleSort(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]) swap(i, correctIndex, nums);
            else i++;
        }
    }
    public static void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
