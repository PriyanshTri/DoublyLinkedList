package implimentation;

import myinterface.DoublyLinkedListADT;

public class MyDoublyLinkedList implements DoublyLinkedListADT {
    private Node head;
    private int size;
    private Node previous;
    private Node tail;

    public MyDoublyLinkedList() {
        head = null;
        previous = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    public void traverseForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " --__ ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    public void traverseBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.getData() + " --__ ");
            temp = temp.getPrevious();
        }
        System.out.println("null");
    }

    //right code
    @Override
    public void removeFirst() {
        if (!isEmpty()) {
            head = head.getNext();
            if (head != null) {
                head.setPrevious(null);
            }
        } else {
            tail = null;
        }
        size--;
    }

    @Override
    public void removeLast() {
        if (!isEmpty()) {
            tail = tail.getPrevious();
            if (tail != null) {
                tail.setNext(null);
            } else {
                tail = null;
            }
            size--;
        }

    }

    //getting null pointer exception
    @Override
    public boolean addAfterGivenElement(int element, int givenElement) {
        boolean response = false;
        Node node = new Node(element);
        Node temp = head;
        // loop to find givenelement node
        while (temp != null) {
            //if given node is found
            if (temp.getData() == givenElement) {
                if(node.getNext()!=null){
                    node.setNext(temp.getNext());
                    node.setPrevious(temp);
                    temp.setNext(node);
                    node.getNext().setPrevious(node);
                    if(node.getNext()==null){
                        tail=node;
                    }
                }
                else{

                }
                response = true;

                size++;
                break;
            }
            temp = temp.getNext();
        }

        return response;
    }

    //incomplete code
    @Override
    public boolean addBeforeGivenElement(int element, int givenElement) {
        boolean response = false;
        Node node = new Node(element);
        Node temp = head;
        Node before = null;
        while (temp != null) {
            if (temp.getData() == element) {
                temp.setPrevious(node);
                before.setNext(node);
                node.setNext(temp);
                node.setPrevious(before);
                size++;
                response = true;
            }
            before = temp;
            temp = temp.getNext();
        }
        return response;
    }

    @Override
    public void addFirst(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            Node temp = head;
            head = node;
            temp.setPrevious(node);
        }
        size++;

    }

    //right program
    public void addLast(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            head = node;
        } else {
            node.setPrevious(tail);
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    @Override
    public int first() {
        return head.getData();
    }

    @Override
    public int last() {
        return tail.getData();
    }

}
