class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> set = new HashMap<>();
        int i = 0;
        int res = 0;
        while(i < nums.length){
            if(set.containsKey(k - nums[i])){
                res++;
                int temp = set.get(k - nums[i]) - 1;
                if(temp == 0){
                    set.remove(k - nums[i]);
                }
                else{
                    set.put(k - nums[i], temp);
                }
            }   
            else if(set.containsKey(nums[i])){
                int temp = set.get(nums[i]) + 1;
                set.put(nums[i], temp);
            }
            else if (!set.containsKey(nums[i])){
                set.put(nums[i], 1);
            }
            i++;
        }
        return res;

    }
}