package Arrays2D;

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum=sum+mat[i][i];
        }
        int add=0;
        for(int i=mat.length-1;i>=0;i--){
            int j=mat.length-1-i;
            if(i==j){continue;}
            add=add+mat[i][j];
        }
        int s=sum+add;
        return s;
    }
}
