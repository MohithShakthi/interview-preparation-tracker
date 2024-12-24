import java.util.Arrays;
import java.util.Scanner;

public class FullySortedArray {
    public static void main(String[] args) {
        /* Fully Sorted Arrays
        {
        {1,2,3,4}
        {5,6,7,8},
        {9,10,11,13}
        }
         */

        int[][] nums = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(Arrays.toString(findIndex(nums, target)));
    }
    public static int[] findIndex(int[][] nums, int target){
        int n = nums.length;
        int m = nums[0].length;
        int start = 0;
        int end = (n*m)-1;
        while(start <= end){
            int mid = start+(end-start)/2;

            int r = mid/m;
            int c = mid%m;

            if(nums[r][c] == target) return new int[]{r,c};
            else if(nums[r][c] > target) end = mid-1;
            else start = mid+1;
        }
        return  new int[]{-1,-1};
    }
}
