class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int result = 0;
        while(j < s.length()){
            char curr = s.charAt(j);
            if(map.containsKey(curr)){
                int temp = map.get(curr);
                temp++;
                map.put(curr, temp);
            }
            else{
                map.put(curr, 1);
            }
            while(map.size() > k){
                char remove = s.charAt(i);
                int freq = map.get(remove);
                freq--;
                if(freq == 0){
                    map.remove(remove);
                }
                else{
                    map.put(remove, freq);
                }
                i++;
            }
            result = Math.max(result, j - i + 1);
            j++;
        }
        return result;
    }
}