/*
    Given an integer x, return true if x is a 
    palindrome
    and false otherwise.
 */

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Convert the integer into a string
        String s = String.valueOf(x);  
        // Initialize two variables that will be used to
        // traverse the string from both ends
        int j=s.length()-1;
        for(int i=0; i<=j ;i++,j--){
            // If the character at the start of the string
            // is different from the character at the end of 
            // the string, then we return false
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }

        // If we get to here, then we know that the string
        // is a palindrome, so we return true
        return true;
        
    }
}