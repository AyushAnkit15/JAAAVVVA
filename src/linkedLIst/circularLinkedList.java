package linkedLIst;

public class circularLinkedList {
    public Node head ;
    public Node tail ;
    public  int size ;


    public Node createCircularList(int nodeValue){
        head = new Node();
        Node node = new Node() ;
        node.value =nodeValue ;
        node.next = node ;
        head = node;
        tail = node ;
        size  = 1 ;
        return head;



    }
    public void insertion(int nodeValue , int location){
        Node node = new Node();
        node.value =nodeValue ;
        if (head== null){
            createCircularList(nodeValue);
            return ;
        }
        else if(location == 0){
node.next = head ;
head=  node ;
tail.next = head ;



        }
        else if(location>=size){
          tail.next = node ;
          tail = node ;
          tail.next  = node ;
        }
        else {
            Node tempNode  = head ;
          int   index = 0 ;
            while(index  < location-1){
                tempNode  = tempNode.next ;
                index++ ;
            }
            node.next = tempNode.next ;
            tempNode.next = node ;


        }
        size++ ;


    }
    public void traverseCircularList(){
        if(head==null){
            System.out.println("list banao");
        }
        else {
            Node tempNode = head ;
            for(int  i =  0 ; i< size ; i++){
                System.out.print(tempNode.value);
                if(i != size -1){
                    System.out.print("->");
                }
                tempNode = tempNode.next ;
            }
            System.out.print(" ");
        }
    }
    public boolean searchCNode(int nodeValue ){
        boolean r = true ;
        if(head != null){
            Node tempNode = head ;
            for(int  i = 0 ; i< size ; i++){
                if(tempNode.value == nodeValue){
                    //return r ;
                    System.out.println("found at location " + i );
                    return true ;
                }
                tempNode = tempNode.next ;

            }


        }

            System.out.println("not found");
            return false ;


    }
    public void deletionCNode(int location ) {
        if (head == null) {
            return;
        }
         else if (location == 1) {
            head = head.next;
            tail.next = head;
            size-- ;

            if (size == 0) {
                head = null;
                tail = null;

            }


        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head = null;
                tail = null;

            } else {
                tempNode.next = head;
                tail.next = tempNode;
                tail = tempNode;
            }
            size-- ;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next ;
            size-- ;

        }
    }
}
