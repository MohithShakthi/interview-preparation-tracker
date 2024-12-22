package Searching;

import java.util.Scanner;

public class LineraSearch {
    public static void main(String[] args) {
        int[] nums = {1,45,5654,24,783,34,63,45};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == key){
                System.out.println("key found at index: "+i);
                return;
            }
        }
        System.out.println("key not found");
    }
}
