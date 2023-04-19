//Given a roman numeral, convert it to an integer.

class RomanToInteger{
    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int output=0;
        int previous=0;
        int ans=0;
        for(int i =arr.length-1; i>=0; i--){
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