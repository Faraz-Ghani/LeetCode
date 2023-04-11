import java.util.Arrays;

class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String output="";
        Arrays.sort(strs); // Sort the array as it is easier to find the longest common prefix in sorted array
        int i=0;
        if(strs[0] == null || strs[0].length() <1 ){ // If the input array is empty or the first string is empty
            return output; // Return empty string
        }
        if(strs.length==1){ // If the array contains only one string
            return strs[0]; // Return that string as it is the longest common prefix
        }
            while(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){ // Compare the first and last strings in the array
                if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){ // If the characters at the current index are same
                    output+=strs[0].charAt(i); // Add the character to the output string
                }
                else{
                    return output; // If the characters are not same, return the output string
                }
                if(strs[0].length()<=i+1){ // If the length of the first string is less than or equal to current index
                    return output; // Return the output string
                }
                i++; // Increment the current index
            }
            return output; // Return the output string
    
        }
    public static void main(String[] args) {
        String[] strs = {"a","ab"}; // Input String array
        System.out.println(longestCommonPrefix(strs)); // Print the output of the method
    }
}