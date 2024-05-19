class Solution {
    public int fib(int n) {
        int[] result = new int[n+1];
        if (n == 0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        result[0] = 0;
        result[1] = 1;
        int i = 2;
        while(i <= n){
            result[i] = result[i-1] + result[i-2];
            i++;
        }
        return result[n];
    }
}