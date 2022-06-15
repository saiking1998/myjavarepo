import java.util.LinkedList;
import java.util.Scanner;

public class comparethelinkedlist {
    public static int checkthelists(int m,int n,LinkedList<Integer> list1,LinkedList<Integer> list2){

        if(m!=n){

            return 0;

        }
        else{
            for(int i=0;i<m;i++){
                int check = 0;
                for(int j=0;j<n;j++){
                    System.out.println(list1.get(i)+" "+list2.get(j));
                    if(list1.get(i).intValue() == list2.get(j).intValue()){
                        check=1;
                        break;
                    }
                }
                if(check==0){
                    return 0;
                }
            }

        }
        return 1;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner scan  = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for(int i=0;i<m;i++){
            int temp = scan.nextInt();
            list1.add(temp);
        }
        for(int i=0;i<n;i++){
            int temp = scan.nextInt();
            list2.add(temp);
        }
        System.out.println(checkthelists(m,n,list1,list2));
    }
}
