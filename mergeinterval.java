import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]>list=new ArrayList<>();
        for(int[] interval:intervals){
            if(list.isEmpty() || list.get(list.size()-1)[1]<interval[0]){
                list.add(interval);
            }
            else{
                list.get(list.size()-1)[1]=Math.max(list.get(list.size()-1)[1],interval[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
    public static void main(String[] args){
        int[][] intervals={ {4, 5}, {3, 6}, {5, 7} };
         Solution sol = new Solution();
        int[][] result = sol.merge(intervals);

        // Print the result
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}