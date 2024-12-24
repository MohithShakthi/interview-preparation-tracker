package assignments.Solutions.BinarySearch;

import java.util.ArrayList;

public class BookAllocation {
    public static void main(String[] args) {
        int[] list = {25,46,28,49,24};
        int n = list.length;
        int m = 4;
        System.out.println(findPages1(list, n, m));
        
    }
    public static int findPages1(int[] arr, int n, int m){
        if(m>n) return -1;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : arr){
            max = Math.max(max, num);
            sum = sum+num;
        }
        int start = max;
        int end = sum;
        while(start<=end){
            int mid = start+(end-start)/2;
            int noStud = findNoOfStudents(arr,mid);
            if(noStud <= m) end = mid-1;
            else start = mid+1;
        }
        return start;
    }
    public static int findNoOfStudents(int[] nums, int maxPage){
        int noStud = 1;
        int sum = 0;
        for(int num : nums){
            if((sum+num) <= maxPage){
                sum = sum+num;
            }else{
                sum = num;
                noStud++;
            }
        }
        return noStud;
    }

    public static int findPages(int[] arr, int n, int m) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : arr){
            max = Math.max(max, num);
            sum = sum+num;
        }
        int result = minPages(arr,max,sum,m);
        return result;
    }
    public static int minPages(int[] nums, int min, int max, int stud){
        for(int i=min; i<=max; i++){
            int studCount = 1;
            int sum = 0;
            for(int num : nums){
                if((sum+num) <= i){
                    sum = sum+num;
                }else{
                    sum = num;
                    studCount++;
                }
            }
            if(studCount == stud) return i;
        }
        return -1;
    }
}
