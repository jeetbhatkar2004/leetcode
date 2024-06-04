class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int mid = 0;
        Long curr = 0l;
        while(start <= end){
            mid = start + (end - start)/2;
            curr = (long)mid * mid;
            if(curr == x){
                return mid;
            }
            if (curr > x){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        if(curr > x){
            return mid - 1;
        }
        else{
            return mid;
        }
        
    }
}