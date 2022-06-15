import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class countk {

    public static void main(String[] args) {
        //your code here
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int ans = 0;
        for(int i= 0;i<s.length(); i++){
            ans =ans + (int) (s.charAt(i)-96);
        }
        System.out.println(ans);
        if(ans%2 ==0){
            System.out.println("EVEN");
        }else System.out.println("ODD");

    }
}
