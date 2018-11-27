import java.util.Stack;

class ExtendedStack {
    private Stack<String> stack;
    private boolean containsNotNull = false;
    private int counter = 0;

    public ExtendedStack() {
        this.stack = new Stack<String>();
    }

    public void push(String s) {
        counter++;
        if (s != null) {
            containsNotNull = true;
        }
        stack.push(s);
    }

    public String pop() {
        return stack.pop();
    }

    public boolean isNotNull(){
        return containsNotNull;
    }

    public int getSize(){
        return counter;
    }

}
