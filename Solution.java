import java.util.*;
public class Solution {
    public static boolean [] bool (int [] candies, int extraCandies) {
        int n = candies.length;
        int max =  Integer.MIN_VALUE;
        boolean [] boolArray = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i=0; i<n; i++) {
            if(candies[i]+extraCandies >= max) {
                boolArray[i] = true;
            } else{
                boolArray[i] = false;
            }
        }
        return boolArray;
    }
    public static void main(String[] args) {
        int [] candies = {2, 8, 7};
        int extraCandies = 1;
        System.out.println(Arrays.toString(bool(candies, extraCandies)));
    }
}
