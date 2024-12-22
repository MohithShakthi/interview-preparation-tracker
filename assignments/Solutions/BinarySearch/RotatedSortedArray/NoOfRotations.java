package assignments.Solutions.BinarySearch.RotatedSortedArray;

import java.util.List;

class Solution {
    public int findKRotation(List<Integer> arr) {
        int p = findPivote(arr);
        if(p == -1) return 0;
        return p+1;
    }
    public int findPivote(List<Integer> arr){
        int s=0;
        int e=arr.size()-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid < e && arr.get(mid) > arr.get(mid+1)) return mid;
            else if(mid > s && arr.get(mid) < arr.get(mid-1)) return mid-1;
            else if(arr.get(s) > arr.get(mid)) e = mid+1;
            else s = mid+1;
        }
        return -1;
    }
}
