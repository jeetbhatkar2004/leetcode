class Solution {
    class Pair{
        int value;
        int index;
        Pair(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        Stack<Pair> stack = new Stack<>();
        int i = 0;
        while(i < nums.length){
            while(!stack.isEmpty() && nums[i] > stack.peek().value){
                Pair temp = stack.pop();
                result[temp.index] = nums[i];
            }
            stack.add(new Pair(nums[i], i));
            i++;
        }
        i = 0;
        while(i < nums.length){
            while(!stack.isEmpty() && nums[i] > stack.peek().value){
                Pair temp = stack.pop();
                result[temp.index] = nums[i];
            }
            i++;
        }
        return result;
    }
}