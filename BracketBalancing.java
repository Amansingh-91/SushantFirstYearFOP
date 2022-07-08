import java.util.Stack;

public class BracketBalancing {
    public static boolean balance(String bal){
//        if(bal.length() %2 != 0){
//            return false;
//        }
        Stack<Character> temp = new Stack<>();
        for (int i = 0; i < bal.length(); i++) {
//            if(bal.charAt(i) != '{' && bal.charAt(i) != '}' || bal.charAt(i) != '(' && bal.charAt(i) != ')' || bal.charAt(i) != '[' && bal.charAt(i) != ']' ){
//                continue;
//            }
            if(bal.charAt(i) != '}' && bal.charAt(i) != ')' && bal.charAt(i) != ']' ){

                temp.push(bal.charAt(i));


            }
            else if(bal.charAt(i) == '}' || bal.charAt(i) == ']' || bal.charAt(i) == ')'){
                char ch = temp.pop();
                while (ch != '(' && ch != '{' && ch != '[' ){
                    ch = temp.pop();
                }
//                System.out.println(ch);
                if(ch == '(' && bal.charAt(i) != ')' || ch == '[' && bal.charAt(i) != ']' || ch == '{' && bal.charAt(i) != '}')
                    return false;
            }
        }
        if(temp.size() !=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(balance("{([a+b]*c)}"));
        System.out.println(balance("{([a+b]*c)"));
        System.out.println(balance("{([a]*b})"));
    }
}
