package assignments.Solutions.Sorting;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums)); // op = 2;
    }
    public static int firstMissingPositive(int[] nums) {
        cycleSort(nums);
        for(int i=0; i<nums.length;i++){
            if(nums[i] != i+1) return i+1;
        }
        return nums.length+1;
    }
    public static void cycleSort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] >= 0 && correctIndex >= 0 && nums[i] < nums.length &&nums[i] != nums[correctIndex]){
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
