public class studentMain {
    public static void main(String[] args) {
        studentLinkList newlist = new studentLinkList();

        newlist.insertFirst("Nipuna",53.5);
        newlist.insertFirst("Aravinda",78.0);
        newlist.insertFirst("Prashani",69.5);
        newlist.insertFirst("Lasindu",80.0);
        newlist.insertFirst("Sudarshan",100.0);

        newlist.displayList();

        System.out.println();
        System.out.println("After deleting");
        newlist.deleteLink("Nipuna");



    }
}
