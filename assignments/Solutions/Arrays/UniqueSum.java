//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n-1;i++){
            arr[i]=i+1;
            sum=sum+i+1;
        }
        arr[n-1]=sum*(-1);
        return arr;
        
    }
}