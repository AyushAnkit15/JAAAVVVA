package linkedLIst;

public class SinglyLinkedList{
public Node head;
public  Node tail;
public  int size ;


public Node createSinglyLinkedList(int nodeValue){
    head  = new Node() ;
    Node node = new Node();
    node.next =null ;
    node.value =nodeValue ;
    head =node  ;
    tail = node ;
    size =1 ;
    return head;
}
//insertion method
    public void insertInLinkedList(int nodeValue ,int location){
    Node node  = new Node();
    node.value =nodeValue ;
    if(head == null){
        createSinglyLinkedList(nodeValue);
        return ;

    }
    else if(location==0){
        node.next = head ;
        head = node ;
    }
    else if(location>=size){
        node.next = null ;
        tail.next = node ;
        tail = node ;

    }
    else{
        Node tempNode = head ;
        int index = 0 ;
        while(index<location -1){
        tempNode  =tempNode.next ;
        index++;
        }
        Node nextNode = tempNode.next ;
        tempNode.next  =node ;
        node.next  =nextNode ;
    }
size++ ;
    }
    //traversal
    public void traverseSingleLinkedList(){
    if(head==null){
        System.out.println("does not exist");

    }
    else {
        Node tempNode = head ;
        for(int  i= 0 ; i<size ;i++){
            System.out.print(tempNode.value);
            if(i != size-1){
                System.out.print("->");

            }
            tempNode = tempNode.next ;
        }
    }
        System.out.println(" ");
    }
    boolean searchNode(int nodeValue){
    boolean r = true ;
    if(head != null){
        Node tempNode = head ;
        for(int  i = 0  ; i<size ; i++){
            if(tempNode.value==nodeValue){
                System.out.println("found at " +  i);
                r =true;

            }
            tempNode = tempNode.next ;
        }
    }
    else {
        System.out.println("nahi mila");
        r = false ;

    }
    return r ;
    }
    public void deletionOfNode(int location){
    if(head == null){
        System.out.println("nahi hai be");
        return ;
    }
    else if(location == 0){
        head = head.next ;
        size--;
        if(size==0){
            tail = null ;
        }
    }
    else if(location>=size){
        Node tempNode = head ;
        for(int  i = 0 ;i < size-1 ; i++){
            tempNode = tempNode.next ;

        }
        if(tempNode==head){
            head = null;
            tail = null ;

        }
        else{
            tempNode.next = null ;
            tail = tempNode ;
            size-- ;


        }
    }
    else{
        Node tempNode = head  ;
        for(int i = 0 ; i< location-1 ; i++){
            tempNode = tempNode.next ;
        }

        tempNode.next =tempNode.next.next;
        size--;
    }

    }
    public void deleteList(){
    head = null;
    tail = null ;
    }
    }

