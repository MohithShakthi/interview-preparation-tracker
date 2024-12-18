package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {243,565,12,5663,975,2,562,23,63,83,8734,23,6,2};
        insertionSort1(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static  void insertionSort1(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while (j >=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
