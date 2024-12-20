// https://leetcode.com/problems/lucky-numbers-in-a-matrix/submissions/1482705661/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            int col=0;
            for(int j=0;j<matrix[i].length;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                    col=j;
                }
            }
            boolean is=true;
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][col]<matrix[j][col]){
                    is=false;
                    break;
                }
            }
            if(is){
                list.add(matrix[i][col]);
            }
        }
        return list;
    }
}
