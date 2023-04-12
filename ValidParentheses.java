import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {        

        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<s.length() ;i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i)); //push opening brackets to stack
            }
            else if(s.charAt(i) == ')' && !stack.empty() && stack.peek()=='('){
                stack.pop(); //pop from stack if closing bracket is same as the one on top of the stack
            }
            else if(s.charAt(i) == '}' && !stack.empty() && stack.peek()=='{'){
                stack.pop(); //pop from stack if closing bracket is same as the one on top of the stack
            }
            else if(s.charAt(i) == ']' && !stack.empty() && stack.peek()=='['){
                stack.pop(); //pop from stack if closing bracket is same as the one on top of the stack
            }
            else{
                return false; //return false if closing bracket is not same as the one on top of the stack
            }
        }
        return stack.empty(); //return true if stack is empty, false otherwise
    }
}