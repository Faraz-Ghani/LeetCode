import java.util.String;
public class NeedleInHaystack{
    public int strStr(String haystack, String needle) {
        // split the string into char arrays
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        // get the lengths of the arrays
        int hL = h.length, nL = n.length;
        // if the needle is longer than the haystack, return -1
        if (hL < nL) {
            return -1;
        // if the needle is empty, return 0
        } else if (nL == 0) {
            return 0;
        }
        // set a threshold for the loop
        int threshold = hL - nL;
        // loop through the haystack
        for (int i = 0; i <= threshold; ++i) {
            // if the substring of the haystack equals the needle, return the index
            if (haystack.substring(i,i+nL).equals(needle)) {
                return i;
            }
        }
        // if not found, return -1
        return -1;
    }
}