class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
            d=(int)Math.log10(nums[i])+1;
            if(d%2==0){
                c++;
            }
        }
        return c;
    }
}