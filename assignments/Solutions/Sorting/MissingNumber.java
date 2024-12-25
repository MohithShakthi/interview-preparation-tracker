package assignments.Solutions.Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums)); // op = 8
        
    }
    public static int missingNumber(int[] nums) {
        cycleSort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i) return i;
        }
        return nums.length;
    }
    public static void cycleSort(int[] nums){
        int i = 0;
        while(i<nums.length){
            if(nums[i] < nums.length && nums[i] != i){
                swap(i,nums[i],nums);
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
