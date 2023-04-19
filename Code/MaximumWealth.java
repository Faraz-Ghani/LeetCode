// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ 
// customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts. 
// The richest customer is the customer that has the maximum wealth.

 

public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        // We will be storing the richest person's wealth here.
        int wealthiest = 0;

        // We iterate through each person by using the outer loop.
        for (int i = 0; i < accounts.length; i++) {
            // We will be storing the current person's wealth here.
            int net = 0;

            // We iterate through each of the current person's account by using the inner loop.
            for (int j = 0; j < accounts[i].length; j++) {
                // We add the current account's balance to the current person's wealth.
                net += accounts[i][j];
            }

            // If the current person's wealth is greater than the richest person's wealth,
            if (net > wealthiest) {
                // We make the current person the richest person.
                wealthiest = net;
            }
        }
        // We return the richest person's wealth.
        return wealthiest;
    }
}