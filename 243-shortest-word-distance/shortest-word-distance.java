class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int min = Integer.MAX_VALUE;
        int prev = 0;
        boolean found = false;
        boolean changed = false;
        int i = 0;
        while(i < wordsDict.length){
            if(wordsDict[i].equals(word1)){
                if(changed && found == true){
                    min = Math.min(min, i- prev);
                }
                prev = i;
                found = false;
                changed = true;
            }
            if(wordsDict[i].equals(word2)){
                if(changed && found == false){
                    min = Math.min(min, i - prev);
                }
                prev = i;
                found = true;
                changed = true;
            }
            i++;
        }
        return min;   
    }
}