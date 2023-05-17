//Given two string arrays word1 and word2, return true if the two arrays represent the same string,
// and false otherwise.

//A string is represented by an array if the array elements concatenated in order forms the string.

public class EqualStringArrays {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="",str2="";
        //concatenate all the strings in word1
        for(String i:word1){
            str1+=i;
        }
        //concatenate all the strings in word2
        for(String i:word2){
            str2+=i;
        }
        //compare the two strings and return the result
        return str1.equals(str2);
    }  
}
