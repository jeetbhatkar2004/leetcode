import java.util.Map;
import java.util.Stack;
import java.util.AbstractMap;

class Solution {
    class Pair{
        int val;
        int index;
        Pair(int val, int index){
            this.val = val;
        }
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);
        int i = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while(i < nums1.length){
            map.put(nums1[i], i);
            i++;
        }
        i = 0;
        Stack<Pair> stack = new Stack<>();
        while(i < nums2.length){
            while(!stack.isEmpty() && stack.peek().val < nums2[i]){
                Pair temp = stack.pop();
                if(map.containsKey(temp.val)){
                    result[map.get(temp.val)] = nums2[i];
                }
            }
            Pair curr = new Pair(nums2[i], i);
            stack.push(curr);
            i++;

        }
        return result;
        
    }
}