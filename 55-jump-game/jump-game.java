class Solution {
    public boolean canJump(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        arr[0] = true;
        int i = 0;
        while(i < nums.length){
            if(arr[i]){
                int max = Math.min(i + nums[i], nums.length - 1);
                for(int j = i + 1; j <= max; j++){
                    arr[j] = true;
                }
            }
            i++;
        }
        return arr[nums.length - 1];
}}
