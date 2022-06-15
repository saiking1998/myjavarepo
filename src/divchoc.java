import java.util.Arrays;
import java.util.Scanner;

public class divchoc {
    public static int getans(int[] arr,int n,int m){
       Arrays.sort(arr);

       int min = Integer.MAX_VALUE;
       if(m ==0 ) return 0;
       if(n==0) return 0;
       if(n<m) return -1;
        for(int i=0;i+m-1<n;i++){
                int temp = arr[i+m-1] -arr[i];
                if(temp <min){
                    min = temp;
            }
        }
        return  min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

      int   ans = getans(arr ,n,m);
        System.out.println(ans);
    }
}
