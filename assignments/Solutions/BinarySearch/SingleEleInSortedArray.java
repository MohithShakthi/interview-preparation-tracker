package assignments.Solutions.BinarySearch;

public class SingleEleInSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];
        return nums[findSingleEle(nums)];
    }
    public static int findSingleEle(int[] nums){
        int s = 1;
        int e = nums.length-2;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]) return mid;
            else if((mid%2 == 0 && nums[mid] == nums[mid+1]) || (mid%2 == 1 && nums[mid] == nums[mid-1])){
                // in left half search in right half
                s=mid+1;
            }
            else{
                e=mid-1;
            } 
        }
        return -1;
    }
}
