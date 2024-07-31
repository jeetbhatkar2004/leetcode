class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while(i < nums.length){
            if(nums[i] == i + 1|| set.contains(nums[i])){
                i++;
            }
            else{
                if(nums[nums[i]-1] == nums[i]){
                    set.add(nums[i]);
                    i++;
                }
                else{
                    int temp = nums[i];
                    nums[i] = nums[nums[i]-1];
                    nums[temp-1] = temp;
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(set.contains(nums[j])){
                result.add(nums[j]);
                set.remove(nums[j]);
            }
        }
        return result;
    }
}