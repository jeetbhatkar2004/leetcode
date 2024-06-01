class Solution {
    public int scoreOfString(String s) {
        int curr = 0;
        for (int i = 0; i < s.length() -1; i++){
            curr = curr + Math.abs(((int) s.charAt(i)) - ((int )s.charAt(i+1)));
        }
        return curr;
        
    }
}