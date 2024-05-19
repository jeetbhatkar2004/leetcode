class Solution {
    public boolean find132pattern(int[] nums) {
        int i = nums.length-1;
        Stack<Integer> stack = new Stack<>();
        int curr = Integer.MIN_VALUE;
        while(i >= 0){
            if(nums[i] < curr){
                return true;
            }
            while(stack.isEmpty() == false && nums[i] > stack.peek()){
                curr = stack.pop();
            }
            stack.push(nums[i]);
            i--;
        }
        return false;

        
    }
}