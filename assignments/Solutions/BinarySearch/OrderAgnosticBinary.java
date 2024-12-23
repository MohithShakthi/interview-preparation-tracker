package assignments.Solutions.BinarySearch;

public class OrderAgnosticBinary {
    public static void main(String[] args) {
        //int[] nums = {1,2,4,6,5,8,65,76,100};
        int[] nums = {100,67,45,37,29,22,17,15,13,8,5,3,2,1,0};
        System.out.println(binary(nums,13));
    }
    public static int binary(int[] nums, int k){
        int s = 0;
        int e = nums.length-1;
        boolean isAsce = nums[s] < nums[e];
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] == k) return mid;
            if(isAsce){
                if(k > nums[mid]) s = mid+1;
                else e = mid-1;
            }
            else{
                if(k > nums[mid]) e = mid-1;
                else s = mid+1;
            }
        }
        return -1;
    }
}
