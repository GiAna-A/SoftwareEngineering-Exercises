package sote_abgaben.abgabe10_avlTrees.exercise1;

public class BST <T> {
    private Node root;
    //mit BST wird Wurzel (root) des Baums erstellt, das gleiche wie bei Liste mit head
    // Unterschied zu Listen: Bei Bäumen braucht man Rekursion da Bäume links oder rechts erweitert werden können usw

    public void insert(int content) {
        if (root == null) {
            Node node = new Node(content);
            root = node;

        } else {
            root.insert(content);
        }

    }

    public int size() {
        if (root == null) {
            return 0;
        } else {
            return root.size();
        }
    }

    public boolean contains(int content) { //rekursiv weil man sucht solange es keine Knoten mehr gibt

        if (root == null) {
            return false;
        }

        return root.contains(content);


    }


    public boolean isFull() {
        if (root == null) {
            return false;
        }

        return root.isFull();
    }
}
