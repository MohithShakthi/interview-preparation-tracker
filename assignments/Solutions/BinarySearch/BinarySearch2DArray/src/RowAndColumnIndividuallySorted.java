import java.util.Arrays;
import java.util.Scanner;

public class RowAndColumnIndividuallySorted {
    public static void main(String[] args) {
        int[][] nums = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(Arrays.toString(findTarget(nums,target)));
    }

    public static int[] findTarget(int[][] nums, int target) {
        int r = 0;
        int c = nums[0].length-1;
        while(r < nums.length && c >=0){
            if(target == nums[r][c]) return new int[]{r,c};
            else if(nums[r][c] < target) r++;
            else c--;
        }
        return new int[]{-1,-1};
    }
}
