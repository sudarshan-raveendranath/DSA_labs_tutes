public class studentLink {
    public String name;
    public double avg;

    public studentLink next;

    public studentLink(String name, double avg) {
        this.name = name;
        this.avg = avg;
        this.next = null;
    }

    public void displayStudent() {
        System.out.println("Name = " + this.name + " Average = " + this.avg);
    }
}
