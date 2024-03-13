public class Link {
    public int iData;
    public Link next;

    public Link(int id) {
        this.iData = id;
        this.next = null;
    }

    public void displayLink() {
        System.out.println(this.iData);
    }
}
