// A sentence is a list of words that are separated by a single space with no leading or trailing spaces. 
// Each of the words consists of only uppercase and lowercase English letters (no punctuation).

// For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
// You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words.
// Return s​​​​​​ after truncating it.

public class TruncateSentences{
    public String truncateSentence(String s, int k) {
    // create a variable to hold the number of words in the string
    int word = 0;
    // loop through the string
    for (int i = 0; i < s.length(); i++) {
        // if the character at the current index is a space
        if (s.charAt(i) == ' ') {
            // increment the word counter
            word++;
        }
        // if the word counter is equal to k
        if (word == k) {
            // truncate the string at the current index
            s = s.substring(0, i);
            // break out of the loop
            break;
        }
    }
    // return the string
    return s;
}
}