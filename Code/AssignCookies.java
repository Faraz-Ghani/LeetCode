import java.util.Arrays;

/*
   Assume you are an awesome parent and want to give your children some cookies. 
   But, you should give each child at most one cookie.

   Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
   and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i,
   and the child i will be content. Your goal is to maximize the number of your content children and output 
   the maximum number.
 */
class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        // Sort the arrays
        Arrays.sort(g);
        Arrays.sort(s);

        int content=0;

        // Iterate through the arrays
        for(int i =0 ;content<g.length && i<s.length;i++){
            // If the current cookie is big enough to satisfy the current child
            if(s[i]>=g[content]){
                // Increment the number of children that can be satisfied
                content++;
            }
        }
        // Return the number of children that can be satisfied
        return content;
    }
}