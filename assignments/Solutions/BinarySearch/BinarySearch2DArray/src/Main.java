import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*  Row Wise & Column Wise Sorted Array
        {
        {10,20,30,40},
        {11,23,31,42},
        {15,26,35,45},
        {18,27,36,50}
        }
         */
        int[][] nums = {
                {10,20,30,40},
                {11,23,31,42},
                {15,26,35,45},
                {18,27,36,50}
        };
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(Arrays.toString(findTarget(nums,target)));
    }
    public static int[] findTarget(int[][] nums,int target){
        int r = 0;
        int c = nums[0].length-1;

        while(r < nums.length && c >= 0){
            if(nums[r][c] == target) return new int[]{r,c};
            else if(target < nums[r][c]) c--;
            else r++;
        }
        return new int[]{-1,-1};
    }
}