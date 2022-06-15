import java.util.*;
public class linkdll {
    Node head;
    private  int size;
    linkdll(){
        this.size = 0;

    }
   class Node{

        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add first
    public void addfirst(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    //add last
    public void addlast(String data){
        Node newnode = new Node(data);
        if(head == null){
            head  = newnode;
        }
        Node currnode = head;
        while(currnode.next!=null){
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }
    public void printlist(){
       if(head == null){
           System.out.println("the linked list is empty");
           return;
       }
        Node currnode = head;

        while(currnode!=null){
            System.out.print(currnode.data+"->");
            currnode = currnode.next;
        }
        System.out.print("null");
    }
    public void deletefirst(){
       if(head == null){
           System.out.println("there is nothing to delete");
       }
       head.next = head;
       size--;
    }
    public void deletelast(){
        if(head == null){
            System.out.println("there is nothing to delete");
        }
        size--;
        if(head.next ==null){
            head =null;

            return;
        }
        Node lastbutone  = head;
        Node lastele = head.next;
        while(lastele.next !=null){
           lastbutone = lastbutone.next;
            lastele = lastele.next;
        }
        lastbutone.next= null;

    }
    public int getsize(){
        return size;
    }
    public void deleteele(String data){
        Node prev = null;
        Node curr = head;

        if(curr.data ==data){
            head = curr.next;
            return;
        }
        else{
            while(curr.data != data && curr.next!=null){
                prev = curr;
                curr=curr.next;

            }
            if(curr.next ==null){
                prev.next=null;
            }
            else{
                prev.next=curr.next;
            }
        }
    }

    public static void main(String[] args) {
      linkdll list = new linkdll();
      list.addfirst("is");
      list.addfirst("this");
      list.addlast("a");
      list.addlast("linkdlist");
      list.printlist();
        System.out.println(" ");
        list.deleteele("a");
        list.printlist();

    }
}
