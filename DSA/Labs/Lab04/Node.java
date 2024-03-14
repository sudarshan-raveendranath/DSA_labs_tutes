public class Node {
    public int emp;
    public String name;
    public Node leftChild;
    public Node rightChild;

    public Node(int emp,String name) {
        this.emp = emp;
        this.name = name;
    }
    public void displayNode() {
        System.out.print("{ ");
        System.out.print(emp);
        System.out.print(", ");
        System.out.print(name);
        System.out.print(" } ");
    }
}
