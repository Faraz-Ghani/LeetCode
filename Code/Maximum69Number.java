// You are given a positive integer num consisting only of digits 6 and 9.

// Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

public class Maximum69Number {
public int maximum69Number (int num) {
     // convert the number to string and then to char array
     char[] ch = Integer.toString(num).toCharArray();
    
    // iterate through the char array
    for(int i =0 ;i<ch.length; i++){
        // if the current char is 9, skip it
        if(ch[i]=='9'){
            continue;
        }
        // else replace the current char with 9 and break
        else{
            ch[i]='9';
            break;
        }
    }
    // convert the char array to string and then to int
    return Integer.parseInt(String.valueOf(ch));
}
}