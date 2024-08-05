class Solution {
    String odd(String s, int i){
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(i));
        int left = i - 1;
        int right = i + 1;
        while(left >= 0 && right < s.length()){
            if(s.charAt(left) == s.charAt(right)){
                result.insert(0,s.charAt(left));
                result.append(s.charAt(right));

            }
            else{
                return result.toString();
            }
            left--;
            right++;
        }
        return result.toString();
    }
    String even(String s, int i){
        StringBuilder result = new StringBuilder();
        int left = i;
        int right = i + 1;
        while(left >= 0 && right < s.length()){
            if(s.charAt(left) == s.charAt(right)){
                result.insert(0,s.charAt(left));
                result.append(s.charAt(right));
            }
            else{
                return result.toString();
            }
            left--;
            right++;
        }
        return result.toString();
    }
    public String longestPalindrome(String s) {
        String result = "";
        for(int i = 0; i < s.length(); i++){
            String oddstring = odd(s,i);
            String evenstring = even(s,i);
            String temp = "";
            if(oddstring.length() > evenstring.length()){
                temp = oddstring;
            }
            else{
                temp = evenstring;
            }
            if(result.length() < temp.length()){
                result = temp;
            }
        }
        return result;
        
    }
}