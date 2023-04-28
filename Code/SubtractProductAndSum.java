//Given an integer number n, return the difference between the product of its digits and the sum of its digits.

public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        // create variables sum and product and set them to 0 and 1 respectively
        int sum=0;
        int product =1;
        // loop while n is greater than 0
        while(n>0){
            // add the last digit of n to sum
            sum += n % 10;
            // multiply the last digit of n to product
            product *= n % 10;
            // divide n by 10
            n /= 10;
        } 
        // return the difference between product and sum
        return product-sum;
     }
}
