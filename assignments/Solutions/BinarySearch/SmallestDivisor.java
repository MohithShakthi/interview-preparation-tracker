// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/submissions/1486782156/

package assignments.Solutions.BinarySearch;

public class SmallestDivisor {
    public static void main(String[] args) {
        int[] nums = {21212,10101,12121};//op=1 //{44,22,33,11,1};op=44  //{1,2,5,9}; op=5
        int threshold = 1000000; //5; //6;
        System.out.println(smallestDivisor(nums, threshold));
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        long max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
        }

        long start = 1;
        long end = max;
        while(start <= end){
            long mid = start+(end-start)/2;
            int total = sum(nums,mid);
            if(total <= threshold) end = mid-1;
            else start = mid+1;
        }
        return (int)start;
    }
    public static int sum(int[] nums, long divisor){
        double total  = 0;
        for(int num : nums){
            total = total + Math.ceil((double)num/divisor);
        }
        return (int)total;
    }
}
