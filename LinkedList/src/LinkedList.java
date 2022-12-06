import java.util.*;

public class LinkedList implements ILinkedList{

    public Node head;
    public Node tail;
    int size;

    public LinkedList(){

    }

    public LinkedList(int data){
        head = createNode(data);
    }

    @Override
    public Node createNode(int data){
        Node newNode = new Node(data);

        head = newNode;
        tail = newNode;
        size = 1;

        return head;

    }

    @Override
    public void addFirst(int data){
        Node node = new Node(data);

        if (this.head != null){
            node.next = this.head;
        }
        this.head = node;
        size ++;
    }

    @Override
    public void addLast(int data){
        Node node = new Node(data);

        if(this.head == null){
            this.head = node;
            this.tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size ++;
    }

    @Override
    public void addMiddle(int data, int location){
        Node node = new Node(data);
        if(location == 0){
            if(head == null){
                this.head = node;
            }else{
                node.next = this.head;
                this.head = node;
            }
        }else if(location >= size){
            this.tail.next = head;
            this.tail = head;
        }else{
            int i = 0;
            Node temp = head;
            while(i <= location - 1){
                temp = temp.next;
                i ++;
            }

            Node mid = temp.next;
            node.next = mid;
            temp.next = node;
        }
        size ++;
    }

    @Override
    public void insertLinkedList(int data, int location){
        Node node = new Node(data);
        if(location == 0){
            if(this.head == null){
                this.head = node;
                this.tail = node;
            }else{
                node.next = this.head;
                this.head = node;
            }
        }else if(location >= size){
            this.tail.next = node;
            this.tail = node;

        }else{
            Node temp = this.head;
            int i = 0;
            while( i++ < location ){
                temp = temp.next;
            }

            Node mid = temp.next;
            node.next = mid;
            mid.next = node;
        }
        size ++;
    }

    @Override
    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    @Override
    public Node middleOfLinkedList(){
        Node res = this.head;
        Node temp = this.head;

        while(temp.next != null && temp.next.next != null){
            temp = temp.next.next;
            res = res.next;
        }
        return res;
    }

    @Override
    public int searchLinkedList(int data){
        Node temp = this.head;
        int location = -1;

        while(temp != null){
            if(temp.data == data) return location;
            location ++;
            temp = temp.next;
        }
        return location;
    }

    @Override
    public void deleteFromLinkedList(int data){
        Node temp = this.head;

        while(temp != null){
            if(temp.next.data == data){
                break;
            }
            temp = temp.next;
        }

        Node del = temp.next.next;
        temp.next = del;

        size --;

    }

    @Override
    public void deleteGivenLocation(int location){
        Node temp = this.head;

        int i = 0;

        while(i ++ < location - 1){
            temp = temp.next;
        }

        Node del = temp.next.next;

        temp.next = del;
        size --;
    }

    @Override
    public void traversalList(){
        Node temp = head;
        if(head == null){
            System.out.println("Head is Null");
            return;
        }
        for(int i = 0; i < size; i++){
            System.out.print(temp.data);
            if(i != size - 1){
                System.out.print(" -> ");
            }
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        System.out.println();
        return;
    }

    @Override
    public void traversalList1(){
        Node head = this.head;
        while(head != null){
            System.out.print(head.data);
            if(head.next != null){
                System.out.print(" -> ");
            }
            head = head.next;
        }
        return;
    }

    @Override
    public void deleteFromStart(){
        Node temp = this.head;
        if(this.head == null){
            System.out.println("This list has no member");
            return ;
        }
        if(size == 1){
            this.head = null;
            this.tail = null;
        }else{
            this.head = this.head.next;
        }

        size --;
    }

    @Override
    public void deleteFromEnd(){


        if(this.head == null){
            System.out.println("This list has no member");
            return;
        }

        if(size == 1){
            this.head = this.tail = null;
        }else{
            Node temp = this.head;

            while(temp.next.next != null){
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
        }
        size --;
    }

    @Override
    public void deleteFromList(int location){

        if(this.head == null){
            System.out.println("This list is null");
            return;
        }
        if(size == 1){
            this.head = null;
            this.tail = null;
            return;
        }

        if(location == 0){
            this.head = this.head.next;

        }else if(location >= size){
            Node last = this.head;
            while(last.next.next != null){
                last = last.next;
            }
            last.next = null;
            tail = last;

        }else{
            int i = 0;
            Node val = this.head;

            while(i++ < location - 1){
                val = val.next;
            }

            val.next = val.next.next;
        }

        size --;

    }

    /*
    * reverse
    * Traverse
    * LinkeList
    * Stack Method*/
    @Override
    public LinkedList traverse_revere_stack_method(){
        Stack<Integer> stack = new Stack<>();

        Node temp = this.head;

        while(temp != null){
            stack.add(temp.data);
            temp = temp.next;
        }

        LinkedList result = new LinkedList();

        while(!stack.isEmpty()){
            result.addLast(stack.pop());
        }

        return result;

    }

    @Override
    public LinkedList traverse_tradition_method(){
        Node prev = null;
        Node current = this.head;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        this.head = prev;
        return this;
    }


    @Override
    public void mergeTwoLinkedList(LinkedList list){
        this.size += list.size;
        Node tail = list.tail;
        this.tail.next = list.head;
        this.tail = tail;
        return;
    }

    public static LinkedList deleteDublicate(LinkedList list){

        Node head = list.head;
        LinkedList result = new LinkedList(0);
        Node resHead = result.head;
        while(head.next != null){
            if (head.data != head.next.data) {
                result.size++;
                System.out.println(head.data + "  ---  " + head.next.data);
                if(resHead.data != head.data){
                    resHead.next = head;
                }

                resHead = resHead.next;
                head = head.next;
            }else{
                head = head.next;
            }
//            head = head.next;
        }

        System.out.println(result.size);

        result.head = result.head.next;

        return result;
    }

}
