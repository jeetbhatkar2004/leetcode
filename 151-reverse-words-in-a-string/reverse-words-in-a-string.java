class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;
        int check = 0;
        while(i >= 0){
            if(s.charAt(i) == ' ' && check == 0){
                StringBuilder curr = new StringBuilder();
                int temp = stack.size();
                for(int j = 0; j < temp ; j++){
                    curr.append(stack.pop());
                }
                result.append(curr.toString());
                result.append(" ");
                check = 1;
            }
            if(s.charAt(i) != ' '){
                stack.push(s.charAt(i));
                check = 0;
            }
            i--;
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }
}