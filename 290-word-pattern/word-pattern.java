class Solution {
    public boolean wordPattern(String pattern, String s) {
        s.trim();
        String[] chararray = s.split(" ");
        int i = 0;
        Map<Character, String> map1 =  new HashMap<>();
        Map<String, Character> map2 =  new HashMap<>();
        if(chararray.length != pattern.length()){
            return false;
        }
        while(i < pattern.length()){
            if(map1.containsKey(pattern.charAt(i))){
                if(!map1.get(pattern.charAt(i)).equals(chararray[i])){
                    return false;
                }
            }
            else{
                map1.put(pattern.charAt(i), chararray[i]);
            }
            if(map2.containsKey(chararray[i])){
                if(!map2.get(chararray[i]).equals(pattern.charAt(i))){
                    return false;
                }
            }
            else{
                map2.put(chararray[i], pattern.charAt(i));
            }
            i++;
        }
        return true;
    }
}