import java.util.Stack;

public class MinStack {
    // Leet 10
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min_val = new Stack<>();
    public MinStack(){

    }
    public void push(int x){
        if ( min_val.isEmpty() || x <= min_val.peek() )
            min_val.push(x);
        stack.push(x);
    }
    public void pop(){
        if (stack.peek().equals(min_val.peek()))
            min_val.pop();
        stack.pop();
    }
    public int top(){
        return stack.peek();
    }
    public int getMin(){
        return min_val.peek();
    }
}
