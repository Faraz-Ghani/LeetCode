// A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

// You are given an array of strings sentences, where each sentences[i] represents a single sentence.

// Return the maximum number of words that appear in a single sentence.

public class NumbersInSentence {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        int count=1;
        //for each sentence
        for(int i=0;i<sentences.length;i++){
            //reset the counter
            count=1;
            //for each character
            for(int j=0;j<sentences[i].length();j++){
                //if it is a space
                if(sentences[i].charAt(j)==' '){
                    //increment the counter
                    count++;
                }
            }
            //if the counter is greater than the max
            if(count>max){
                //make the counter the new max
                max=count;
            }
        }
        //return the max
        return max;
    }
}
