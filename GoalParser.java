// You own a Goal Parser that can interpret a string command. 
// The command consists of an alphabet of "G", "()" and/or "(al)" in some order. 
// The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". 
// The interpreted strings are then concatenated in the original order.

// Given the string command, return the Goal Parser's interpretation of command.

public class GoalParser {
    public String interpret(String command) {
        String goal="";
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)!='G'){ // if the current character is not G
                if(command.charAt(i) == '('){ // if the current character is '('
                    if(command.charAt(i+1)==')'){ // if the next character is ')'
                        goal=goal+"o"; // append o to goal
                        i++; // increment i
                    }
                    else{ // if the next character is not ')'
                        goal=goal+"al"; // append al to goal
                        i+=2; // increment i by 2
                    }
                }
            }
            else{ // if the current character is G
                goal=goal+"G"; // append G to goal
            }
        }
        return goal; // return goal
    }
}
