//Given a roman numeral, convert it to an integer.

class RomanToInteger{
    public int romanToInt(String s) {
        //convert string to char array
        char[] arr = s.toCharArray();
        //initialize output and previous to 0
        int output=0;
        int previous=0;
        //initialize ans to 0
        int ans=0;
        //loop through the array from the end
        for(int i =arr.length-1; i>=0; i--){
            //switch case for the char array
            switch(arr[i])
            {
            case 'I':
                output = 1;
                break;
            case 'V':
                output = 5;
                break;
            case 'X':
                output = 10;
                break;
            case 'L':
                output = 50;
                break;
            case 'C':
                output = 100;
                break;
            case 'D':
                output = 500;
                break;
          case 'M':
               output = 1000;
                break;
          default:
               output = 0;
               break;
            }
            // if output is less than previous then subtract the output from ans else add the output to ans
            if (output < previous) {
                ans -= output;
            }
            else {
                ans += output;
            }
                previous = output;
            }
        return ans;

    }
}