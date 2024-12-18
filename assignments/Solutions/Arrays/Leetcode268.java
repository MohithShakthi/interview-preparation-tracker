//Missing Number
// https://leetcode.com/problems/missing-number/


class Solution {
    public int missingNumber(int[] nums) {
        cycleSort(nums);
        for(int n: nums) System.out.print(n+" ");
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i) return i;
        }
        return nums.length;
    }
    public static void cycleSort(int[] arr){
…    }
}