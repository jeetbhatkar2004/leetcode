class Solution {
    class Pair{
        int position;
        int speed;
        Pair(int position, int speed){
            this.position = position;
            this.speed = speed;
        }
    }
    double timeTaken(int position, int speed, int target) {
        return (double) (target - position) / speed;
    }
    public int carFleet(int target, int[] position, int[] speed) {
        Pair[] pairs = new Pair[speed.length];
        for(int i = 0; i < position.length; i++){
            pairs[i] = new Pair(position[i], speed[i]);
        }
        Arrays.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p2.position - p1.position; 
            }
        });
        Stack<Pair> stack = new Stack<>();
        int i = 0;
        int res = 0;
        while(i < pairs.length){
            double time = timeTaken(pairs[i].position, pairs[i].speed, target);
            if (!stack.isEmpty() && time <= timeTaken(stack.peek().position, stack.peek().speed, target)) {
                i++;
                continue;
            }
            res++;
            stack.push(pairs[i]);
            i++;
        }
        return res;
    }
}