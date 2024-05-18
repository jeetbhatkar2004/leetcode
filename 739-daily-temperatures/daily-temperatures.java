import java.util.AbstractMap;
class Solution {
    public class Pair{
        int temp;
        int index;
        public Pair(int temp, int index){
            this.temp = temp;
            this.index = index;
        }
    }
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        int i = temperatures.length-1;
        while(i >= 0){
            while(stack.isEmpty() == false && temperatures[i] >= stack.peek().temp){
                stack.pop();
            }
            if (stack.isEmpty()){
                result[i] = 0;
            }
            else{
                int temp = stack.peek().index;
                result[i] = temp - i;
            }
            stack.push(new Pair(temperatures[i], i));
            i--;
        }

        return result;
        
        
    }
}