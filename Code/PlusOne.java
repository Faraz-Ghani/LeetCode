/*
You are given a large integer represented as an integer array digits,
 where each digits[i] is the ith digit of the integer.
  The digits are ordered from most significant to least significant in left-to-right order. 
  The large integer does not contain any leading 0's.
  Increment the large integer by one and return the resulting array of digits.
*/

class PlusOne {
public int[] plusOne(int[] digits) {
        // find the last number of the array
        int last=digits.length-1;
        // start from the last number of the array
        for(int i = last;i>=0;i--){
            // if the number is less than 9, plus one and return the result
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            // if the number is 9, change it to 0
            else{
                digits[i]=0;
            }
        }
        // if all the numbers are 9, create a new array with length + 1
        int[] newNumber = new int[digits.length+1];
        // set the first number to 1
        newNumber[0] = 1;
        // return the new array
        return newNumber;
    }
}