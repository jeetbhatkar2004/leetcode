class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(i < nums.length){
            if(map.containsKey(nums[i])){
                int temp = map.get(nums[i]);
                temp++;
                map.put(nums[i], temp);
            }
            else{
                map.put(nums[i], 1);
            }
            while(j < nums.length && map.containsKey(0) && map.get(0) > 1){
                int temp = map.get(nums[j]);
                temp--;
                if(temp == 0){
                    map.remove(nums[j]);
                }
                else{
                    map.put(nums[j], temp);
                }
                j++;
            }
            max = Math.max(max, i - j + 1);
            i++;
        }
        return max;
        
    }
}