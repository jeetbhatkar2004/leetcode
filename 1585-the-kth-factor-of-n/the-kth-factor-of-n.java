class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n/2; i++){
            if ((n % i) == 0){
                nums.add(i);
            }

        }
        nums.add(n);
        if (nums.size() < k){
            return -1;
        }
        else{
            return nums.get(k-1);
        }


        
    }
}