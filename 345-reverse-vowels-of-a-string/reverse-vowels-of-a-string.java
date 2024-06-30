class Solution {
    Set<Character> vowels = new HashSet<>();
    String res = new String();
    public String reverseVowels(String s) {
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int i = 0;
        Stack<Character> stack = new Stack<>();
        while(i < s.length()){
            if(isVowel(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            i++;
        }
        i = 0;
        StringBuilder curr = new StringBuilder();
        while(i < s.length()){
            if(isVowel(s.charAt(i))){
                curr.append(stack.pop());
            }
            else{
                curr.append(s.charAt(i));
            }
            i++;
        }
        return curr.toString();

    }

    boolean isVowel(Character c){
        if (vowels.contains(Character.toLowerCase(c))){
            return true;
        }
        return false;
    }
}