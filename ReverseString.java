import java.util.Stack;
public class ReverseString {
    public static void main(String[] args) {
        //Reversing smiple
        /*
        String input = "Ghazal Noori";
        String output= "";
        String output1 = "";
        Stack<Character> stack = new Stack<>();


        for (int i = input.length()-1; i>=0; i--){
            output1+=input.charAt(i);
        }
        System.out.println(output1);

        //Reversing using Stack
        for (int i =0; i<input.length(); i++){
            char a = input.charAt(i);
            stack.push(a);
        }
        for (int i = 0; i<stack.size(); i++){
            output+= stack.pop();
        }
        System.out.println(output);

    }

         */
    String input = "Ghazal Noori Rakhimova";
    System.out.println(reverse(input));
    }

    public static String reverse(String input) {
        if(input==null){
            throw new IllegalArgumentException();
        }
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        String result = "";
        StringBuffer reversed = new StringBuffer();
        while (stack.isEmpty() == false) {
            //1 way, but not efficient and the String concats are expensive
            //--result += stack.pop();
            //2nd way is to use StringBuffer
            reversed.append(stack.pop());
        }
        //return result;
        return reversed.toString();
    }
}
