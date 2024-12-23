package assignments.Solutions.BinarySearch;

public class NoOFOccurance {
    public static void main(String[] args) {
        int[] nums = {8, 9, 10, 12, 12, 12};
        System.out.println(countFreq(nums, 12));
        
    }
    public static int countFreq(int[] arr, int target) {
        int f = binary(arr,target,true);
        int l = binary(arr,target,false);
        if(f == -1 && l == -1) return 0;
        return l-f+1;
    }
    public static int binary(int[] nums, int k, boolean isFirst){
        int s=0;
        int e=nums.length-1;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;        
            if(nums[mid] == k){
                ans = mid;
                if(isFirst) e = mid-1;
                else s = mid+1;
            }
            else if(k > nums[mid]) s = mid+1;
            else e = mid-1;
        }
        return ans;
    }
}
