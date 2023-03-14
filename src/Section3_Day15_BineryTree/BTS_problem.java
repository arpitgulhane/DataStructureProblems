package Section3_Day15_BineryTree;

interface INode {
    int getData();
    INode getLeft();
    INode getRight();
    void setLeft(INode left);
    void setRight(INode right);
}

class MyBinaryNode implements INode {
    private int data;
    private INode left;
    private INode right;

    public MyBinaryNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return this.data;
    }

    public INode getLeft() {
        return this.left;
    }

    public INode getRight() {
        return this.right;
    }

    public void setLeft(INode left) {
        this.left = left;
    }

    public void setRight(INode right) {
        this.right = right;
    }
}

class MyBinarySearchTree {
    private INode root;

    public MyBinarySearchTree() {
        this.root = null;
    }

    public void insert(int data) {
        this.root = insertRecursive(this.root, data);
    }

    private INode insertRecursive(INode node, int data) {
        if (node == null) {
            return new MyBinaryNode(data);
        }

        if (data < node.getData()) {
            node.setLeft(insertRecursive(node.getLeft(), data));
        } else if (data > node.getData()) {
            node.setRight(insertRecursive(node.getRight(), data));
        }

        return node;
    }
    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(INode node, int data) {
        if (node == null) {
            return false;
        }

        if (data == node.getData()) {
            return true;
        }

        if (data < node.getData()) {
            return searchRec(node.getLeft(), data);
        } else {
            return searchRec(node.getRight(), data);
        }
    }

}



public class BTS_problem {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);

        if (bst.search(80)){
            System.out.println("Present ");
        }else {
            System.out.println("Not Present");
        }
    }
}
