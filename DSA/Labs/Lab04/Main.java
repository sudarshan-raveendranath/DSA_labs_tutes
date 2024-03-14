import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree newtree = new Tree();

        newtree.insert(149,"Anusha");
        newtree.insert(167,"Kosala");
        newtree.insert(047,"Dinusha");
        newtree.insert(066,"Mihiri");
        newtree.insert(159,"Jayani");
        newtree.insert(118,"Nimal");
        newtree.insert(195,"Nishantha");
        newtree.insert(034,"Avodya");
        newtree.insert(105,"Bimali");
        newtree.insert(133,"Sampath");

        System.out.println("traversing inOrder");
        newtree.inOrder(newtree.getRoot());

        System.out.println();
        System.out.println("traversing preOrder");
        newtree.preOrder(newtree.getRoot());

        System.out.println();
        System.out.println("traversing postOrder");
        newtree.postOrder(newtree.getRoot());

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter employee no-");
        int no = sc.nextInt();
        newtree.findRecursive(no);

        System.out.println();
        newtree.deleteAll();
        newtree.inOrder(newtree.getRoot());

    }
}