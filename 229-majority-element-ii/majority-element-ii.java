class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> added = new HashSet<>();
        int i = 0;
        List<Integer> result = new ArrayList<>();
        int len = nums.length;
        while(i < len){
            int temp = map.getOrDefault(nums[i], 0);
            temp++;
            map.put(nums[i], temp);
            if(temp > len/3 && !added.contains(nums[i])){
                result.add(nums[i]);
                added.add(nums[i]);
            }
            i++;
        }
        return result; 
    }
}