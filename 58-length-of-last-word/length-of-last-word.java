class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s.length() < 2){
            return 1;
        }
        int len = s.length() -1;
        while(len > 0){
            char curr = s.charAt(len);
            if(curr == ' '){
                return s.length() - len-1;
            }
            len--;
        }
        return s.length();

        
        
    }
}