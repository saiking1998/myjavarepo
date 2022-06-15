import java.util.Scanner;
import java.util.Stack;

public class largestrectangle {

    public static int checkmax(int[] arr,int n){
        Stack <Integer> s = new Stack<>();
        int answ =0;
         int i=0;
         while(i<n){
           if (s.empty() || arr[s.peek()]<=arr[i]){
               s.push(i++);
           }
           else{
               int tp = s.peek();
               s.pop();
              int ans = arr[tp]*(s.empty() ? i:i-s.peek()-1);
               answ = Math.max(answ,ans);
           }
         }
         while(!s.empty()){
             int tp = s.peek();
             s.pop();
             int ans = arr[tp]*(s.empty() ? i:i-s.peek()-1);
             answ = Math.max(answ,ans);
         }


        return answ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans  =  checkmax(arr,n);
        System.out.println(ans);
    }
}
