package sote_abgaben.abgabe10_avlTrees.exercise1;

public class Node {
    Node left;
    Node right;
    int content;

    public Node(int content) {
        this.content = content;
    }

    public void insert(int content) {
        if (content < this.content) { //wenn kleiner links einfüfen
            if (left == null) { //prüfen ist es frei
                Node node = new Node(content); //wenn ja einfügen
                left = node;
            } else {
                left.insert(content); //ansonsten rekursiv nochmal aufrifen wieder prüfen
            }
        }

        if (content > this.content) {
            if (right == null) {
                Node node = new Node(content);
                right = node;
            } else {
                right.insert(content);
            }

        }
    }

    public int size() {
        int size = 1;
        if (left != null) {
            size += left.size();
        }
        if (right != null) {
            size += right.size();
        }
        return size;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public boolean contains(int content) { //rekursiv weil man sucht solange es keine Knoten mehr gibt, content wird bei Übergabe nie verändert
        boolean doesContain = false;
        if (this.content == content) {
            return true;

        }
        if (left != null && content < this.content) {
            doesContain = left.contains(content); //methode wird aufgerufen diese liefert boolean also true oder false
        }
        if (right != null && content > this.content) {
            doesContain = right.contains(content);
        }
        return doesContain;
    }

    public boolean isFull() {

        if (left == null && right == null) {
            return true;
        }
        if (left != null && right!=null) {
          return left.isFull() && right.isFull();
        }
        return false;



    }


}
