class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        int i = 0;
        while(i < strs.length){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String str = new String(charArray);
            if(map.containsKey(str)){
                map.get(str).add(strs[i]);
            }
            else{
                map.put(str, new ArrayList<>());
                map.get(str).add(strs[i]);
            }
            i++;
        }
        for(Map.Entry<String, List<String>> curr : map.entrySet()){
            result.add(curr.getValue());
        }
        return result;
        
    }
}