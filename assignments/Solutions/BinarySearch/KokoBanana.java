package assignments.Solutions.BinarySearch;

public class KokoBanana {
    public static void main(String[] args) {
        int[] nums = {805306368,805306368,805306368}; // this input is an edge case
        int h = 1000000000;
        System.out.println(minEatingSpeed(nums, h)); // op = 3
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
         
         int s = 1;
         int e = max;
         while(s<=e){
            int mid = s+(e-s)/2;
            long totalTime = findTotalTime(piles, mid);
            if(totalTime <= h) e = mid-1;
            else s = mid+1;
         }
         return s;
    }
    public static long findTotalTime(int[] nums, int perH){
        long sum = 0;
        for(int n : nums){
            //sum += (n + perH - 1) / perH;
            sum = sum + (long)Math.ceil((double)n/(double)perH);
        }
        return sum;
    }
}
