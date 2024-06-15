class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> hashset=new HashSet<>();
        int i = 0;
        while( i < candyType.length){
            hashset.add(candyType[i]);
            i++;
        }
        i= 0;
        int n=candyType.length/2;
        if(n>=hashset.size()){
            return hashset.size();
        }
        else{
            return n;
        }
    }
}