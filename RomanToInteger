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
                case 'I' -> output=1;
                case 'V' -> output=5;
                case 'X' -> output=10;
                case 'L' -> output=50;
                case 'C' -> output=100;
                case 'D' -> output=500;
                case 'M' -> output=1000;
                
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