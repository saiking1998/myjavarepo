import java.util.Scanner;
import java.util.Stack;

public class maxinstack {
    public static void max(Stack <Integer> s){
        int maxele =-1000000;
      for(int i=0;i<s.size();i++){
          maxele = Math.max(maxele,s.get(i));
      }
        System.out.println(maxele);
    }

    public static void main (String[] args) throws java.lang.Exception
    {

        Stack<Integer> s = new Stack<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int temp = scan.nextInt();
            if(temp==1){
                s.push(scan.nextInt());
            }
            if(temp==2){
                s.pop();
            }
            if(temp==3){
                max(s);
            }
        }
    }
}
