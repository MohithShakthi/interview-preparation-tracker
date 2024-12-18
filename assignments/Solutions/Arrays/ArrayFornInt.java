// https://leetcode.com/problems/add-to-array-form-of-integer/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> l=new ArrayList<>();
        for(int i=num.length-1;i>=0;i--){
            int sum=num[i]+k;
            int r=sum%10;
            k=sum/10;
            l.add(0,r);
        }
        while(k>0){
            int e=k%10;
            l.add(0,e);
            k=k/10;
        }
        return l;
    }
}