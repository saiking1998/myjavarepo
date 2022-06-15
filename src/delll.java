import java.util.Scanner;

public class delll {
    static class Node {
        int value;
        Node next;
        Node(int val){
            this.value = val;
            this.next= null;
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head= null;
        Node tail = null;
        for(int i=0;i<n;i++){
            Node newnode = new Node(sc.nextInt());
            if(head == null){
                head = newnode;
                tail = newnode;
            }
            else{
                tail.next = newnode;
                tail = tail.next;
            }
        }
        Node curr  = head;
        Node nex = head.next;
        for(int i=0;i<n ;i++){
            if(i == n-1){
                curr.next = nex.next;
            }else{
                curr = curr.next;
                nex = nex.next;
            }
        }
        while(head.next != null){
            System.out.print(head.value+" ");
            head = head.next;
        }
    }
}
