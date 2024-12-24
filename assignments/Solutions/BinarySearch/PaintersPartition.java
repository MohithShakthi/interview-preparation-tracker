package assignments.Solutions.BinarySearch;
// https://www.naukri.com/code360/problems/painter-s-partition-problem_1089557?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
import java.util.ArrayList;

public class PaintersPartition {
    public static void main(String[] args) {
        
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int n : boards){
            max = Math.max(max, n);
            sum = sum + n;
        }
        int start = max;
        int end = sum;
        while(start <= end){
            int mid = start+(end-start)/2;
            int noPainter = findNoOfPAinter(boards, mid);
            if(noPainter <= k) end = mid-1;
            else start = mid+1;
        }
        return start;
    }
    public static int findNoOfPAinter(ArrayList<Integer> nums, int max){
        int noPainter = 1;
        int sum = 0;
        for(int n : nums){
            if((sum+n) <= max){
                sum = sum + n;
            }else{
                noPainter++;
                sum = n;
            }
        }
        return noPainter;
    }
}
