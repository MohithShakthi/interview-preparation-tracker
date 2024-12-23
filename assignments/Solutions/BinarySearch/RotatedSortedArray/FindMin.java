package assignments.Solutions.BinarySearch.RotatedSortedArray;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int index = findPivote(nums);
        if(index == -1) return nums[0];
        return nums[index+1];
    }
    public static int findPivote(int[] nums){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid < e && nums[mid] > nums[mid+1]) return mid;
            else if(mid > s && nums[mid] < nums[mid-1]) return mid-1;
            else if(nums[s] > nums[mid]) e = mid-1;
            else s = mid+1;
        }
        return -1;
    }
}
