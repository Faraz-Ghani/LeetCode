// You are given an integer n, the number of teams in a tournament that has strange rules:

// If the current number of teams is even, each team gets paired with another team. 
// A total of n / 2 matches are played, and n / 2 teams advance to the next round.
// If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. 
// A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
// Return the number of matches played in the tournament until a winner is decided.

 
public class MatchesInTournament {
    public int numberOfMatches(int n) {
        int count=0; // to count the matches
        while(n!=1){ // loop till n becomes 1
            if(n%2==0){ // if n is even
                n=n/2; // n is equal to n/2
                count+=n; // add n to count
            }
            else{
                n--; // decrement n by 1
                n=n/2; // n is equal to n/2
                count+=n; // add n to count
                n++; // increment n by 1
            }
        }
        return count; // return count
    }    
}
