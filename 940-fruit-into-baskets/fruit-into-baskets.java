class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < fruits.length){
            map.put(fruits[j], j);
            while(i < fruits.length && map.size() > 2){
                if(map.get(fruits[i]) == i){
                    map.remove(fruits[i]);
                }
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }  
        System.out.println(i + " " + j); 
        return max;
    }
}