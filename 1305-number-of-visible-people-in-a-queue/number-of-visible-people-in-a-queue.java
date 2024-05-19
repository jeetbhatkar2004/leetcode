class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int i = heights.length-1;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[heights.length];
        while(i >= 0){
            int temp = 0;
            while(stack.isEmpty() == false && heights[i] > stack.peek()){
                stack.pop();
                temp++;
            }
            if (stack.isEmpty() == false){
                temp++;
            }

            result[i] = temp;
            
            stack.push(heights[i]);
            i--; 

        }
        return result;
    }
}