class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i = 0;
        List<String> result = new ArrayList<>();
        if(nums.length == 0){
            return result;
        }
        while(i < nums.length){
            int temp = nums[i];
            while(i + 1 < nums.length && nums[i]== nums[i+1] -1){
                i++;
            }
            if(nums[i] == temp){
                result.add(nums[i] + "");
            }
            else{
                result.add(temp + "->" + nums[i]);
            }
            i++;
            
        }
        return result;
        
    }
}