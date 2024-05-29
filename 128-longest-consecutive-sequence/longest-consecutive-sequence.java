class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        int i = 0;
        while(i < nums.length){
            hash.add(nums[i]);
            i++;
        }
        i = 0;
        int count = 0;
        int result = 0;
        while(i < nums.length){
            count = 0;
            int temp = nums[i];
            if(hash.contains(temp - 1) == false){
                while(hash.contains(temp)){
                    temp++;
                    count++;
                }
                result = Math.max(result, count);
            }
            i++;
        }
        return result;
        
        
    }
}