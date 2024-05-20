class Solution {
    class Pair{
        int temp;
        int index;
        Pair(int temp, int index){
            this.temp = temp;
            this.index = index;
        }

    }
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> stack = new Stack<>();
        int i = 0;
        int[] result = new int[temperatures.length];
        Arrays.fill(result, 0);
        while(i < temperatures.length){
            while(stack.isEmpty() == false && temperatures[i] > stack.peek().temp){
                int index = stack.pop().index;
                result[index] = i-index;
            }
            stack.push(new Pair(temperatures[i], i));
            i++;

        }
        return result;
        
        
    }
}