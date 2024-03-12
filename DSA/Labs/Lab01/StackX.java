public class StackX {
    private int top;
    private double []stackArray;
    private int maxSize;

    public StackX(int max) {
        this.maxSize = max;
        this.stackArray = new double[this.maxSize];
        top = -1;
    }

    public void push(double no) {
        if(top == maxSize -1) {
            System.out.println("stack is full!!!");
        }else {
            stackArray[++top] = no;
        }
    }

    public double pop() {
        if(top == -1) {
            return -99;
        }else {
            return (stackArray[top--]);
        }
    }

    public double peek() {
        if(top == -1) {
            return -99;
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
}
