class Solution {
    public int fib(int n) {
        if (n < 2) return n;
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }
}
