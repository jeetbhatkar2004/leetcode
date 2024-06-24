class Solution {
    boolean samesign(int i, int j){
        if (i > 0 && j < 0){
            return true;
        }
        return false;
    }
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i < asteroids.length){
            if(!stack.isEmpty() && samesign(stack.peek(), asteroids[i])){
                if(Math.abs(asteroids[i]) > Math.abs(stack.peek())){
                    stack.pop();
                    continue;
                }
                if(Math.abs(asteroids[i]) == Math.abs(stack.peek())){
                    stack.pop();
                    i++;
                    continue;
                }
                else{
                    i++;
                    continue;
                }
            }
            else{
                stack.push(asteroids[i]);
                i++;
            }
        }
        int[] result = new int[stack.size()];
        for(int j = stack.size() - 1; j >= 0; j--){
            result[j] = stack.pop();
        }
        return result;
    }
}