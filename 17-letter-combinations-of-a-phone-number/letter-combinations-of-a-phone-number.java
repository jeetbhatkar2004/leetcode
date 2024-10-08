class Solution {
    Map<Character, String> map = new HashMap<>();
    List<String> result = new ArrayList<>();
    StringBuilder curr = new StringBuilder();
    void helper(String digits, int start){
        if(start == digits.length()){
            result.add(new String(curr.toString()));
            return;
        }
        String str = map.get(digits.charAt(start));
        for(int i = 0; i < str.length(); i++){
            curr.append(str.charAt(i));
            helper(digits, start + 1);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return result;
        }
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        helper(digits, 0);
        return result;
    }

}