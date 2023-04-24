// There are n kids with candies. You are given an integer array candies,
//  where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies,
//   denoting the number of extra candies that you have.

// Return a boolean array result of length n, where result[i] is true if,
//  after giving the ith kid all the extraCandies, they will have the greatest 
//  number of candies among all the kids, or false otherwise.

// Note that multiple kids can have the greatest number of candies.

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // find max candies among kids
        int max = candies[0];
        List<Boolean> ans = new ArrayList<>(candies.length);
        for(int i=0; i <candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }

        // compare each kid's candies with the max number
        for(int i=0;i<candies.length;i++){
                ans.add(candies[i]+extraCandies>=max);
        }

    return ans;
    }
}