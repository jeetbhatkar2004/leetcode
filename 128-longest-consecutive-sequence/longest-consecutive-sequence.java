class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int curr = 0;
        int max = 0;
        int i = 0;
        while(i < nums.length){
            if(set.contains(nums[i] -1)){
                i++;
                continue;
            }
            curr = 0;
            int temp = nums[i];
            while(set.contains(temp)){
                curr++;
                temp++;
            }
            max = Math.max(max, curr);
            i++;
        }
        return max;

    }
}