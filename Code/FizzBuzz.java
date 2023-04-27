import java.util.ArrayList;
import java.util.List;

// Given an integer n, return a string array answer (1-indexed) where:

// answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
// answer[i] == "Fizz" if i is divisible by 3.
// answer[i] == "Buzz" if i is divisible by 5.
// answer[i] == i (as a string) if none of the above conditions are true.

public class FizzBuzz{
    public List<String> fizzBuzz(int n) {
        // Create a list to store the results
        List<String> ret = new ArrayList<String>(n);
        // Loop from 1 to n
        for(int i=1;i<=n;i++){
            // Check if the number is divisible by 3 or 5
            if((i%3==0 || i%5==0) && i>2){
               // Check if the number is divisible by both 3 and 5
               if(i%3==0 && i%5==0){
                   // Add "FizzBuzz" to the list
                   ret.add("FizzBuzz");
               }
               // Check if the number is divisible by 3
               else if(i%3==0){
                   // Add "Fizz" to the list
                   ret.add("Fizz");
               }
               // Check if the number is divisible by 5
               else{
                   // Add "Buzz" to the list
                   ret.add("Buzz");
               }
            }
            // If the number is not divisible by 3 or 5, add the number
            else{
                // Add the number to the list
                ret.add(Integer.toString(i));
            }
        }
        // Return the list
        return ret;
   }
}