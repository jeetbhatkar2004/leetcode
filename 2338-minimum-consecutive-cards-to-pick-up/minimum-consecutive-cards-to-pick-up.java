class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = Integer.MAX_VALUE;
        int i = 0;
        while(i < cards.length){
            if(map.containsKey(cards[i])){
                res = Math.min(res, i - map.get(cards[i]) + 1);
            }
            map.put(cards[i], i);
            i++;
        }
        if(res == Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }
}