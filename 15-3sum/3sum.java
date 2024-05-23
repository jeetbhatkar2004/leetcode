class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 0;
        int start = 0;
        int end = 0;
        Arrays.sort(nums);
        while(i < nums.length - 1){
            if(i > 0 && nums[i] == nums[i-1]){
                i++;
                continue;
            }
            start = i+1;
            end = nums.length - 1;
            while(start < end){
                List<Integer> curr = new ArrayList<>();
                int sum = nums[i] + nums[start] + nums[end];
                if(sum == 0){
                    curr.add(nums[i]);
                    curr.add(nums[start]);
                    curr.add(nums[end]);
                    result.add(curr);
                    while(start < end && nums[start] == nums[start + 1]){
                        start++;
                    }  
                    while(start < end && nums[end] == nums[end - 1]){
                        end--;
                    }   
                    start++;
                    end--;
                }
                if(sum > 0){
                    end--;
                }
                if(sum < 0){
                    start++;
                }
            }
            i++;
        }
        return result;

    }
}