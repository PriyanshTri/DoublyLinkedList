package myinterface;
//this is adt of doubly linked list
public interface DoublyLinkedListADT {
    int size();                                                     //O(1);     done
    boolean isEmpty();                                              //O(1);     done
    void addFirst(int element);                                     //O(1);     done
    void addLast(int element);                                      //O(1);     done
    int first();                                                    //O(1);     done
    int last();                                                     //O(1);     done
    void traverseForward();                                         //O(N);     done
    void traverseBackward();                                        //O(N);     done
    void removeFirst();                                             //O(1);     done
    void removeLast();                                              //O(1);     done
    boolean addAfterGivenElement(int element,int givenElement);     //O(N);     done
    boolean addBeforeGivenElement(int element,int givenElement);    //O(N);     done

}
