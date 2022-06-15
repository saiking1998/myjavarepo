import java.util.Scanner;
import java.util.Stack;

public class infixtopostfix{
  public  static  int  checksymb (Character ch){

        if(ch == '^'){
           return 3;
        }
        else if(ch =='*' || ch =='/'){
            return 2;
        }
        else if(ch =='+' || ch =='-'){
            return 1;
        }
        else{
            return -1;
        }


    }
    public static String checkstr(String str){
        String ans = "";
        Stack<Character> st = new Stack<>();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'  ){
                ans =ans + str.charAt(i);
            }
            else if(str.charAt(i)=='('){
                st.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')'){
                while(!st.isEmpty() && st.peek()!='(' ){
                    ans = ans + st.peek();
                    st.pop();
                }
                if(st.peek() =='('){
                    st.pop();
                }
            }
            else{
                while (!st.isEmpty() && checksymb(st.peek())>=checksymb(str.charAt(i))){
                    ans  = ans + st.peek();
                    st.pop();
                }
                st.push(str.charAt(i));
            }
        }
        while(!st.isEmpty()){
            ans = ans + st.peek();
            st.pop();
        }


        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
       String  ans = checkstr(str);
        System.out.println(ans);
    }
        }
