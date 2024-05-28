class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = 1;
        suffix[nums.length - 1] = 1;
        int i = 1;
        int curr = 1;
        while(i < nums.length){
            curr = curr * nums[i-1];
            System.out.println(curr);
            prefix[i] = curr;
            i++;
        }
        i = nums.length - 2;
        curr = 1;
        while (i >= 0){
            curr = curr * nums[i+1];
            System.out.println(curr);
            suffix[i] = curr;
            i--;
        }
        i = 0;
        while(i < nums.length){
            prefix[i] = prefix[i] * suffix[i];
            i++;
        }
        return prefix;

    }
}