package sote_abgaben.abgabe6_collections.exercise1;

import sote_abgaben.abgabe8_exceptions.exercise2.LListTooSmallException;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.UnaryOperator;

public class LList  implements Iterable<Object> {
    private Node head;


    public void insert(Object content) {

        Node newNode = new Node(content);
        Node currentNode = head;
        if (head == null) {
            head = newNode;
        } else {

            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
            newNode.setPreviousNode(currentNode);
        }
    }

    //Exercise 3: Insert Methode
    public void insert(int index, Object object) {
        Node currentNode = head;
        Node newNode = new Node(object);

        //For first element
        if (index == 0) {
            head = newNode;
            newNode.setNextNode(currentNode);
            currentNode.setPreviousNode(newNode);
            return;
        }

        //For middle Element
        for (int i = 1; i <= index; i++) {
            if (index == i) { //4pfeile die man verändern muss!!
                newNode.setNextNode(currentNode);
                newNode.setPreviousNode(currentNode.getPreviousNode());
                currentNode.getPreviousNode().setNextNode(newNode);
                currentNode.setPreviousNode(newNode);
                return;
            } else if (currentNode.getNextNode() != null) { //hier iteriert durch LList
                currentNode = currentNode.getNextNode();

            } else {
                System.out.println("Liste hat nicht genug Elemente");
                break;

            }

        }
    }

    public int size() {

        if (head == null) {
            return 0;
        } else {

            Node currentNode = head;
            int length = 1;
            for (int i=0; currentNode.getNextNode() != null; length++) {
                currentNode = currentNode.getNextNode();
            }
            return length;
        }
    }

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

    //Ex 4: Remove Methode:
    public boolean remove(Object object) {

        Node currentNode = head; //Erstes Element
        if (currentNode.getContent().equals(object)) {
         // head = currentNode.getNextNode();
            currentNode.setContent(null);
            return true;
        }
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
            if (currentNode.getContent().equals(object)) {
                if(currentNode.getNextNode()!=null){
                    currentNode.getNextNode().setPreviousNode(currentNode.getPreviousNode());
                }
                currentNode.getPreviousNode().setNextNode(currentNode.getNextNode());
                currentNode.setContent(null);
                return true;
            }
            currentNode = currentNode.getNextNode(); //Iterator
        }

        return false;
    }


    //Exercise 1: contain Methode
    public boolean contains(Object object) {
        if (head == null) { //erst prüfen ob überhaipt Knoten drin sind
            return false;
        }
        Node currentNode = head; //Index setzen weil Listen haben keinen Index
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode(); //damit es nicht im head bleiben
            if (currentNode.getContent() == object) { //entsprciht der Inhalt dem Object welches oben übergeben wird
                return true;
            } //beim letzen angekommen gibt aber nichts aus, springt aus while raus
        }
        return currentNode.getContent() == object; //soll aber trz Inhalt ausgeben
    }

    //Exercise 2: put Methode
    public void put(int index, Object object) {
        Node currentNode = head; //von Anfang iterieren
        for (int i = 0; i <= index; i++) { //
            if (i == index) { //wenn Knoten gefunden ist
                currentNode.setContent(object); //setze inhalz, ansonsten
            } else if (currentNode.getNextNode() != null) { //currentNode auf nöchsten Knoten setzen wieder in for und i++ wieder prüfen
                currentNode = currentNode.getNextNode();
            } else { //ansonsten wenn ende erreicht dann nicht genug elemente
                System.out.println("Liste hat nicht genug Elemente");
                break;
            }
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