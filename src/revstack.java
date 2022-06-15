import java.util.Stack;

public class revstack {

    public class reverse{

        public static void stackreverse(Stack<Integer> s){
            if(s.size() !=0){
                return;
            }
            int temp = s.pop();
            stackreverse(s);
            s.push(temp);
        }
    }

    public static void main(String[] args) {
       Stack<Integer> s = new Stack<>();
       s.push(2);
        s.push(5);
        s.push(8);
        s.push(9);

        while(s.size()!=0){
            System.out.println(s.pop());
        }
            }
}
