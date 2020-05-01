import java.util.Stack;

public class BackspaceStringCompare {
    // Leet 9
    public boolean backspaceCompare(String S, String T){
        return build(S).equals(build(T));
    }
    public String build(String str){
        Stack<Character> ans = new Stack<>();
        for (char c : str.toCharArray()){
            if (c != '#')
                ans.push(c);
            else if ( !ans.isEmpty())
                ans.pop();
        }
        return String.valueOf(ans);
    }
}
