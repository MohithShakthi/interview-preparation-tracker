package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {243,565,12,5663,975,2,562,23,63,83,8734,23,6,2};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void bubbleSort(int[] arr){
        boolean flag;
        for(int i=0;i<arr.length-1;i++){
            flag = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) return;
        }
    }
}
