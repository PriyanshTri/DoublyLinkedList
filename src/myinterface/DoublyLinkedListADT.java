package myinterface;
//this is adt of doubly linked list
public interface DoublyLinkedListADT {
    int size();   //O(1);
    boolean isEmpty();  //O(1);
    void addFirst(int element);  //O(1);
    void addLast(int element);   //O(1);
    int first();                 //O(1);
    int last();                  //O(1);
    void traverseForward();       //O(N);
    void traverseBackward();      //O(N);
    void removeFirst();           //O(1);
    void removeLast();            //O(1)
    boolean addAfterGivenElement(int element,int givenElement);      //O(N)
    boolean addBeforeGivenElement(int element,int givenElement);      //O(N)

}
