import java.util.Stack;

public class balancingBrackets{
    public static void main(String[] args){

        String str = "{}[]()";
        Stack<Character> c = new Stack<>();
        for(int i = 0;i<str.length();i++){

            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                c.push(str.charAt(i));

            } else if (!c.empty() && ((str.charAt(i) == ']' && c.peek() == '[') || (str.charAt(i) == '}' && c.peek() == '{') || (str.charAt(i) == ')' || c.peek() == '('))) {
                c.pop();
            } else {
                c.push(str.charAt(i));
            }
        }
        if (c.empty()) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }
}
