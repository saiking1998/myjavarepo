import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
            this.next=null;
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        Node head = null, next=null;
        for(int i=0;i<n;i++)
        {
            if(head==null){
                head = new Node(scan.nextInt());
                System.out.println(head);

            }
            else{

                next = new Node( scan.nextInt());
                if(head.next==null){
                    head.next= next;
                }
                else{
                    next.next=next;
                }

            }
        }

        next.next=head;
        for(int i=0;i<n ;i++){
            System.out.println(head.value+" ");
            head= head.next;
        }
    }
}