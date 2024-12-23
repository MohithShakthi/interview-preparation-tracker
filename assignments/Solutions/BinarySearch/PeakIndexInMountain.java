package assignments.Solutions.BinarySearch;

public class PeakIndexInMountain {
    public static void main(String[] args) {
        int[] nums = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(nums));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int index = findPeak(arr);
        return index;
    }
    public static int findPeak(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<e){ // if s<=e and e = mid+1; time limit is exeded;
            int mid = s + (e-s)/2;
            if(arr[mid] > arr[mid+1])  e = mid;
            else s = mid+1;
        }
        return s;
    }
}
