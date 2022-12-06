public interface ILinkedList {

    Node createNode(int data);

    void addFirst(int data);

    void addLast(int data);

    void addMiddle(int data, int location);

    void insertLinkedList(int data, int location);

    void printList();

    Node middleOfLinkedList();

    int searchLinkedList(int data);

    void deleteFromLinkedList(int data);

    void deleteGivenLocation(int location);

    void traversalList();

    void traversalList1();

    void deleteFromStart();

    void deleteFromEnd();

    void deleteFromList(int location);

    LinkedList traverse_revere_stack_method();

    LinkedList traverse_tradition_method();

//    void mergeTwoLinkedListSorted(LinkedList list);

    void mergeTwoLinkedList(LinkedList list);

}
