/**
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.


 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

 public class Guessgame extends GuessGame {
    public int guessNumber(int n) {
        int first=1,last=n; //initialize the first and last elements

        while(first<last){ //while the first element is less than the last element
        int mid=first+(last-first)/2; //find the middle element
        if(guess(mid)==0){ //check if the middle element is the picked number
            return mid;
        }
        else if(guess(mid)==1){ //if the middle element is greater than the picked number, change the first element to middle element+1
            first=mid+1;
        }
        else{
            last=mid; //if the middle element is smaller than the picked number, change the last element to middle element
        }
        }
        return first; //return the first element
        }
        
    }