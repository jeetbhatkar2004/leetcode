class Solution {
    List<String> result = new ArrayList<>();
    
    void helper(String digits, Map<Character, String> phone, int start, StringBuilder curr){
        if(curr.length() == digits.length()){
            result.add(curr.toString());
            return;
        }
        String temp = phone.get(digits.charAt(start));
        for(int i = 0; i < temp.length(); i++){
            curr.append(temp.charAt(i));
            helper(digits, phone, start + 1, curr);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        Map<Character, String> phone = new HashMap<>();
        if(digits.length() == 0){
            return result;
        }
        phone.put('2', "abc");
        phone.put('3', "def");
        phone.put('4', "ghi");
        phone.put('5', "jkl");
        phone.put('6', "mno");
        phone.put('7', "pqrs");
        phone.put('8', "tuv");
        phone.put('9', "wxyz");

        StringBuilder curr = new StringBuilder();
        helper(digits, phone, 0, curr);
        return result;
    }
}