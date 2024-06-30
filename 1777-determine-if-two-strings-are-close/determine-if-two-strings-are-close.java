class Solution {
    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        map1 = makeMap(word1);
        for(int i = 0; i < word2.length(); i++){
            if(!map1.containsKey(word2.charAt(i))){
                return false;
            }
            if(map2.containsKey(word2.charAt(i))){
                int temp = map2.get(word2.charAt(i));
                temp++;
                map2.put(word2.charAt(i), temp);
            }
            else{
                map2.put(word2.charAt(i), 1);
            }
        }
        int[] arr1 = new int[map1.size()];
        int[] arr2 = new int[map2.size()];
        int i = 0;
        for(Map.Entry<Character, Integer> curr : map1.entrySet()){
            arr1[i] = curr.getValue();
            i++;
        }
        i = 0;
        for(Map.Entry<Character, Integer> curr : map2.entrySet()){
            arr2[i] = curr.getValue();
            i++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);

    }
        private Map<Character, Integer> makeMap(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}