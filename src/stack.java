public class stack {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stacks {
        public static Node head;

        public static void push(int data) {
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;
            } else {
                newnode.next = head;
                head = newnode;
            }
        }

        public static int pop() {
            if (head == null) {
                System.out.println("sorry stack is empty");
                return -1;
            }
            int top = head.data;

            head = head.next;
            return top;
        }
     public static int peek(){
         if (head == null) {
             System.out.println("sorry stack is empty");
             return -1;
         }
            return head.data;
     }
        public static void main(String[] args) {
                stacks s =new stacks();
                s.push(1);
                s.push(5);
                s.push(2);
                 s.push(102);
            System.out.println(s.pop());
            System.out.println(s.peek());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.peek());

         }
    }
}