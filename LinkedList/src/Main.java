import java.util.*;

//import com.google.common.math.LongMath;


public class Main{
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList list = new LinkedList(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(3);
        list.addLast(4);
        list.addLast(4);
//        list.addLast(4);
//        list.addLast(4);

        LinkedList list1 = new LinkedList(5);
        list1.addLast(2);
        list1.addLast(1);
        list1.addLast(8);

        LinkedList res = LinkedList.deleteDublicate(list);

        res.traversalList1();
        System.gc();
//        list.mergeTwoLinkedListSorted(list1);

//        list.mergeTwoLinkedList(list1);
//        list.traversalList();

//        list.mergeTwoLinkedListSorted(list1);

//        list.traversalList();

//        list.traversalList();

//        revList.traversalList();
//        list.printList();

    }
}