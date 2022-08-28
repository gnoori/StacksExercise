import java.util.Arrays;
import java.util.List;
import java.util.Stack;
public class BalancedExp {

    private static final List<Character> lb = Arrays.asList('(', '[', '{', '<');
    private static final List<Character> rb = Arrays.asList(')', ']', '}', '>');

    public static boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();

        for(char i: input.toCharArray()){
            if(isLeftBracket(i))
                stack.push(i);

            if (isRightBracket(i)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if (!match(top, i)) return false;
                //stack.pop();
            }
        }
        return stack.empty();
    }
    private static boolean isLeftBracket(char i){
        return (lb.contains(i));
    }

    private static boolean isRightBracket(char i){
        return (rb.contains(i));
    }

    private static boolean match(char l, char r){
        return ((l =='(' && r ==')' ) ||
                (l =='[' && r ==']') ||
                (l =='{' && r =='}') ||
                (l =='<' && r =='>'));
    }

    public static void main (String[] args){
        String test = "[(1+2";
        System.out.println(isBalanced(test));
    }
}
