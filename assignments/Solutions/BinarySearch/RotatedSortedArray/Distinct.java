package assignments.Solutions.BinarySearch.RotatedSortedArray;


public class Distinct{
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
        
    }
    public static int search(int[] nums, int target) {
        int pivote = findPivote(nums);
        if(pivote == -1) return binarySearch(nums, target,0,nums.length-1);
        if(nums[pivote] == target) return pivote;
        if(target >= nums[0]) return binarySearch(nums,target,0,pivote-1);
        else return binarySearch(nums,target,pivote+1,nums.length-1);
    }
    public static int findPivote(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid < e && arr[mid] > arr[mid+1]) return mid;
            if(mid > s && arr[mid-1] > arr[mid]) return mid-1;
            if(arr[s] > arr[mid]) e = mid-1;
            else s = mid+1;
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int k, int s, int e){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(k > arr[mid]) s = mid+1;
            else if(k < arr[mid]) e = mid-1;
            else return mid;
        }
        return -1;
    }
}