package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,1,7,2,9,8,5,6,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public  static void cyclicSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i] != i+1){
                swap(i,arr[i]-1,arr);
            }else{
                i++;
            }
        }
    }
    public  static  void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
