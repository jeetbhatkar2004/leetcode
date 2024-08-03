import java.util.Arrays;

class Solution {
    int helper2(int[] arr, int curr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < curr){ 
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
    
    int helper1(int[] arr, int curr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] <= curr){ 
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
    
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] start = new int[flowers.length];
        int[] end = new int[flowers.length];
        for(int i = 0; i < flowers.length; i++){
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int[] result = new int[people.length];
        for(int i = 0; i < people.length; i++){
            result[i] = helper1(start, people[i]) - helper2(end, people[i]);
        }
        return result;
    }
}
