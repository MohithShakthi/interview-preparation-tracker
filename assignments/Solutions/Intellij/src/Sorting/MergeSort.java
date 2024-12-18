package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {243,565,12,5663,975,2,562,23,63,83,8734,23,6,2};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void  mergeSort(int[] arr){
        int length = arr.length;
        if(length <= 1) return;
        int mid = length/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new  int[length-mid];
        int i=0,j=0,k=0;
        while (k<length){
            if(i<mid){
                leftArr[i] = arr[k];
                i++;
            }else {
                rightArr[j] = arr[k];
                j++;
            }
            k++;
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }
    public static void merge(int[] left, int[] right, int[] arr){
        int lsize = left.length;
        int rsize = right.length;
        int l=0,r=0,i=0;
        while (l<lsize && r<rsize){
            if(left[l] < right[r]){
                arr[i] = left[l];
                l++;
            }else {
                arr[i] = right[r];
                r++;
            }
            i++;
        }
        while (l<lsize){
            arr[i] = left[l];
            l++;
            i++;
        }
        while (r<rsize){
            arr[i] = right[r];
            r++;
            i++;
        }
    }
}
