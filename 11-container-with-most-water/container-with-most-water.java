class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int result = 0;
        while(i <= j){
            result = Math.max(Math.min(height[i],height[j]) * (j-i), result);
            if(height[j] > height[i]){
                i++;
            }
            else{
                j--;
            }
        }
        return result;
        
    }
}