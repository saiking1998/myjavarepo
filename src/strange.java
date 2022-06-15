import java.util.Scanner;

public class strange {
    static class Node{
        char value;
        Node next;
        Node(char val){
            this.value = val;
            this.next= null;
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] arr ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Node head = null;
        Node tail = null;
        int ins =0;
        int pos = 0;
        boolean bool = false;
        while(pos < n){

            if(ins >25){
                ins =0;
            }
            Node newnode  = new Node(arr[ins]);

            if(head == null){
                head = newnode;
                tail= newnode;
            }
            else{
                if(bool == false){
                    tail.next = newnode;
                    tail = tail.next;
                    bool = true;
                }
                else{
                    newnode.next = head;
                    head = newnode;
                    bool = false;
                }
            }

            ins ++;
            pos++;
        }
        while(head!= null){
            System.out.print(head.value);
            head=head.next;
        }
    }
}
