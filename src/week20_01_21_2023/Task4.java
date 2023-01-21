package week20_01_21_2023;

import java.util.Stack;

public class Task4 {



    public static void main(String[] args) {

    }





}
    /*
 For compiler one of the most important task is balanced brackets
            * Create a method that will accept a String of brackets. Determine if the brackets are balanced.
            Brackets are balanced if the closing bracket matches the opening one.
            Ex: {([])}      -> balanced
                {([])()}    -> balanced
                {[]([])()}  -> balanced
                {[(])}      -> not balanced
 */

//import java.util.Stack;
//
//class BracketChecker {
//    public boolean checkBrackets(String brackets) {
//        Stack<Character> stack = new Stack<>();
//        for (char c : brackets.toCharArray()) {
//            if (c == '(' || c == '[' || c == '{') {
//                stack.push(c);
//            } else if (c == ')' || c == ']' || c == '}') {
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                char top = stack.pop();
//                if (!isMatchingPair(top, c)) {
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
//
//    private boolean isMatchingPair(char character1, char character2) {
//        if (character1 == '(' && character2 == ')')
//            return true;
//        else if (character1 == '{' && character2 == '}')
//            return true;
//        else if (character1 == '[' && character2 == ']')
//            return true;
//        else
//            return false;
//    }
//}
//
//        BracketChecker bracketChecker = new BracketChecker();
//        System.out.println(bracketChecker.checkBrackets("{([])}"));
//        System.out.println(bracketChecker.checkBrackets("{([])()}"));
//        System.out.println(bracketChecker.checkBrackets("{[]([])()}"));
//        System.out.println(bracketChecker.checkBrackets("{[(])}"));