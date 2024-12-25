package assignments.Solutions.Sorting;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums))); // [2,3]
    }
    public static int[] findErrorNums(int[] nums) {
        cycleSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                return new int[]{nums[i], i+1};
            } 
        }
        return new int[]{-1,-1};
    }
    public static void cycleSort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] -1;
            if(nums[i] != nums[correctIndex]){
                swap(i,correctIndex,nums);
            }else{
                i++;
            }
        }
    }
    public static void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
