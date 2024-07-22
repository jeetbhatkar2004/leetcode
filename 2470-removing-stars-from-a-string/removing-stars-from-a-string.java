class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                i++;
            }
            else{
                stack.push(s.charAt(i));
                i++;
            }
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        result.reverse();
        return result.toString();
    }
}