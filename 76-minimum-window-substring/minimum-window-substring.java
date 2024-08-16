class Solution {
    boolean helper(Map<Character, Integer> map_s, Map<Character, Integer> map_t) {
        for (Map.Entry<Character, Integer> curr : map_t.entrySet()) {
            if (!map_s.containsKey(curr.getKey()) || curr.getValue() > map_s.get(curr.getKey())) {
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        String result = "";
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        Map<Character, Integer> map_t = new HashMap<>();
        Map<Character, Integer> map_s = new HashMap<>();

        // Populate map_t with frequencies of characters in t
        for (int k = 0; k < t.length(); k++) {
            map_t.put(t.charAt(k), map_t.getOrDefault(t.charAt(k), 0) + 1);
        }

        while (j < s.length()) {
            char endChar = s.charAt(j);
            if (map_t.containsKey(endChar)) {
                map_s.put(endChar, map_s.getOrDefault(endChar, 0) + 1);
            }

            // Try to update the result and shrink the window
            if (helper(map_s, map_t)) {
                // Move `i` to the right as much as possible while the window is valid
                while (helper(map_s, map_t)) {
                    // Update the result if the current window is smaller
                    if (min > j - i + 1) {
                        min = j - i + 1;
                        result = s.substring(i, j + 1);
                    }

                    // Shrink the window from the left
                    char startChar = s.charAt(i);
                    if (map_s.containsKey(startChar)) {
                        map_s.put(startChar, map_s.get(startChar) - 1);
                        if (map_s.get(startChar) == 0) {
                            map_s.remove(startChar);
                        }
                    }

                    i++;
                }
            }

            j++;
        }

        return result;
    }
}
