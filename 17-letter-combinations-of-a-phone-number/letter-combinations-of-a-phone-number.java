class Solution {
    void helper(String digits, Map<Character, char[]> map, StringBuilder curr, List<String> result, int start) {
        if(curr.length() == digits.length()){
            result.add(new String(curr.toString()));
            return;
        }
        char[] temp = map.get(digits.charAt(start));
        for(int i = 0; i < temp.length; i++){
            curr.append(temp[i]);
            helper(digits, map, curr, result, start + 1);
            curr.deleteCharAt(curr.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        Map<Character, char[]> map = new HashMap<>();
        map.put('2', new char[] {'a', 'b', 'c'});
        map.put('3', new char[] {'d', 'e', 'f'});
        map.put('4', new char[] {'g', 'h', 'i'});
        map.put('5', new char[] {'j', 'k', 'l'});
        map.put('6', new char[] {'m', 'n', 'o'});
        map.put('7', new char[] {'p', 'q', 'r', 's'});
        map.put('8', new char[] {'t', 'u', 'v'});
        map.put('9', new char[] {'w', 'x', 'y', 'z'});
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        StringBuilder curr = new StringBuilder();
        helper(digits, map, curr, result, 0);
        return result;
    }
}
