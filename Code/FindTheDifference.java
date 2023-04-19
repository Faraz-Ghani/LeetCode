import java.util.Arrays;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        // Convert String to char array
        char sArr[] = s.toCharArray();
        char tArr[] = t.toCharArray();
        // Sort the arrays
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        // Check each element in the arrays
        // if they are different, return the different element
        for(int i = 0 ;i<sArr.length;i++){
            if(sArr[i]==tArr[i]){
                continue;
            }
            else{
                return tArr[i];
            }
        }
        // If all elements are the same, return the last element of tArr as it is the only possible character
        return tArr[tArr.length-1];
    }
}
