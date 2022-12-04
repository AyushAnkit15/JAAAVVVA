package linkedLIst;

public class Main {
    public static void main(String[] args) {
SinglyLinkedList sll  =new SinglyLinkedList();
sll.createSinglyLinkedList(5) ;
      /*  System.out.println(sll.head.value);
        System.out.println(sll.tail.value);
        System.out.println(sll.head.next);*/
sll.insertInLinkedList(6,1);
        System.out.println(sll.head.next.value);
    }
}
