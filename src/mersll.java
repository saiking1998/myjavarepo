import java.util.Scanner;

public class mersll {
    static class Node{
        int value;
        Node next;
        Node(int val){
            this.value = val;
            this.next =null;
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head1 = null;
        Node tail1 = null;
        for(int i=0;i<n;i++){
            Node newnode = new Node(sc.nextInt());
            if(head1 == null){
                head1 = newnode;
                tail1 = newnode;
            }
            else{
                tail1.next = newnode;
                tail1 = tail1.next;
            }
        }

        int m = sc.nextInt();
        Node head2 = null;
        Node tail2 = null;
        for(int i=0;i<m;i++){
            Node newnode = new Node(sc.nextInt());
            if(head2 == null){
                head2 = newnode;
                tail2 = newnode;
            }
            else{
                tail2.next = newnode;
                tail2 = tail2.next;
            }
        }
        Node mhead = null;
        Node mtail = null;
        while(head1 !=null || head2 !=null){
            if(head1==null && head2!= null){
                mtail.next = head2;
                break;
            }
            else if(head2 == null && head1!= null){
                mtail.next = head1;
                break;
            }
            else if(head1!=null && head2 !=null){
                if(head1.value < head2.value){
                    if(mhead == null){
                        mhead = head1;
                        mtail = head1;
                        head1 = head1.next;
                    }
                    else{
                        mtail.next = head1;
                        mtail= mtail.next;
                        head1 = head1.next;
                    }
                }
                else{
                    if(mhead == null){
                        mhead = head2;
                        mtail = head2;
                        head2 = head2.next;
                    }
                    else{
                        mtail.next = head2;
                        mtail= mtail.next;
                        head2 = head2.next;
                    }
                }
            }
        }
        while(mhead != null){
            System.out.print(mhead.value+" ");
            mhead = mhead.next;
        }
    }
}
