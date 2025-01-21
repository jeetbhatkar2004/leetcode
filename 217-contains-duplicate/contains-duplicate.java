import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while(i < nums.length ){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            i++;
        }
        return false;


}}