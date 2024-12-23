package assignments.Solutions.BinarySearch;

import java.util.Arrays;

public class CeilAndFloor {
    public static void main(String[] args) {
        int[] nums = {5, 6, 8, 9, 6, 5, 5, 6};
        int x = 7;
        System.out.println(Arrays.toString(getFloorAndCeil(x, nums))); // op [6,8]
    }
    public static int[] getFloorAndCeil(int x, int[] arr) {
        int[] res = {-1,-1};
        Arrays.sort(arr);
        int f = binary(arr,x,true);
        if(f != -1) res[0] = arr[f];
        int c = binary(arr,x,false);
        if(c != -1) res[1] = arr[c];
        return res;
    }
    public static int binary(int[] arr, int k, boolean isFloor){
        int ans = -1;
        int s =0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == k) return mid;
            else if(k >arr[mid]) s = mid+1;
            else e = mid-1;
        }
        if(isFloor && e>=0) ans = e;
        else if(!(isFloor) && s<arr.length) ans = s;
        return ans;
    }
}
