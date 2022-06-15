import java.util.Arrays;
import java.util.Scanner;

public class obj {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] arr ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int rep = n/24;
        int pres  = n%24;
        String ans ="";
        int begin = 1;
        int end =0;
        do{

            for(int i=0;i<pres;i++){
                if(begin==1){
                    ans=arr[i]+ans;
                    System.out.print(ans);
                    begin=0;
                    end=1;
                }
                else{
                    ans = ans +arr[i];
                    System.out.print(ans);
                    begin =1;
                    end=0;
                }

            }


            pres= 24;
            rep--;

        }while(rep>0);
        System.out.print(ans);
    }
}
