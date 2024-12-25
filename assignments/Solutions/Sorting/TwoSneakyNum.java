package assignments.Solutions.Sorting;

import java.util.Arrays;

public class TwoSneakyNum {
    public static void main(String[] args) {
        int[] nums = {7,1,5,4,3,4,6,0,9,5,8,2};
        System.out.println(Arrays.toString(getSneakyNumbers(nums))); // [4,5]
    }
    public static int[] getSneakyNumbers(int[] nums) {
        cycleSort(nums);
        int count = 0;
        int[] list = new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i && count <=1){
                list[count] = nums[i];
                count++;
            }
        }
        return list;
    }
    public static void cycleSort(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i];
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
