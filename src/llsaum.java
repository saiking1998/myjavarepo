import java.util.LinkedList;
import java.util.Scanner;

public class llsaum {

    public static int checkcarry(int x){
        if(x<10){
            return 0;
        }
        else{
            return x/10;
        }
    }
    public static void addele(int n , int m , LinkedList<Integer> list1, LinkedList<Integer> list2){
        LinkedList<Integer> ans = new LinkedList<Integer>();
        int carry =0;
        while(n>0 || m>0){

            if(n>0 && m>0){

                int temp = list1.get(n-1)+ list2.get(m-1)+carry;
                carry=  checkcarry(temp);
                if(carry>0){
                    ans.add(temp%10);
                }else{
                    ans.add(temp);
                }
            }
           else if( m>0){
                int temp1 = list2.get(m-1)+carry;
                carry=  checkcarry(temp1);
                if(carry>0){
                    ans.add(temp1%10);
                }else{
                    ans.add(temp1);
                }

            }
           else {
                int temp2 = list1.get(n-1)+carry;
                carry=  checkcarry(temp2);
                if(carry>0){
                    ans.add(temp2%10);
                }else{
                    ans.add(temp2);
                }
            }

            n--;
            m--;
        }
        for(int i=ans.size()-1;i>=0;i--){
            System.out.print(ans.get(i)+" ");
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            list1.add(scan.nextInt());
        }
        for(int i=0;i<m;i++){
            list2.add(scan.nextInt());
        }
        addele(n,m,list1,list2);
    }
}
