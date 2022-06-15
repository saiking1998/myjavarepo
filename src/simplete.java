import java.util.Scanner;
import java.util.Stack;

public class simplete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<String> str = new Stack<>();
        String ans ="";
        str.push(ans);
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            if(temp ==1){
                String add = sc.next();
                str.push(ans);
                ans = ans+ add;
            }
            else if(temp == 2){
                str.push(ans);
                int k = sc.nextInt();
                ans = ans.substring(0, (ans.length()-k));
            }
            else if(temp == 3){
                int k = sc.nextInt();
                System.out.println(ans.charAt(k-1));
            }
            else{
                ans = str.pop();
            }
        }
    }
}
