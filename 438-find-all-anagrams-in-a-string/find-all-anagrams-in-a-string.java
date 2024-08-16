class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] arr_s = new int[26];
        int[] arr_p = new int[26];
        int i = 0;
        while(i < p.length()){
            arr_p[p.charAt(i) - 'a']++;
            i++;
        }
        i = 0;
        int j = 0;
        while(i < s.length()){
            if(i < p.length()){
                arr_s[s.charAt(i) - 'a']++; 
                i++;
            }
            else{
                arr_s[s.charAt(j) - 'a']--;
                arr_s[s.charAt(i) - 'a']++;
                j++;
                i++;
            }
            if(Arrays.equals(arr_s, arr_p)){
                result.add(j);
            }
        }
        return result;
        
        
    }
}