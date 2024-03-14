public class LinkList {
    private Link first;

    public LinkList() {
        this.first = null;
    }
    public boolean isEmpty() {
        return(first == null);
    }
    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
    public boolean delete(int key) {
        Link temp = first;
        Link previous = null;
        while(temp != null) {
            if(temp.iData == key) {
                if(previous == null) {
                    first = temp.next;
                }else {
                    previous.next = temp.next;
                }
                return true;
            }
            previous = temp;
            temp = temp.next;
        }
        return false;
    }
    public boolean insertAfter(int key,int newData) {
        Link current = first;
        while(current != null) {
            if(current.iData == key) {
                Link newlink = new Link(newData);
                newlink.next = current.next;
                current.next = newlink;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void insertFirst(int id) {
        Link newlink = new Link(id);
        newlink.next = first;
        first = newlink;
    }

    public Link find(int key) {
        Link current = first;
        while(current != null) {
            if(current.iData == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
