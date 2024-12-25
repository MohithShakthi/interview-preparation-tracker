package assignments.Solutions.Sorting;

public class FindTheDuplicates {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums)); // op = 3
    }
    public static int findDuplicate(int[] nums) {
        cycleSort(nums);
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1) return nums[i];
        }
        return count;
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
