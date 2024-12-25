public class MedianInRowSortedMatrix {
    public static void main(String[] args) {
        int[][] nums = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        System.out.println(median(nums));
    }
    public static int median(int mat[][]) {
        int s = Integer.MAX_VALUE;
        int e = Integer.MIN_VALUE;

        for(int i=0; i<mat.length; i++){
            s = Math.min(s, mat[i][0]);
            e = Math.max(e, mat[i][mat[i].length-1]);
        }

        int desired = (mat.length * mat[0].length + 1) / 2;

        while(s <= e){
            int mid = s+(e-s)/2;
            int occurance = occuranceCount(mat,mid);
            if(occurance < desired) s = mid+1;
            else e = mid-1;
        }
        return s;
    }
    public static int occuranceCount(int[][] mat, int key){
        int count = 0;
        for(int i=0; i<mat.length; i++){
            count = count + upperBound(mat[i], key);
        }
        return count;
    }
    public static int upperBound(int[] nums, int key){
        int s = 0;
        int e = nums.length-1;
        int ans = nums.length;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] <= key){
                s = mid+1;
            }else{
                ans = mid;
                e = mid-1;
            }
        }
        return ans;
    }
}