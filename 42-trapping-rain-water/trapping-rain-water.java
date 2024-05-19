class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max2 = -1;
        int max = -1;
        int water = 0;
        while(i < j){
            if (height[i] < height[j]){
                if(max < height[i]){
                    max = height[i];
                }
                else{
                    water = water + (max - height[i]);
                }
                i++;
            }
            else{
                if(max2 < height[j]){
                    max2 = height[j];
                }
                else{
                    water = water + (max2-height[j]);
                }
                j--;
            }
        }

        
        return water;
        
    }
}