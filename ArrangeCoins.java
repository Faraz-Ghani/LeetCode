/*
You have n coins and you want to build a staircase with these coins. 
The staircase consists of k rows where the ith row has exactly i coins.
 The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.
*/

class ArrangeCoins {
    public int arrangeCoins(int n) {
        //Declare a counter variable to count the number of steps
        int count= 0;
        
        //Start a for loop with an infinite loop condition
        for(int i = 1 ; i > 0 ;i++){
            //Check if the number of coins is greater than the current step number
            if(n>=i){
                //If yes, then increment the counter
                count++;
                //Reduce the number of coins by the current step number
                n-=i;
            }
            else{
                //If the number of coins is less than the current step number, then break out of the loop
                break;
            }
        }
        //Return the counter
        return count;
    }
}