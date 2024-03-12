public class StackChar {
    private int top;
    private char []stackArray;
    private int maxSize;

    public StackChar(int max) {
        this.maxSize = max;
        this.stackArray = new char[this.maxSize];
        top = -1;
    }

    public void push(char ch) {
        if(top == maxSize -1) {
            System.out.println("stack is full!!!");
        }else {
            stackArray[++top] = ch;
        }
    }

    public char pop() {
        if(top == -1) {
            return 'x';
        }else {
            return (stackArray[top--]);
        }
    }

    public char peek() {
        if(top == -1) {
            return 'x';
        }else {
            return (stackArray[top]);
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static boolean validExpression(String expression) {
        StackChar charstack = new StackChar(expression.length());

        for(int i =0; i<expression.length();i++) {
            char ch = expression.charAt(i);
            if(ch == '(') {
                charstack.push(ch);
            }else if(ch == ')') {
                if(charstack.isEmpty() || charstack.pop() != '(') {
                    return false;
                }
            }
        }
        return charstack.isEmpty();
    }
}
