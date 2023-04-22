// You are given a positive integer num consisting only of digits 6 and 9.

// Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

public class Maximum69Number {
    public int maximum69Number (int num) {
     char[] ch = Integer.toString(num).toCharArray();
    
    for(int i =0 ;i<ch.length; i++){
        if(ch[i]=='9'){
            continue;
        }
        else{
            ch[i]='9';
            break;
        }
    }
    return Integer.parseInt(String.valueOf(ch));
    }
}