class Solution {
    public class Pair{
        int height;
        int index;
        public Pair(int height, int index){
            this.height = height;
            this.index = index;
        }
    }
    public int[] nextSmaller(int[] heights) {
        Stack<Pair> stack = new Stack<>();
        int[] result = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < stack.peek().height) {
                int index = stack.pop().index;
                result[index] = i;
            }
            stack.push(new Pair(heights[i], i));
        }
        while (!stack.isEmpty()) {
            result[stack.pop().index] = heights.length;
        }
        return result;
    }

    public int[] prevSmaller(int[] heights) {
        Stack<Pair> stack = new Stack<>();
        int[] result = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[i] < stack.peek().height) {
                int index = stack.pop().index;
                result[index] = i;
            }
            stack.push(new Pair(heights[i], i));
        }
        while (!stack.isEmpty()) {
            result[stack.pop().index] = -1;
        }
        return result;
    }
    public int largestRectangleArea(int[] heights) {
        int[] nextsmaller = nextSmaller(heights);
        int[] prevsmaller = prevSmaller(heights);
        int[] result = new int[heights.length];
        int i = 0;
        int max = 0;
        while(i < heights.length){
            result[i] = heights[i] * (nextsmaller[i] - prevsmaller[i] -1);
            max = Math.max(result[i], max);
            i++;
        }
        return max;
        

    }

}