import java.util.Objects;

public class studentLinkList {
    private studentLink first;

    public studentLinkList() {
        this.first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void displayList() {
        studentLink current = first;
        while(current != null) {
            current.displayStudent();
            current = current.next;
        }

    }

    public void insertFirst(String name, double avg) {
        studentLink newstudent = new studentLink(name,avg);
        newstudent.next = first;
        first = newstudent;
    }

    public studentLink deleteFirst() {
        studentLink temp = first;
        first = first.next;
        return temp;
    }

    public void deleteLink(String name) {
        studentLink temp = first;
        studentLink previous = null;
        while(temp != null) {

            if(temp.name.equals(name)) {
                if(previous == null) {
                    first = temp.next;
                }else {
                    previous.next = temp.next;
                }
            }
            previous = temp;
            temp = temp.next;
        }
        displayList();

    }
}
