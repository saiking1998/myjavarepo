import java.util.Stack;

public class stackinsatbotton {
    public class stackclass{
        public static void pushatbottom(int data , Stack<Integer> s){
            if(s.size()==0){
                s.push(data);
                return;
            }
            int temp = s.pop();
            pushatbottom(data, s);
            s.push(temp);
        }
    }
    public static void main(String[] args) {
      Stack<Integer> s  =  new Stack<>();
      s.push(1);
        s.push(2);
        s.push(3);

        stackclass.pushatbottom(4,s);


        while(s.size() !=0){
            System.out.println(s.pop());
               }
    }
}
