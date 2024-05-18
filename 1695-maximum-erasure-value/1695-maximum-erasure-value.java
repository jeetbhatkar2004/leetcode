class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int curr = 0;
        int max = 0;

        while (j < nums.length) {
            if (!set.contains(nums[j])) {
                curr += nums[j];
                set.add(nums[j]);
                j++;
                max = Math.max(curr, max);
            } else {
                curr -= nums[i];
                set.remove(nums[i]);
                i++;
            }
        }

        return max;
    }
}
