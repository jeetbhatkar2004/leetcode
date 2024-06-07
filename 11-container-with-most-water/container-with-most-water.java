class Solution {
    public int maxArea(int[] height) {
        int curr = 0;
        int max = 0;
        int i  = 0;
        int j = height.length-1;
        while(i < j){
            curr = (j-i) * Math.min(height[i], height[j]);
            max = Math.max(curr, max);
            if(height[j] > height[i]){
                i++;
                continue;
            }
            j--;
        }
        return max;
        
    }
}