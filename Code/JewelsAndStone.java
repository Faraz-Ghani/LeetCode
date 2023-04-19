// You're given strings jewels representing the types of stones that are jewels, and stones
// representing the stones you have. Each character in stones is a type of stone you have.
// You want to know how many of the stones you have are also jewels.

// Letters are case sensitive, so "a" is considered a different type of stone from "A".

public class JewelsAndStone {
    public int numJewelsInStones(String jewels, String stones) {
        char[] arr1 = jewels.toCharArray(); //converts the string to char array
        char[] arr2 = stones.toCharArray(); //converts the string to char array
        int num=0;
        for(char i : arr1){
            for(char j : arr2){
                if(i==j){
                    num++;
                }
            }
        }
        return num;
    }
}
