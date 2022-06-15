import java.util.*;
public class ll {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("this");
        list.addLast("is");
        list.addFirst("this");
        list.addLast("is");
        list.addFirst("this");
        list.addLast("is");
        System.out.println(list.size());
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        list.removeFirst();
        System.out.println();
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println();

        list.removeLast();
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+"->");
        }
    }
}
