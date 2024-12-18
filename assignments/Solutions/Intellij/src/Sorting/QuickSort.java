package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {243,565,12,5663,975,2,562,23,63,83,8734,23,6,2};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quickSort(int[] arr, int s, int e){
        if(e <= s) return;
        int i = s-1;
        int pivote = e;
        for(int j=s;j<e;j++){
            if(arr[j] < arr[pivote]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[pivote];
        arr[pivote] = temp;
        pivote = i;
        quickSort(arr,s,pivote-1);
        quickSort(arr, pivote+1,e);
    }
}
