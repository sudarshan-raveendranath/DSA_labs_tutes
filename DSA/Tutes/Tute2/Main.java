public class Main {
    public static void main(String[] args) {
        LinkList mylink = new LinkList();

        mylink.insertFirst(10);
        mylink.insertFirst(20);
        mylink.insertFirst(30);
        mylink.insertFirst(40);
        mylink.insertFirst(50);
        mylink.insertFirst(60);

        System.out.println();
        System.out.println("before insertion");
        mylink.displayList();

        System.out.println();
        System.out.println("after insertion");
        boolean res = mylink.insertAfter(30,70);
        if(res) {
            mylink.displayList();
        }else {
            System.out.println("key value not found");
        }

        System.out.println();
        System.out.println("before deletion");
        mylink.displayList();

        System.out.println();
        System.out.println("after deletion");
        boolean resdel = mylink.delete(70);
        if(resdel) {
            mylink.displayList();
        }else {
            System.out.println("key value not found");
        }

    }
}