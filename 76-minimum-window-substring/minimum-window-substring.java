class Solution {
    boolean helper(Map<Character, Integer> map_s, Map<Character, Integer> map_t){
        for(Map.Entry<Character, Integer> curr : map_t.entrySet()){
            if(!map_s.containsKey(curr.getKey()) || curr.getValue() > map_s.get(curr.getKey())){
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        // Initialize frequency maps for t and the sliding window in s
        Map<Character, Integer> map_t = new HashMap<>();
        Map<Character, Integer> map_s = new HashMap<>();

        // Populate map_t with the frequency of each character in t
        for (int k = 0; k < t.length(); k++) {
            map_t.put(t.charAt(k), map_t.getOrDefault(t.charAt(k), 0) + 1);
        }

        int minLength = Integer.MAX_VALUE;
        String result = "";
        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            char charAtJ = s.charAt(j);

            // Add current character to map_s
            if (map_t.containsKey(charAtJ)) {
                map_s.put(charAtJ, map_s.getOrDefault(charAtJ, 0) + 1);
            }

            // Check if current window contains all characters of t
            while (helper(map_s, map_t)) {
                // Update result if this window is smaller
                if (j - i + 1 < minLength) {
                    minLength = j - i + 1;
                    result = s.substring(i, j + 1);
                }

                // Try to shrink the window by removing the leftmost character
                char charAtI = s.charAt(i);
                if (map_s.containsKey(charAtI)) {
                    map_s.put(charAtI, map_s.get(charAtI) - 1);
                    if (map_s.get(charAtI) == 0) {
                        map_s.remove(charAtI);
                    }
                }
                i++;
            }
        }

        return result;
    }
}
