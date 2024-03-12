public class circularQueue {
    private int []queue;
    private int maxSize;
    private int front;
    private int rear;
    private int noItems;

    public circularQueue(int no) {
        this.maxSize = no;
        this.queue = new int[this.maxSize];
        this.noItems = 0;
        this.front = 0;
        this.rear = -1;
    }

    public void insert(int no) {
        if(noItems == maxSize) {
            System.out.println("queue is full");
        }else {
            if(rear == maxSize - 1) {
                rear = -1;
            }
            queue[++rear] = no;
            noItems++;
        }
    }

    public int remove() {
        if(noItems == 0) {
            System.out.println("queue is empty");
            return -99;
        }else {
            int temp = queue[front++];
            if (front == maxSize) {
                front = 0;
            }
            noItems--;
            return temp;
        }
    }

    public int peekfront() {
        if (noItems == 0) {
            System.out.println("queue is empty");
            return -99;
        }else {
            return queue[front];
        }
    }

    public boolean isEmpty() {
        return (noItems == 0);
    }

    public boolean isFull() {
        return (noItems == maxSize);
    }
}
