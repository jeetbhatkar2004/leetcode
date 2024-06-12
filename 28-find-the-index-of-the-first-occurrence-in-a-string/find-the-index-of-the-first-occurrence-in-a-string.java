class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        StringBuilder curr = new StringBuilder();
        if(haystack.length() < needle.length()){
            return -1;
        }
        while(i < needle.length()){
            curr.append(haystack.charAt(i));
            i++;
        }
        if(curr.toString().equals(needle)){
                return 0;
        }
        while(i < haystack.length()){
            curr.deleteCharAt(0);
            curr.append(haystack.charAt(i));
            System.out.println(curr.toString());
            if(curr.toString().equals(needle)){
                return i-needle.length() + 1;
            }
            i++;
        }
        return -1;
        
    }
}