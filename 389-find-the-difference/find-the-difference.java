class Solution {
    public char findTheDifference(String s, String t) {
            long sum = 0;
            int i = 0;
            while(i < s.length()){
                sum = sum - (long) s.charAt(i) + (long) t.charAt(i);
                i++;
            }
            sum = sum + t.charAt(i);
            return (char) sum;
    }
}