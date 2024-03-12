import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        circularQueue printerQueue = new circularQueue(5);
        circularQueue evenQueue = new circularQueue(5);
        circularQueue oddQueue = new circularQueue(5);

        for(int i = 0;i <5;i++) {
            System.out.print("enter transaction id = ");
            int temp = sc.nextInt();
            printerQueue.insert(temp);
            if(temp%2 == 0) {
                evenQueue.insert(temp);
                System.out.println("ID " + temp + " is sent to PC1");
            }else {
                oddQueue.insert(temp);
                System.out.println("ID " + temp + " is sent to PC2");
            }
        }

        System.out.println("PC1");
        while (!evenQueue.isEmpty()) {
            System.out.println("Transaction " + evenQueue.remove());
        }

        System.out.println("PC2");
        while (!oddQueue.isEmpty()) {
            System.out.println("Transaction " + oddQueue.remove());
        }
    }

}
