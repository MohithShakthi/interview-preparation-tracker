import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrarListToArrays{
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        int[] a1 = {1,0};
        int[] a2 = {0,1};
        int[] a3 = {2,0};
        int[] a4 = {0,2};
        int[] a5 = {0,0};
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        int[][] arr = list.toArray(new int[list.size()][2]);
        for(int [] n:arr){
            System.out.print(Arrays.toString(n)+ " ");
        }
        System.out.println(arr.length +"   "+ arr[0].length);
    }
}
