package sote_abgaben.abgabe8_exceptions.exercise2;

import sote_abgaben.abgabe6_collections.exercise1.Node;

import java.util.Iterator;

public class LList implements Iterable<Object> {
    private Node head;


    public void insert(Object content) {

        Node newNode = new Node(content);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
            newNode.setPreviousNode(currentNode);
        }
    }



    public int size() {

        if (head == null) {
            return 0;
        } else {

            Node currentNode = head;
            int length = 1;
            for (; currentNode.getNextNode() != null; length++) {
                currentNode = currentNode.getNextNode();
            }
            return length;
        }
    }

    //Exception 1:
    public Object get(int index) throws LListTooSmallException {


        if (size() <= index) {
            throw new LListTooSmallException("Liste hat nicht genug Elemente.");
        } else {
            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNextNode();
            }

            return currentNode.getContent();

        }

    }


    public void remove(int index) throws LListTooSmallException {


        if (size() <= index) {
            throw new LListTooSmallException("Liste hat nicht genug Elemente");
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }

        currentNode.getPreviousNode().setNextNode(currentNode.getNextNode()); // removal of first elements leads to an
        // exception
        if (currentNode.getNextNode() != null) {
            currentNode.getNextNode().setPreviousNode(currentNode.getPreviousNode());
        }
    }




    @Override
    public Iterator<Object> iterator() {
        return new LListIterator(head);
    }


    class LListIterator implements Iterator<Object> {

        private Node currentNode;


        public LListIterator(Node currentNode) {

            Node dummyNode = new Node(null);
            this.currentNode = dummyNode;
            this.currentNode.setNextNode(currentNode);
        }

        @Override
        public boolean hasNext() {

            return currentNode.getNextNode() != null;
        }

        @Override
        public Object next() {
            currentNode = currentNode.getNextNode();
            return currentNode.getContent();
        }
    }

}