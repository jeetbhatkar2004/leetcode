class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        prefix[0] = 1;
        suffix[len - 1] = 1;
        int i = 1;
        int curr = 1;
        while(i < len){
            curr = curr * nums[i-1];
            System.out.println(curr);
            prefix[i] = curr;
            i++;
        }
        i = len - 2;
        curr = 1;
        while (i >= 0){
            curr = curr * nums[i+1];
            System.out.println(curr);
            suffix[i] = curr;
            i--;
        }
        i = 0;
        while(i < len){
            prefix[i] = prefix[i] * suffix[i];
            i++;
        }
        return prefix;

    }
}