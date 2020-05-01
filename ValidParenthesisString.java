public class ValidParenthesisString {
    // Leet 16
    public boolean checkValidString(String s){

        int balance = 0;
        // empty string is valid
        if (s.length() < 1)
            return true;
        // Check case string has redundant close parenthesis )
        // ex: ((*))))
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')'){
                balance --;
            } else {     // ( or *
                balance ++;
            }
            if (balance < 0)    // ")" numbers > "( + *" numbers    // balance = -1
                return false;
        }
        if (balance == 0)
            return true;
        // Check case string has redundant open parenthesis (
        // ex: (((*)
        balance = 0;
        for (int i = s.length() -1; i >= 0 ; i--){
            if (s.charAt(i) == '(') {
                balance--;
            } else {     // ( or *
                balance++;
            }
            if (balance < 0)    // balance = -1
                return false;
        }
        return true;
    }
}
