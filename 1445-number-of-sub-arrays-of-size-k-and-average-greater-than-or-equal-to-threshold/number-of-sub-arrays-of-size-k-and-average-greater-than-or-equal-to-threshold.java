class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int result = 0;
        int i = 0;
        int j = 0;
        int curr = 0;
        while(j < k){
            curr = curr + arr[j];
            j++;
        }
        double average = curr / k;
        if(average >= threshold){
            result++;
        }
        while(j < arr.length){
            average = average - (((double )arr[i])/k);
            average = average + (((double) arr[j])/k);
            i++;
            j++;
            if(average >= threshold){
                result++;
            }
        }
        return result;
        
    }
}