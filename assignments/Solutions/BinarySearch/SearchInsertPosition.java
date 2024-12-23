package assignments.Solutions.BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target)); // op 4
        
    }
    public static int searchInsert(int[] nums, int target) {
        int[] res = binary(nums,target);
        if(res[0] != -1) return res[0];
        return res[1];
    }
    public static int[] binary(int[] arr, int k){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == k){
                return new int[]{mid,mid};
            }
            else if(k > arr[mid]) s= mid+1;
            else e= mid-1;
        }
        return new int[]{-1,s};  // s or e+1 both or same
    }
}
