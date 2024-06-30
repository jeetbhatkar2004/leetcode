class Solution {
    class Distances{
        int[] coordinates;
        double distanceFromOrigin;

        Distances(int[] coordinates, double distanceFromOrigin){
            this.coordinates = coordinates;
            this.distanceFromOrigin = distanceFromOrigin;
        }
    }
    double helper(int i, int j){
        double temp = Math.pow(i, 2) + Math.pow(j, 2);
        return Math.sqrt(temp);
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Distances> qu = new PriorityQueue<>(new Comparator<Distances>() {
            public int compare(Distances d1, Distances d2) {
                return Double.compare(d1.distanceFromOrigin, d2.distanceFromOrigin);
            }
        });
        int i = 0;
        int j = 0;
        int[][] res = new int[k][2];
        while(i < points.length){
            double currDistance = helper(points[i][0], points[i][1]);
            Distances curr = new Distances(points[i], currDistance);
            qu.offer(curr);
            if(qu.size() > points.length - k){
                res[j] = qu.poll().coordinates;
                j++;
            }
            i++;
        }
        return res;
}}