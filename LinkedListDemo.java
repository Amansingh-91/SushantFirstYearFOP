public class LinkedListDemo {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public boolean insertAtBegin(int data){
        if(this.head == null){
            this.head = new Node(data);
            return true;
        }
        else{
            Node temp = new Node(data);
            temp.next = this.head;
            this.head = temp;
            return true;
        }

    }
    public void insertAtEnd(int data){
        if(this.head == null){
            this.head = new Node(data);

        }
        else{

            Node temp1 =this.head;
            while(temp1.next != null){
                temp1 = temp1.next;
            }
            temp1.next = new Node(data);

        }

    }
    public void printLL(){
        if (this.head == null){
            System.out.println("linked list empty");
        }else{
            Node temp = this.head ;
            while (temp!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedListDemo ll =  new LinkedListDemo();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.printLL();
        ll.insertAtBegin(4);
        ll.printLL();
    }
}
