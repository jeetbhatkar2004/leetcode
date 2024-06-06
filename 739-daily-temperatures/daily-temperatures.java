class Solution {
    class Pair{
        int val;
        int index;
        Pair(int val, int index){
            this.val = val;
            this.index = index;
        }
    }
    public int[] dailyTemperatures(int[] temperatures) {
            int i = 0;  
            int[] result = new int[temperatures.length];
            Arrays.fill(result, 0);
            Stack<Pair> stack = new Stack<>();
            while(i < temperatures.length){
                while(!stack.isEmpty() && stack.peek().val < temperatures[i]){
                    Pair curr = stack.pop();
                    result[curr.index] = i - curr.index;
                }
                Pair add = new Pair(temperatures[i], i);
                stack.push(add);
                i++;
            }
            return result;
    }   
}