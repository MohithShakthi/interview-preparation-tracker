package Searching;

public class SearchBinary {
    public static void main(String[] args) {
        int[] arr = new int[1000001];

        for(int i=0;i<arr.length;i++){
            arr[i] = i;
        }
        int key = 300;
        int index = binarySearch(arr, key);
        if(index == -1){
            System.out.println("key not found");
        }else {
            System.out.println("key found at index:"+index);
        }
    }
    static  int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length -1;
        int count = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key){
                System.out.println(count);
                return mid;
            }
            else if(key > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
            count++;
        }
        System.out.println(count);
        return -1;
    }
}
