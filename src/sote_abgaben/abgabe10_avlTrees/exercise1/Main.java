package sote_abgaben.abgabe10_avlTrees.exercise1;

public class Main {
    public static void main(String[] args) {

        BST tree= new BST();
        tree.insert(10);
        tree.insert(5);
        tree.insert(16);
        tree.insert(2);
        tree.insert(7);
        tree.insert(14);
        tree.insert(18);
        System.out.println(tree.isFull());
        System.out.println(tree.contains(18));



    }

}
