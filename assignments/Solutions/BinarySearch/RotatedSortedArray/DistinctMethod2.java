package assignments.Solutions.BinarySearch.RotatedSortedArray;

public class DistinctMethod2 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
        
    }
    public static int search(int[] nums, int target) {
        return binary(nums,target);
    }
    public static int binary(int[] arr, int k){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == k) return mid;
            if(arr[s] <= arr[mid]){ // checking if left half is sorted or not
                if(k >= arr[s] && k < arr[mid]) e = mid-1; // searching in left half
                else s = mid+1;
            }else{ // checking if right half is sorted or not
                if(k > arr[mid] && k <= arr[e]) s = mid+1; // searching in right half
                else e = mid-1;
            }
        }
        return -1;
    }
}
