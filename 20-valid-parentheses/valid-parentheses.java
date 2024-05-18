class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < s.length()){
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
            stack.add(s.charAt(i));
        }
        else{
            if (stack.isEmpty()){
                return false;
            }
            if (s.charAt(i) == ')' && stack.peek() != '('){
                return false;
            }
            if (s.charAt(i) == ']' && stack.peek() != '['){
                return false;
            }
            if (s.charAt(i) == '}' && stack.peek() != '{'){
                return false;
            }
            stack.pop();
        }
        i++;

    }
        return stack.isEmpty();
}}