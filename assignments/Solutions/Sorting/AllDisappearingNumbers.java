package assignments.Solutions.Sorting;

import java.util.ArrayList;

import java.util.List;

public class AllDisappearingNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums)); //[5,6]
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        cycleSort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                list.add(i+1);
            }
        }
        return list;
    }
    public static void cycleSort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
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
