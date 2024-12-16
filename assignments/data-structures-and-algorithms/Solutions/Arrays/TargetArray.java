import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            target.add(index[i],nums[i]);
        }
        int[] result = new int[nums.length];
        int i=0;
        for(int n : target){
            result[i] = n;
            i++;
        }
        return result;
    }
}