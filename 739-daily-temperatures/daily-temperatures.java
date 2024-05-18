import java.util.AbstractMap;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        int i = 0;
        while( i < temperatures.length){
            while(stack.isEmpty() == false && stack.peek().getKey() < temperatures[i]){
                int index = stack.pop().getValue();
                result[index] = i-index;
            }
            Map.Entry<Integer, Integer> curr = new AbstractMap.SimpleEntry<>(temperatures[i], i);
            stack.push(curr);
            i++;
        }
        return result;
    }
}