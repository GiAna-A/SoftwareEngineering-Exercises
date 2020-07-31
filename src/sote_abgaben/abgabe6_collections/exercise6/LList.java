package sote_abgaben.abgabe6_collections.exercise6;

import sote_abgaben.abgabe6_collections.exercise1.Node;

import java.util.Iterator;

public class LList <T> implements Iterable<Passenger> {
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
        int length = 1;
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
                length++;
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
            for (; currentNode.getNextNode() != null; length++) {
                currentNode = currentNode.getNextNode();
            }
            return length;
        }
    }

    public Object get(int index) {

        Node currentNode = head;
        for (int i = 0; i < index; i++) {

            currentNode = currentNode.getNextNode();
        }

        return currentNode.getContent();
    }


    public void remove(int index) {
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
        boolean removed = false;
        Node currentNode = head; //Erstes Element
        if (currentNode.getContent().equals(object)) {
            head = currentNode.getNextNode();
            currentNode.setContent(null);
            return true;
        }
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
            if (currentNode.getContent().equals(object)) { //zwischenelemente entfernen
                currentNode.getNextNode().setPreviousNode(currentNode.getPreviousNode());
                currentNode.getPreviousNode().setNextNode(currentNode.getNextNode());
                currentNode.setContent(null);
                return true;

            }
            currentNode = currentNode.getNextNode(); //trz Inhalt ausgeben ohne das danach keine INhalte
        }
        if (currentNode.getContent() == object) {
            currentNode.getPreviousNode().setNextNode(null);
            currentNode.setContent(null);
            removed = true;
        }
        return removed;
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
            if (i == index) { //wenn index gefunden ist
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
    public Iterator<Passenger> iterator() {
        return new LListIterator(head);
    }


class LListIterator implements Iterator<Passenger> {

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
    public Passenger next() {
        currentNode = currentNode.getNextNode();
        return (Passenger)currentNode.getContent();
    }
}

}