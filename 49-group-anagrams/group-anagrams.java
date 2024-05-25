class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(String curr : strs){
            char[] charArray = curr.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if(anagramMap.containsKey(sorted)){
                anagramMap.get(sorted).add(curr);
            }
            else{
                List<String> str = new ArrayList<>();
                str.add(curr);
                anagramMap.put(sorted, str);
            }
            
        }
        return new ArrayList<>(anagramMap.values());
        
    }
}