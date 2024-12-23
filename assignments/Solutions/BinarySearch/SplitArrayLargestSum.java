package assignments.Solutions.BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k=2;
        System.out.println(splitArray(nums, k));
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        
        for(int n : nums){
            start = Math.max(start, n);
            end = end + n;
        }
        System.out.println(start +" "+ end);

        // binary Search for potential answers

        while(start <= end){ // when start is equal to end we get our answer
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for(int n : nums){
                if(sum + n > mid){
                    pieces++;
                    sum = n;
                } 
                else sum = sum + n;
            }

            if(pieces > k) start = mid+1;
            else end = mid-1;


        }
        return start;

    }
}
