package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {243,565,12,5663,975,2,562,23,63,83,8734,23,6,2};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static  void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[min] > arr[j]) min = j;
            }
            int temp =arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
