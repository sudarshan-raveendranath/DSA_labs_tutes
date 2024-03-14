public class Tree {
    public Node root;

    public Tree() {
        root = null;
    }
    public Node getRoot() {
        return root;
    }
    public void insert(int empNo,String name) {
        Node newnode = new Node(empNo,name);

        if(root == null) {
            root = newnode;
        }else {
            Node current = root;
            Node parent;
            while(true) {
                parent = current;
                if(empNo < current.emp) {
                    current = current.leftChild;
                    if(current == null) {
                        parent.leftChild = newnode;
                        return;
                    }
                }else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newnode;
                        return;
                    }
                }
            }
        }
    }
    public void deleteAll() {
        root = null;
    }
    public void findRecursive(int empNo) {
        Node foundNode = findRecursive(root,empNo);
        if(foundNode != null) {
            System.out.println("Employee found: " + foundNode.emp + ", " + foundNode.name);
        }else {
            System.out.println("Employee with id " + empNo + " not found,");
        }
    }
    public Node findRecursive(Node node,int empNo) {
        if(node == null || node.emp == empNo) {
            return node;
        }
        if(empNo < node.emp) {
            return findRecursive(node.leftChild, empNo);
        }else {
            return findRecursive(node.rightChild,empNo);
        }
    }
    public Node find(int key){
        Node current = root;
        while(current != null) {
            if(key < current.emp) {
                current = current.leftChild;
            }else {
                current = current.rightChild;
            }
            if(current == null) {
                return null;
            }
        }
        return current;
    }

    public void inOrder(Node localRoot) {
        if(localRoot !=null) {
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);
        }
    }
    public void preOrder(Node localRoot) {
        if(localRoot !=null) {
            localRoot.displayNode();
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }
    public void postOrder(Node localRoot) {
        if(localRoot !=null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            localRoot.displayNode();
        }
    }
}
