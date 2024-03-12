public class Main {
    public static void main(String[] args) {
        StackX mystack = new StackX(6);

        mystack.push(10.0);
        mystack.push(20.0);
        mystack.push(30.0);
        mystack.push(40.0);
        mystack.push(50.0);
        mystack.push(60.0);

        mystack.peek();

        System.out.println(mystack.pop() + " ");
        System.out.println(mystack.pop() + " ");
        System.out.println(mystack.pop() + " ");
        System.out.println(mystack.pop() + " ");
        System.out.println(mystack.pop() + " ");
        System.out.println(mystack.pop() + " ");

        boolean resEmpty = mystack.isEmpty();
        if(resEmpty = true) {
            System.out.println("stack is empty");
        }else {
            System.out.println("stack is not empty");
        }

        boolean resFull = mystack.isFull();
        if(resFull == true) {
            System.out.println("stack if full");
        }else {
            System.out.println("stack is not full");
        }

    }
}
