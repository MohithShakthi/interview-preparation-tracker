package assignments.Solutions.BinarySearch.RotatedSortedArray;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        // int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        System.out.println(search(nums, target));
        
    }
    public static boolean search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target) return true;
            else if(nums[s] < nums[mid]){ // left portion
                if(target < nums[mid] && target >= nums[s]) e = mid-1;
                else s = mid+1;
            }
            else if(nums[s] > nums[mid]){ // right portion
                if(target > nums[mid] && target <= nums[e]) s = mid+1;
                else e = mid-1;
            }
            else s++;
        }
        return false;
    }
}
