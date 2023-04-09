/*
    Given a string s consisting of words and spaces, 
    return the length of the last word in the string.
    A word is a maximal substring,consisting of non-space characters only.
 */
class LengthOfLastWord{
    public int lengthOfLastWord(String s) {
        int count=0;
        s=s.trim();
        char ch[] = s.toCharArray();
        
        for(int  i =0 ;i<ch.length;i++){
            count++;
            if(ch[i] == ' '){
                count=0;
                }
        }
        return count;
       }
}