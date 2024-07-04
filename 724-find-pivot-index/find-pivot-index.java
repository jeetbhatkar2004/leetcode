class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int curr = 0;
        for(int i = 0; i < nums.length; i++){
            prefix[i] = curr;
            curr = curr + nums[i];
        }
        curr = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            suffix[i] = curr;
            curr = curr + nums[i];
        }
        int suffixpointer = 0;
        int prefixpointer = 0;
        while(suffixpointer < nums.length){
            if(suffix[suffixpointer] == prefix[prefixpointer]){
                return suffixpointer;
            }
            suffixpointer++;
            prefixpointer++;
        }
        return -1;
    }
}