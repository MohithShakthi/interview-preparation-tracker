package assignments.Solutions.BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] nums = {2, 12, 11, 3, 26, 7};
        int k =5;
        System.out.println(aggressiveCows2(nums, k)); // op = 3
    }
    public static int aggressiveCows2(int[] stalls, int k){
        Arrays.sort(stalls);
        int start = 1;
        int end = stalls[stalls.length-1];
        while(start <= end){
            int mid = start+(end-start)/2;
            int cowCount = findCowCount(stalls,mid);
            if(cowCount >= k) start = mid+1;
            else end = mid-1;
        }
        return end;
    }
    public static int findCowCount(int[] nums, int dist){
        int cowCount =1;
        int last = nums[0];
        for(int n : nums){
            if(n-last >= dist){
                cowCount++;
                last = n;
            }
        }
        return cowCount;
    }
    public static int aggressiveCows1(int[] stalls, int k) {
        Arrays.sort(stalls);
        int min = 1;
        int max = stalls[stalls.length-1];
        int result = findMaxPossibleMinDist(stalls,max,k);
        return result;
    }
    public static int findMaxPossibleMinDist(int[] nums,int maxDist,int cows){
        int ans = 1;
        for(int i=0; i<=maxDist; i++){
            int cowCount = 1;
            int last = nums[0];
            for(int n : nums){
                if(n-last >= i){
                    last = n;
                    cowCount++;
                    if(cowCount == cows){
                        break;
                    }
                }
            }
            if(cowCount == cows){
                ans = i;
            }else{
                return ans;
            }
        }
        return ans;
    }
}
