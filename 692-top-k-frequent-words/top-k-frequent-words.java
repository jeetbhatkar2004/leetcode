class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(
            (entry1, entry2) -> {
                if (entry1.getValue().equals(entry2.getValue())) {
                    return entry2.getKey().compareTo(entry1.getKey()); 
                }
                return Integer.compare(entry1.getValue(), entry2.getValue());
            }
        );
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        while(i < words.length){
            if(map.containsKey(words[i])){
                int temp = map.get(words[i]);
                temp++;
                map.put(words[i], temp);
            }
            else{
                map.put(words[i], 1);
            }
            i++;
        }
        for(Map.Entry<String, Integer> curr :  map.entrySet()){
            heap.add(curr);
            if(heap.size() > k){
                heap.poll();
            }
        }
        List<String> list = new ArrayList<>();
        while(!heap.isEmpty()){
            list.add(heap.poll().getKey());
        } 
        Collections.reverse(list);
        return list;
    }
}