class Solution {
    double finddistance(int[] source, int[] dest){
        return Math.sqrt(Math.pow(source[0] - dest[0], 2) + Math.pow(source[1] - dest[1], 2));
    }
    boolean check(int[] p1, int[] p2, int[] p3, int[] p4){
        Set<String> set = new HashSet<>();
        set.add(p1[0] + "next" + p1[1]);
        set.add(p2[0] + "next" + p2[1]);
        set.add(p3[0] + "next" + p3[1]);
        set.add(p4[0] + "next" + p4[1]);
        if(set.size() < 4){
            return false;
        }
        return true;

    }
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        if(!check(p1,p2,p3,p4)){
            return false;
        }
        double p1_to_p2 = finddistance(p1, p2);
        double p1_to_p3 = finddistance(p1, p3);
        double p1_to_p4 = finddistance(p1,p4);

        double p2_to_p1 = finddistance(p2, p1);
        double p2_to_p3 = finddistance(p2, p3);
        double p2_to_p4 = finddistance(p2,p4);

        double p3_to_p1 = finddistance(p3, p1);
        double p3_to_p2 = finddistance(p3, p2);
        double p3_to_p4 = finddistance(p3,p4);
    
        double p4_to_p1 = finddistance(p4, p1);
        double p4_to_p2 = finddistance(p4, p2);
        double p4_to_p3 = finddistance(p4,p3);

        Set<Double> set = new HashSet();
        set.add(p1_to_p2);
        set.add(p1_to_p3);
        set.add(p1_to_p4);
        set.add(p2_to_p1);
        set.add(p2_to_p3);
        set.add(p2_to_p4);
        set.add(p3_to_p1);
        set.add(p3_to_p2);
        set.add(p3_to_p4);
        set.add(p4_to_p1);
        set.add(p4_to_p2);
        set.add(p4_to_p3);
        if(set.size() < 3){
            return true;
        }
        return false;

        
    }
}