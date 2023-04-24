/*
    Given a string s consisting of words and spaces, 
    return the length of the last word in the string.
    A word is a maximal substring,consisting of non-space characters only.
 */
class LengthOfLastWord{
    public int lengthOfLastWord(String s) {
        int count=0;
        s=s.trim(); // remove whitespace from the beginning and end of the string
        char ch[] = s.toCharArray(); // convert string to char array
        
        for(int  i =0 ;i<ch.length;i++){
            count++; // count the length of string
            if(ch[i] == ' '){ // if a space is found set count to 0
                count=0;
                }
        }
        return count; // return the count
       }
}