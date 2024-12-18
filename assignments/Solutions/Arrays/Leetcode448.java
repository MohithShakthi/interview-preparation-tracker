//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//448. Find All Numbers Disappeared in an Array


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i] -1;
            if(!(nums[i] == nums[correct])){
                swap(i,nums[i]-1,nums);
            }else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                list.add(j+1);
            }
        }
        return list;
    }
    public void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}