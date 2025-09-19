package LinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addatindex(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while(i < index - 1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printll(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int removefirst(){
        if(size == 0){
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size == 0){
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }

        int val = temp.next.data;
        temp.next = null;
        size--;
        tail = temp;
        return val;
    }

    public int search(int key){
        if(size == 0){
            return -1;
        }
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        LinkedList sll = new LinkedList();
        sll.addFirst(1);
        sll.addFirst(2);
        sll.addLast(3);
        sll.addLast(4);

        sll.printll();
    }
}
