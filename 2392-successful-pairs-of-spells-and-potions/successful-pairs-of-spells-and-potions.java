class Solution {
    int helper(int spell, int[] potions, long success){
        long curr = success/(long)spell;
        System.out.println(curr);
        int start = 0;
        int end = potions.length - 1;
        if(curr * spell != success){ 
            curr++;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(potions[mid] >= curr){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return potions.length - start;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int i = 0;
        int[] result = new int[spells.length];
        while(i < spells.length){
            int insert = helper(spells[i], potions, success);
            result[i] = insert;
            i++;
        }
        return result;
        
    }
}