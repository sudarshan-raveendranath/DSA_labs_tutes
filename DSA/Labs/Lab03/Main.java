public class Main {
    public static void main(String[] args) {
        LinkList newlist = new LinkList();

        newlist.insertFirst(10);
        newlist.insertFirst(20);
        newlist.insertFirst(30);
        newlist.insertFirst(40);

        newlist.displayList();

        while(!newlist.isEmpty()) {
            Link deletelink = newlist.deleteFirst();
            System.out.println("Deleted");
            deletelink.displayLink();
        }
    }
}