class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        int i = 0;
        while(i < nums.length){
            maxHeap.offer(nums[i]);
            i++;
        }
        while(maxHeap.size() > k){
            maxHeap.remove();
        }
        return maxHeap.remove();

    }
}