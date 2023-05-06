// Given a positive integer n, find the sum of all integers in the range [1, n] inclusive
// that are divisible by 3, 5, or 7.

// Return an integer denoting the sum of all numbers in the given range satisfying the constraint.

public class SumMultiples{
public int sumOfMultiples(int n) {
int sum = 0; // initialize the sum to 0
for(int i =1 ; i<=n;i++){ // loop through 1 to n
if(i%3==0 || i%5==0 || i%7==0 ){ // check if the value is divisible by 3, 5 or 7
sum+=i; // add the value to the sum
}
}
return sum; // return the sum
}
}