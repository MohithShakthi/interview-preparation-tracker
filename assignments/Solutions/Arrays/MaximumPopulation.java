class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr=new int[101];
        for(int i=0;i<logs.length;i++){
            int birth=logs[i][0];
            int death=logs[i][1];
            arr[birth-1950]++;
            arr[death-1950]--;
        }
        int max=arr[0];
        int year=1950;
        for(int i=1;i<101;i++){
            arr[i]=arr[i]+arr[i-1];
            if(arr[i]>max){
                max=arr[i];
                year=1950+i;
            }
        }
        return year;
    }
}