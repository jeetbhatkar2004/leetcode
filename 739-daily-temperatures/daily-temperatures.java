class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        int i = 0;
        while(i < temperatures.length){
            while(stack.isEmpty() == false && temperatures[stack.peek()] < temperatures[i] ){
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
            i++;
        }
        return result;
    }
}